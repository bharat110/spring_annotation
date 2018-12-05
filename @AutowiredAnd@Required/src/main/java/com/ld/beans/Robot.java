package com.ld.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Robot {

	private Chip chip;
	private Sensor sensor;

	@Autowired
	public Robot(Sensor sensor) {
		this.sensor = sensor;
	}

	@Autowired
	public Robot(Chip chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
