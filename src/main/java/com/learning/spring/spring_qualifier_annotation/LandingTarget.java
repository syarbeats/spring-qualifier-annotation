package com.learning.spring.spring_qualifier_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.learning.spring.spring_qualifier_annotation._interface.Direction;


@Component("landingTarget")
public class LandingTarget implements Direction {

	private long latitude;
	private long longitude;
	private long altitude;
	
	@PostConstruct
	public void initialization() {
		System.out.println("This method will be invoked firstly once the object created...");
	}
	
	@PreDestroy
	public void clearCache()
	{
		System.out.println("This method will be invoked before the object destroyed...");
	}
	
	public void setCoordinate(long latitude, long longitude, long altitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;

	}

	public String getAreaName() {
		return "Guadalajara Airport";
	}
	
	public String getCurrentOperation() {
		return "Landing to ";
	}
	

}
