package com.kh.b_overloading.figure;

//도형의 넓이를 계산하는 클래스
public class Figure {
	
	//사각형의 넓이를 구하는 메서드
	public double calArea(Rectangle r) {
		//사각형의 넓이 : 가로 * 세로
		return r.getWidth() * r.getHeight();
	}
	
	//원의 넓이를 구하는 메서드
	public double calArea(Circle c) {
		//원의 넓이 : 파이 * r * r
		return Math.PI * c.getRadius() * c.getRadius();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
