package com.kh.test;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = -625991626522845290L;
	private String title;
	private int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
}
