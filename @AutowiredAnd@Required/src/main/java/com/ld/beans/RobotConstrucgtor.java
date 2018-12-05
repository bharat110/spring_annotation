package com.ld.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class RobotConstrucgtor {

	private Chip chip;

	private Sensor sensor;

	@Autowired
	public RobotConstrucgtor(Chip chip) {
		this.chip = chip;
	}

	@Autowired
	public RobotConstrucgtor(Sensor sensor) {
		this.sensor = sensor;
	}

}
