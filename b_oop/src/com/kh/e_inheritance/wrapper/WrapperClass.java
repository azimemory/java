package com.kh.e_inheritance.wrapper;

import java.util.Scanner;

public class WrapperClass {
	
	//wrapper class : primitive 타입을 객체로 다루기 위해 제공되는 클래스
	//byte -> Byte
	//short -> Short
	//int -> Integer
	//float -> Float
	//double -> Double
	//char -> Character
	//boolean -> Boolean
	
	public void printVarSize() {
		//타입의 사이즈
		System.out.println("byte의 크기  : " + Byte.BYTES + "byte");
		System.out.println("short의 크기 : " + Short.BYTES + "byte");
		System.out.println("int의 크기 : " + Integer.BYTES + "byte");
		System.out.println("long의 최대값 : " + Long.MAX_VALUE);
		System.out.println("float의 최대값 : " + Float.MAX_VALUE);
		System.out.println("double의 최소값 : " + Double.MIN_VALUE);
		System.out.println("boolean의 최대값 : " + Boolean.TRUE);
		System.out.println("chgar의 최대값 : " + Character.MAX_VALUE);
	}
	
	public void parse() {
		//parse : 데이터를 변환하는 것
		//문자열을 기본타입으로 변환해주는 메서드
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//타입별 파싱 메서드
		byte bnum = Byte.parseByte(str);
		short snum = Short.parseShort(str);
		int inum = Integer.parseInt(str);
		long lnum = Long.parseLong(str);
		double dnum = Double.parseDouble(str);
		float fnum = Float.parseFloat(str);
		
		System.out.println("bnum : " + bnum);
		System.out.println("snum : " + snum);
		System.out.println("inum : " + inum);
		System.out.println("lnum : " + lnum);
		System.out.println("dnum : " + dnum);
		System.out.println("fnum : " + fnum);
		
	}
	
	
	
	
	

}
