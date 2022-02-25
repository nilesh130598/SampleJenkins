package com.example;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
  public static	Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
	@PostConstruct
	public void init(){
		logger.info("Application Started....");
	}
	public static void main(String[] args) {
		logger.info("Application executed....");
		logger.info("Application executed second time....");
		logger.info("Application executed second time....");
		SpringApplication.run(DemoApplication.class, args);
	}
	
	

}
