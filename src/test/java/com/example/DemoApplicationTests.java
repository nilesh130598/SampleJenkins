package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RunWith(MockitoJUnitRunner.class)
public class DemoApplicationTests {
	  public static	Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
	  

	@Test
	public void test(){
		
		assertEquals(true, true);
	}

}
