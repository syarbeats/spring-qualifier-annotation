package com.learning.spring.spring_qualifier_annotation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Assert;

public class BeanTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/app-config.xml");
		AirborneOperation airAsia = (AirborneOperation) context.getBean("airborneOperation");
		AirborneOperation klm = (AirborneOperation) context.getBean("airborneOperation");
	
		/*
		 * Bean scope is Singleton, so the object must be refer to the same bean object
		 * **/
		Assert.assertEquals(airAsia.getAreaName(), klm.getAreaName());
		((AbstractApplicationContext) context).close();
		
	}

}
