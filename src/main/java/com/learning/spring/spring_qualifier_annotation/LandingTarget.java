package com.learning.spring.spring_qualifier_annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.learning.spring.spring_qualifier_annotation._interface.Direction;


@Component("landingTarget")
public class LandingTarget implements Direction {

	private long latitude;
	private long longitude;
	private long altitude;
	
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
