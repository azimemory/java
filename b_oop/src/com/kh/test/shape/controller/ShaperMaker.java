package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle;

public class ShaperMaker {

	public static void main(String[] args) {
		
		Circle[] c = new Circle[3];
		c[0] = new Circle(20);
		c[1] = new Circle(40);
		c[2] = new Circle(50);
		
		for (Circle circle : c) {
			circle.draw();
		}
		
		System.out.println();
		
		RectAngle[] r = {
				new RectAngle(20,20)
				,new RectAngle(50,60)};
		
		for (RectAngle rectAngle : r) {
			rectAngle.draw();
		}
	}
}
