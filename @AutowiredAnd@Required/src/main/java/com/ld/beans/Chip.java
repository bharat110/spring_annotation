package com.ld.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Chip {

	private int id;
	private String type;

	public int getId() {
		return id;
	}

	/*@Autowired*/
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Chip [id=" + id + ", type=" + type + "]";
	}

}
