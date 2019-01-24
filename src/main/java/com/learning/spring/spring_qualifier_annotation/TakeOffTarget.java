package com.learning.spring.spring_qualifier_annotation;

import org.springframework.stereotype.Component;

import com.learning.spring.spring_qualifier_annotation._interface.Direction;


@Component("takeOffTarget")
public class TakeOffTarget implements Direction {

	private long latitude;
	private long longitude;
	private long altitude;
	
	@Override
	public void setCoordinate(long latitude, long longitude, long altitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}

	@Override
	public String getAreaName() {
		
		return "Terminal 2 - Shcippol Airport";
	}

	public String getCurrentOperation() {
		return "Takeoff to destination";
	}
}
