package com.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
@SpringBootTest
class DemoApplicationTests {
	 // public static	Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
	  

	@org.junit.Test
	public void test(){
	//	logger.info("Application executed....");
		assertEquals(true, true);
	}

}
