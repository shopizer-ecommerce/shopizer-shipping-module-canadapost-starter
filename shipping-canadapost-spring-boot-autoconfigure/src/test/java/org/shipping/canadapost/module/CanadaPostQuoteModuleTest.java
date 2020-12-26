package org.shipping.canadapost.module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.salesmanager.core.model.common.Delivery;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.country.Country;
import com.salesmanager.core.model.reference.zone.Zone;
import com.salesmanager.core.model.shipping.PackageDetails;
import com.salesmanager.core.model.shipping.ShippingConfiguration;
import com.salesmanager.core.model.shipping.ShippingOption;
import com.salesmanager.core.model.shipping.ShippingOrigin;
import com.salesmanager.core.model.shipping.ShippingQuote;
import com.salesmanager.core.model.system.IntegrationConfiguration;
import com.salesmanager.core.model.system.IntegrationModule;
import com.salesmanager.core.model.system.ModuleConfig;
import com.salesmanager.core.modules.integration.IntegrationException;
import com.shopizer.modules.shipping.canadapost.autoconfigure.CanadaPostAutoConfiguration;
import com.shopizer.modules.shipping.canadapost.module.CanadaPostQuoteModule;

@SpringBootTest
@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@ContextConfiguration(classes = CanadaPostAutoConfiguration.class)
//@Ignore
public class CanadaPostQuoteModuleTest {
	
	@Autowired
	private CanadaPostQuoteModule canadapost;




	/**
	 * Rigourous Test :-)
	 * @throws IntegrationException 
	 */
	@Test
	public void testCanadaPostQuoteModule() throws IntegrationException {
		//assertTrue(true);

		String username = System.getenv("userName");
		String password = System.getenv("password");
		String mailedBy = System.getenv("account");
		String env = System.getenv("environment");

		ShippingQuote quote = new ShippingQuote();
		PackageDetails pDetail = new PackageDetails();
		pDetail.setShippingHeight(10);
		pDetail.setShippingLength(10);
		pDetail.setShippingWeight(10);
		pDetail.setShippingWidth(10);
		List<PackageDetails> details = new ArrayList<PackageDetails>();
		details.add(pDetail);

		Delivery delivery = new Delivery();
		delivery.setAddress("348 Du Languedoc");
		delivery.setCity("Boucherville");
		delivery.setPostalCode("J4B 8J8");

		Country country = new Country();
		country.setIsoCode("CA");
		country.setName("Canada");
		delivery.setCountry(country);

		Zone zone = new Zone();
		zone.setCode("QC");
		zone.setName("Quebec");

		delivery.setZone(zone);

		ShippingOrigin origin = new ShippingOrigin();
		origin.setAddress("7070, avenue Henri-Julien");
		origin.setCity("Montreal");
		origin.setPostalCode("H2S 3S3");
		origin.setZone(zone);
		origin.setCountry(country);

		IntegrationModule module = new IntegrationModule();
		
		/**
		 * no more required
		 */
		ModuleConfig moduleConfigTest = new ModuleConfig();
		moduleConfigTest.setEnv("TEST");
		ModuleConfig moduleConfigProd = new ModuleConfig();
		moduleConfigProd.setEnv("PROD");

		Map<String, ModuleConfig> moduleConfigs = new HashMap<String, ModuleConfig>();
		moduleConfigs.put("TEST", moduleConfigTest);
		moduleConfigs.put("PROD", moduleConfigProd);
		module.setModuleConfigs(moduleConfigs);
		/**
		 * end no more required
		 */

		module.setCode("canadapost");
		module.setModuleConfigs(moduleConfigs);

		IntegrationConfiguration configuration = new IntegrationConfiguration();
		configuration.setActive(true);
		configuration.setEnvironment(env);

		Map<String, String> integrationKeys = new HashMap<String, String>();
		integrationKeys.put("username", username);
		integrationKeys.put("password", password);
		integrationKeys.put("account", mailedBy);

		configuration.setIntegrationKeys(integrationKeys);

		Map<String, List<String>> integrationOptions = new HashMap<String, List<String>>();

		/**
		 * DOM.RP Regular Parcel DOM.EP Expedited Parcel DOM.XP Xpresspost
		 * DOM.XP.CERT Xpresspost Certified DOM.PC Priority DOM.DT Delivered
		 * Tonight DOM.LIB Library Books USA.EP Expedited Parcel USA USA.PW.ENV
		 * Priority Worldwide Envelope USA USA.PW.PAK Priority Worldwide pak USA
		 * USA.PW.PARCEL Priority Worldwide Parcel USA USA.SP.AIR Small Packet
		 * USA Air USA.TP Tracked Packet – USA USA.TP.LVM Tracked Packet – USA
		 * (LVM) (large volume mailers) USA.XP Xpresspost USA INT.XP Xpresspost
		 * International INT.IP.AIR International Parcel Air INT.IP.SURF
		 * International Parcel Surface INT.PW.ENV Priority Worldwide Envelope
		 * Int’l INT.PW.PAK Priority Worldwide pak Int’l INT.PW.PARCEL Priority
		 * Worldwide parcel Int’l INT.SP.AIR Small Packet International Air
		 * INT.SP.SURF Small Packet International Surface INT.TP Tracked Packet
		 * – International
		 */

		List<String> domestic = new ArrayList<String>();
		domestic.add("DOM.RP");
		integrationOptions.put("services-domestic", domestic);
		configuration.setIntegrationOptions(integrationOptions);

		ShippingConfiguration shippingConfiguration = new ShippingConfiguration();
		shippingConfiguration.setTaxOnShipping(false);
		
		MerchantStore store = new MerchantStore();

		List<ShippingOption> options = canadapost.getShippingQuotes(quote, details, null, delivery, origin, store,
				configuration, module, shippingConfiguration, Locale.CANADA);

		//assertNotNull("Options should not be empty", options);

		for (ShippingOption opt : options) {
			System.out.println(opt.getOptionCode() + " " + opt.getOptionPrice().doubleValue());
		}

		System.out.println("Done ...");

	}

}
