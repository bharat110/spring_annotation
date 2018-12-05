package com.ld.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Robot {

	@Autowired
	private Chip chip;

	public Chip getChip() {
		return chip;
	}


	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
