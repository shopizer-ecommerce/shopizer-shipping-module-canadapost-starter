package ca.canadapost.cpcdp.rating;

import ca.canadapost.cpcdp.rating.generated.messages.Messages;
import ca.canadapost.cpcdp.rating.generated.rating.*;
import ca.canadapost.cpcdp.rating.generated.rating.MailingScenario.Destination;
import ca.canadapost.cpcdp.rating.generated.rating.MailingScenario.Destination.Domestic;

import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.*;

import javax.xml.bind.JAXBContext;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import java.math.*;

/**
 * Sample code for the GetRates Canada Post service.
 * <p>
 * The GetRates service returns a list of shipping services, prices and transit times 
 * for a given item to be shipped. 
 * <p>
 * This sample is configured to access the Developer Program sandbox environment. 
 * Use your development key username and password for the web service credentials.
 * <p>
 *  Jersey REST client using JAXB for GetRates Request.  <br>
 *  USAGE:<pre>
 *        GetRatesClient client = new GetRatesClient(username, password);
 *        ClientResponse response = client.createMailingScenario(mailingScenario);
 *        // do whatever with response
 *        client.close();
 *  </pre>
 *
 */
public class GetRatesClient {

    private Client aClient;
    private static final String LINK = "https://ct.soa-gw.canadapost.ca/rs/ship/price";
    
    // Main class for local testing only
    public static void main(String[] args) {
    	
       	// Your username, password and customer number are imported from the following file    	
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
    	String mailedBy = userProps.getProperty("mailedBy"); 
		
		// Create GetRates XML Request Object
		MailingScenario mailingScenario = new MailingScenario();
		
		mailingScenario.setCustomerNumber(mailedBy);

		MailingScenario.ParcelCharacteristics parcelCharacteristics = new MailingScenario.ParcelCharacteristics();
		parcelCharacteristics.setWeight(new BigDecimal(1));
		mailingScenario.setParcelCharacteristics(parcelCharacteristics);
		
		mailingScenario.setOriginPostalCode("K2B8J6");

		Domestic domestic = new Domestic();
		domestic.setPostalCode("J0E1X0");		
		Destination destination = new Destination();
		destination.setDomestic(domestic);
		mailingScenario.setDestination(destination);
		
		// Execute GetRates Request
        GetRatesClient myClient = new GetRatesClient(username, password);
        ClientResponse resp = myClient.createMailingScenario(mailingScenario);
        InputStream respIS = resp.getEntityInputStream();
        
        System.out.println("HTTP Response Status: " + resp.getStatus() + " " + resp.getClientResponseStatus());

        // Example of using JAXB to parse xml response
        JAXBContext jc;
        try {
        	jc = JAXBContext.newInstance(PriceQuotes.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            // Determine whether response data matches GetRatesInfo schema.
            if (entity instanceof PriceQuotes) {
            	PriceQuotes priceQuotes = (PriceQuotes) entity;
                for (Iterator<PriceQuotes.PriceQuote> iter = priceQuotes.getPriceQuotes().iterator(); iter.hasNext();) { 
                	PriceQuotes.PriceQuote aPriceQuote = (PriceQuotes.PriceQuote) iter.next();                	
	                System.out.println("Service Name: " + aPriceQuote.getServiceName());
	                System.out.println("Price: $" + aPriceQuote.getPriceDetails().getDue() + "\n");
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

    public GetRatesClient(String username, String password) {
        ClientConfig config = new DefaultClientConfig();
        aClient = Client.create(config);
        aClient.addFilter(new com.sun.jersey.api.client.filter.HTTPBasicAuthFilter(username, password));
    }

    public ClientResponse createMailingScenario(Object xml) throws UniformInterfaceException {
        WebResource aWebResource = aClient.resource(LINK);
        return aWebResource.accept("application/vnd.cpc.ship.rate-v4+xml").header("Content-Type", "application/vnd.cpc.ship.rate-v4+xml").acceptLanguage("en-CA").post(ClientResponse.class, xml);
    }

    public void close() {
        aClient.destroy();
    }
}
