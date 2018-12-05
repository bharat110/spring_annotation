package com.ld.beans;

public class Sensor {

	private int id;
	private String range;

	public Sensor(int id, String range) {
		this.id = id;
		this.range = range;
	}

	@Override
	public String toString() {
		return "Sensor [id=" + id + ", range=" + range + "]";
	}

}
