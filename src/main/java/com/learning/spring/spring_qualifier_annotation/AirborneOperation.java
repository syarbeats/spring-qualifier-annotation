package com.learning.spring.spring_qualifier_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.learning.spring.spring_qualifier_annotation._interface.AutoPilot;
import com.learning.spring.spring_qualifier_annotation._interface.Direction;



@Service("airborneOperation")
@Scope("singleton")
public class AirborneOperation implements AutoPilot{

	private String airLine;
	
	@Autowired
	@Qualifier("takeOffTarget")
	private Direction direction;

	public Direction getDirection() {
		return direction;
	}

	@Override
	public void SetDirection(Direction direction) {
		this.direction = direction;
		
	}

	@Override
	public String getCurrentOperation() {
		return direction.getCurrentOperation();
	}

	public String getAreaName() {
		return direction.getAreaName();
	}

	public String getAirLine() {
		return airLine;
	}

	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}
}
