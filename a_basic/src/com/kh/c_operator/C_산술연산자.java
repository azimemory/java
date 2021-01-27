package com.kh.c_operator;

public class C_산술연산자 {

	public static void main(String[] args) {
		//산술연산자 : + , - , *, / ,%
		int firstNum = 10;
		int secondNum = 3;
		double dnum = 3;
		
		System.out.println(" + :" + (firstNum + secondNum));
		System.out.println(" - :" + (firstNum - secondNum));
		System.out.println(" * :" + (firstNum * secondNum));
		System.out.println(" / :" + (firstNum / secondNum));
		System.out.println(" / :" + (firstNum / dnum));
		System.out.println(" % :" + (firstNum % secondNum));
		
		//짝수 홀수 여부 판단
		System.out.println("firstNum은 짝수 인가요? : " + (firstNum % 2 == 0));
		//배수 판단
		System.out.println("firstNum은 5의 배수인가요? : " + (firstNum % 5 == 0));
		System.out.println("secondNum은 5의 배수인가요? : " + (secondNum % 5 == 0));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
