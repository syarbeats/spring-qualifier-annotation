package com.learning.spring.spring_qualifier_annotation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Assert;

public class BeanTest {

	private static final String KLM = "KLM";
	private static final String AIRASIA = "Air Asia";
	
	@Before
	public void setUp() throws Exception {
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testtestSingletonBeanScope() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/app-config.xml");
		AirborneOperation airAsia = (AirborneOperation) context.getBean("airborneOperation");
		AirborneOperation klm = (AirborneOperation) context.getBean("airborneOperation");
	
		airAsia.setAirLine(AIRASIA);
		
		/*
		 * Bean scope is Singleton, so the object must be refer to the same bean object
		 * **/
		Assert.assertEquals(airAsia.getAreaName(), klm.getAreaName());
		
		Assert.assertEquals(airAsia.getAirLine(), klm.getAirLine());
		((AbstractApplicationContext) context).close();
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testPrototypeBeanScope() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/app-config.xml");
		AirborneOperationDuo airAsia = (AirborneOperationDuo) context.getBean("airborneOperationDuo");
		AirborneOperationDuo klm = (AirborneOperationDuo) context.getBean("airborneOperationDuo");
	
		airAsia.setAirLine(AIRASIA);
		klm.setAirLine(KLM);
		
		/*
		 * Bean scope is Prototype, so the new created object must be refer to the different bean object
		 * **/
		Assert.assertEquals(AIRASIA, airAsia.getAirLine());
		
		Assert.assertEquals(KLM, klm.getAirLine());
		((AbstractApplicationContext) context).close();
		
	}

}
