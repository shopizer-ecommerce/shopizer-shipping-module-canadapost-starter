package ca.canadapost.cpcdp.rating;

import ca.canadapost.cpcdp.rating.generated.messages.Messages;
import ca.canadapost.cpcdp.rating.generated.discovery.*;

import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.*;

import javax.xml.bind.JAXBContext;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

/**
 * Sample code for the GetOptions Canada Post service.
 * <p> 
 * The GetOptions service  returns information about a given add-on option such 
 * as how it is used and whether it requires or conflicts with other options. 
 * <p>
 * This sample is configured to access the Developer Program sandbox environment. 
 * Use your development key username and password for the web service credentials.
 * <p>
 *  Jersey REST client using JAXB for GetOption Request.  <br>
 *  USAGE:<pre>
 *        GetOptionClient client = new GetOptionClient(username, password);
 *        ClientResponse response = client.getOption();
 *        // do whatever with response
 *        client.close();
 *  </pre>
 *
 */
public class GetOptionClient {

    private Client aClient;
    private static final String LINK = "https://ct.soa-gw.canadapost.ca/rs/ship/option/DC";
    
    // Main class for local testing only
    public static void main(String[] args) {
    	
       	// Your username and password are imported from the following file   	
    	// CPCWS_Rating_Java_Samples/user.properties 
    	Properties userProps = new Properties();
    	FileInputStream propInputStream;
		try {
			propInputStream = new FileInputStream("user.properties");
			userProps.load(propInputStream);
			propInputStream.close(); // better in finally block
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
			return;
		}
    	String username = userProps.getProperty("username");
    	String password = userProps.getProperty("password");
		
		// Execute GetOption Request
        GetOptionClient myClient = new GetOptionClient(username, password);
        ClientResponse resp = myClient.getOption();
        InputStream respIS = resp.getEntityInputStream();
        
        System.out.println("HTTP Response Status: " + resp.getStatus() + " " + resp.getClientResponseStatus());

        // Example of using JAXB to parse xml response
        JAXBContext jc;
        try {
        	jc = JAXBContext.newInstance(Option.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            // Determine whether response data matches Option schema.
            if (entity instanceof Option) {
            	Option options = (Option) entity;
                System.out.println("Option Code: " + options.getOptionCode());
                System.out.println("Option Name: " + options.getOptionName());
                System.out.println("Option Class: " + options.getOptionClass());
                System.out.println("Print on Label: " + options.isPrintsOnLabel());
                System.out.println("Qualifier Required: " + options.isQualifierRequired());          	
            } else {
                // Assume Error Schema
                Messages messageData = (Messages) entity;
                for (Iterator<Messages.Message> iter = messageData.getMessage().iterator(); iter.hasNext();) {
                    Messages.Message aMessage = (Messages.Message) iter.next();
                    System.out.println("Error Code: " + aMessage.getCode());
                    System.out.println("Error Msg: " + aMessage.getDescription());
                }
            }
        } catch (Exception e) {
        	e.printStackTrace(System.out);
        }

        myClient.close();
    }

    public GetOptionClient(String username, String password) {
        ClientConfig config = new DefaultClientConfig();
        aClient = Client.create(config);
        aClient.addFilter(new com.sun.jersey.api.client.filter.HTTPBasicAuthFilter(username, password));
    }

    public ClientResponse getOption() throws UniformInterfaceException {    	
    	WebResource aWebResource = aClient.resource(LINK);
        return aWebResource.accept("application/vnd.cpc.ship.rate-v4+xml").acceptLanguage("en-CA").get(ClientResponse.class);
    }

    public void close() {
        aClient.destroy();
    }
}
