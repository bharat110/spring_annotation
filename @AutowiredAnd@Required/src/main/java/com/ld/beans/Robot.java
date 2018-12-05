package com.ld.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Robot {

	private Chip chip;
	private Sensor sensor;

	@Autowired(required = false)
	public Robot(Chip chip) {
		this.chip = chip;
	}

	@Autowired(required = false)
	public Robot(Sensor sensor) {
		this.sensor = sensor;
	}

	@Autowired(required=false)
	public Robot(Chip chip, Sensor sensor) {
		this.chip = chip;
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + ", sensor=" + sensor + "]";
	}

}
