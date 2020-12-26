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
 * Sample code for the GetService Canada Post service.
 * <p> 
 * The GetService service  returns details of a given postal service in 
 * terms of the min/max weight and dimensions offered by the postal service. 
 * Also returned are details about the available add-on options. 
 * <p>
 * This sample is configured to access the Developer Program sandbox environment. 
 * Use your development key username and password for the web service credentials.
 * <p>
 *  Jersey REST client using JAXB for GetService Request.  <br>
 *  USAGE:<pre>
 *        GetServiceClient client = new GetServiceClient(username, password);
 *        ClientResponse response = client.getService();
 *        // do whatever with response
 *        client.close();
 *  </pre>
 *
 */
public class GetServiceClient {

    private Client aClient;
    private static final String LINK = "https://ct.soa-gw.canadapost.ca/rs/ship/service/DOM.EP?country=CA";
    
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
								
		// Execute GetService Request
        GetServiceClient myClient = new GetServiceClient(username, password);
        ClientResponse resp = myClient.getService();
        InputStream respIS = resp.getEntityInputStream();
        
        System.out.println("HTTP Response Status: " + resp.getStatus() + " " + resp.getClientResponseStatus());

        // Example of using JAXB to parse xml response
        JAXBContext jc;
        try {
        	jc = JAXBContext.newInstance(Service.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            // Determine whether response data matches Service schema.
            if (entity instanceof Service) {
            	Service services = (Service) entity;
                System.out.println("Service Code: " + services.getServiceCode());
                System.out.println("Service Name: " + services.getServiceName() + "\n");

                System.out.println("Options:");            	
            	for (Iterator<Service.Options.Option> iter = services.getOptions().getOptions().iterator(); iter.hasNext();) { 
            		Service.Options.Option aItem = (Service.Options.Option) iter.next();                	
                    System.out.println("Option Code: " + aItem.getOptionCode());
                    System.out.println("Option Name: " + aItem.getOptionName());
                    System.out.println("Href: " + aItem.getLink().getHref() + "\n");
                }            	
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

    public GetServiceClient(String username, String password) {
        ClientConfig config = new DefaultClientConfig();
        aClient = Client.create(config);
        aClient.addFilter(new com.sun.jersey.api.client.filter.HTTPBasicAuthFilter(username, password));
    }

    public ClientResponse getService() throws UniformInterfaceException {
    	WebResource aWebResource = aClient.resource(LINK);
        return aWebResource.accept("application/vnd.cpc.ship.rate-v4+xml").acceptLanguage("en-CA").get(ClientResponse.class);
    }

    public void close() {
        aClient.destroy();
    }
}
