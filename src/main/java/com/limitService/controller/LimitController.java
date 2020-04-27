/**
 * 
 */
package com.limitService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limitService.model.Limit;

/**
 * @author jyotibikashsahoo
 *
 */
@RestController
@RequestMapping("/limit")
public class LimitController {

	private static final Logger logger = LoggerFactory.getLogger(LimitController.class);

	@Autowired
	private Limit limit;

	@Autowired
	private LimitConfiguration configuration;

	@GetMapping("/getLimit")
	public String getLimit() {
		Limit limit1 = new Limit();
		logger.info("The Maximum , minimum , confMaximum and confMinimum limits are " + limit.getMaximumLimit() + " "
				+ limit.getMinimumLimit() + " " + limit.getConfMaximum() + " " + limit.getConfMinimum()
				+ " respectively");
		logger.info(limit1.testValues());
		return "The Maximum , minimum , confMaximum and confMinimum limits are " + limit.getMaximumLimit() + " "
				+ limit.getMinimumLimit() + " " + limit.getConfMaximum() + " " + limit.getConfMinimum()
				+ " respectively";
	}

	@GetMapping("/getLimits")
	public Limit getLimits() {
		return new Limit(configuration.getMaximumLimit(), configuration.getMinimumLimit(),
				configuration.getConfMaximum(), configuration.getConfMinimum());
	}

}
