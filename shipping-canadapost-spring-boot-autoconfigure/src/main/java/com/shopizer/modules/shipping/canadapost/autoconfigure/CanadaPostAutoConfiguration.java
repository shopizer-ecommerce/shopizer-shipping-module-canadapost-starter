package com.shopizer.modules.shipping.canadapost.autoconfigure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shopizer.modules.shipping.canadapost.config.CanadaPostQuoteModuleConfig;
import com.shopizer.modules.shipping.canadapost.module.CanadaPostQuoteModule;


/**
 * Will configure module runtime configuration for canadapost shipping
 * @author carlsamson
 *
 */
@Configuration
@ConditionalOnClass(CanadaPostQuoteModule.class)
public class CanadaPostAutoConfiguration {

    Logger logger = LoggerFactory.getLogger(CanadaPostAutoConfiguration.class);
    
    private String prodUrl ="https://soa-gw.canadapost.ca/rs/ship/price";
    private String devUrl = "https://ct.soa-gw.canadapost.ca/rs/ship/price";
    
    @Bean
    public CanadaPostQuoteModuleConfig moduleConfig() {

    	logger.info("autoconfigure [" + getClass().getName() + "]");

    	CanadaPostQuoteModuleConfig moduleConfig = new CanadaPostQuoteModuleConfig();
    	moduleConfig.setDevUrl(devUrl);
    	moduleConfig.setProdUrl(prodUrl);

        return moduleConfig;
    }
    
    @Bean
    public CanadaPostQuoteModule canadapost() {
    	
    	logger.info("instantiate [CanadaPostQuoteModule]");
    	
    	CanadaPostQuoteModule canadapost = new CanadaPostQuoteModule();
    	canadapost.setConfig(moduleConfig());
        return canadapost;
    }

}
