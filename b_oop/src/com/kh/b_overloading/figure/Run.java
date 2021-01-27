package com.kh.b_overloading.figure;

public class Run {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setRadius(5);
		
		Rectangle r = new Rectangle();
		r.setWidth(5.5);
		r.setHeight(6.6);
		
		Figure figure = new Figure();
		System.out.println("사각형의 넓이 : " + figure.calArea(r));
		System.out.println("원의 넓이 : " + figure.calArea(c));
		
		

	}
}
