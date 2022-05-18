package com.adak.retailsales;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RetailSalesApplication {

	public static Logger logger = LoggerFactory.getLogger(RetailSalesApplication.class);

	@PostConstruct
	public void intt(){
		logger.info("Application started ... ");
	}

	public static void main(String[] args) {
		logger.info("Application started ....");
		SpringApplication.run(RetailSalesApplication.class, args);
	}

}
