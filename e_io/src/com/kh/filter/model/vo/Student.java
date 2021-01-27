package com.kh.filter.model.vo;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = -5618517446159616429L;
	private String name;
	private char gender;
	private Phone phone;
	
	public Student(String name, char gender, Phone phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public Phone getPhone() {
		return phone;
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", phone=" + phone + "]";
	}
}
