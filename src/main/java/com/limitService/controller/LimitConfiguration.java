/**
 * 
 */
package com.limitService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author jyotibikashsahoo
 *
 */
@Configuration
@ConfigurationProperties(prefix = "limit-service")
@PropertySource("classpath:limitConfiguration.properties")
public class LimitConfiguration {

	@Value("${maximumLimit}")
	private int maximumLimit;
	
	@Value("${minimumLimit}")
	private int minimumLimit;
	
	private int confMaximum;
	
	private int confMinimum;

	public int getMaximumLimit() {
		return maximumLimit;
	}

	public int getMinimumLimit() {
		return minimumLimit;
	}

	public int getConfMaximum() {
		return confMaximum;
	}

	public void setConfMaximum(int confMaximum) {
		this.confMaximum = confMaximum;
	}

	public int getConfMinimum() {
		return confMinimum;
	}

	public void setConfMinimum(int confMinimum) {
		this.confMinimum = confMinimum;
	}
	
	public String testValues() {
		
		return "The Maximum , minimum , confMaximum and confMinimum limits are " + getMaximumLimit() + " " +getMinimumLimit() + 
				" "+getConfMaximum() +" " +getConfMinimum()+ " respectively";
		
	}
}
