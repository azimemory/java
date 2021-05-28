package com.kh.prac8.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7501939958268415124L;
	
	private String title;			// ������
	private String author;			// ����
	private int price;				// ����
	private Calendar dates;			// ���ǳ�¥
	private double discountRate;	// ������
	
	public Book() {}
	
	public Book(String title, String author, int price, Calendar dates, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discountRate = discountRate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calendar getDates() {
		return dates;
	}
	public void setDates(Calendar dates) {
		this.dates = dates;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� �Ⱓ ");
		String str=sdf.format(dates.getTime());
		return title+" "+author+" "+price+" "+str+discountRate;
	}
}
