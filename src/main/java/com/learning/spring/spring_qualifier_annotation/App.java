package com.learning.spring.spring_qualifier_annotation;

import org.springframework.context.support.GenericXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-config.xml");
        ctx.refresh();
        
        AirborneOperation operation = (AirborneOperation) ctx.getBean("airborneOperation", AirborneOperation.class);
        System.out.println(operation.getCurrentOperation()+operation.getAreaName());
        ctx.close();
    }
}
