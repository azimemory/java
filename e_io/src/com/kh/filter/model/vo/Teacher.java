package com.kh.filter.model.vo;

import java.io.Serializable;

public class Teacher implements Serializable{
	
	private static final long serialVersionUID = 5229422018627212748L;
	private String mainClass;
	private String name;
	
	public Teacher(String mainClass, String name) {
		super();
		this.mainClass = mainClass;
		this.name = name;
	}

	public String getMainClass() {
		return mainClass;
	}

	public void setMainClass(String mainClass) {
		this.mainClass = mainClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [mainClass=" + mainClass + ", name=" + name + "]";
	}
}
