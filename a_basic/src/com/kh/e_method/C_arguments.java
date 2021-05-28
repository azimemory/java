package com.kh.e_method;

import java.util.Scanner;

public class C_arguments {
	
	//필드변수
	//필드변수(멤버변수(일반변수), 클래스변수(static 변수))
	//sc는 멤버변수이다.
	Scanner sc = new Scanner(System.in);
	
	// 접근제한자 반환형 메서드명(매개변수)
	// 매개변수 : 메서드를 호출하는 쪽에서 보내주는 데이터(전달인자)를 보관할 변수
	// 매개변수의 개수에는 제한이 없음
	
	//두 정수를 매개변수로 전달받아 
	//두 정수의 합을 구하고
	//결과값을 반환하는 메서드
	public int plus(int firstNum, int secondNum) {
		return firstNum + secondNum;		
	}
	
	//두 실수를 매개변수로 전달받아
	//첫번째 매개변수를 두번째 매개변수로 나누고, 그 결과값을 반환하는 메서드
	//나눈 결과값은 실수로 반환.
	//매개변수를 '...' 를 사용하면, 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용가능
	public double div(double firstNum, double secondNum) {
		double res = firstNum/secondNum;
		return res;
	}
	
	//매개변수로 알파벳 문자를 하나 전달받아
	//알파벳이 소문자라면 대문자로, 대문자라면 소문자로 변환해서 반환하는 메서드
	public char convertCase(char alpha) {
		//매개변수로 넘어온 문자가 대문자인지 소문자인지 판단.
		if(alpha >= 'A' && alpha <= 'Z') {
			alpha += 32;
		}else if(alpha >= 'a' && alpha <= 'z') {
			alpha -= 32;			
		}else {
			System.out.println("알파벳이 아닙니다.");
		}
		
		return alpha;
	}
	
	//매개변수로 두 정수를 전달 받아 산술연산을 수행하는 메서드를 작성하시오
	//사용자로부터 입력받은 산술연산자에 해당하는 연산을 수행하여야 합니다.
	//산술연산의 결과는 정수형으로 반환하시오.
	//메서드 이름 : cal, 접근제한자 : public
	public int cal(int firstNum, int secondNum) {
		
		//지역변수
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		if(op == '+') {
			result = firstNum + secondNum;
		}else if(op == '-') {
			result = firstNum - secondNum;
		}else if(op == '*') {
			result = firstNum * secondNum;
		}else if(op == '/') {
			result = firstNum/secondNum;
		}else if(op == '%') {
			result = firstNum % secondNum;
		}
		
		return result;
	}
}
