package com.kh.b_variable;

import java.util.Scanner;

public class C_변수값변경테스트 {

	public static void main(String[] args) {
		C_변수값변경테스트 test = new C_변수값변경테스트();
		test.changeValue();
		System.out.println("changeValue 메서드 실행 끝");
	}
	
	//접근제한자 [예약어] 리턴타입 [예약어] 메서드명(매개변수)
	//접근제한자 : public, default, protected, private
	// public : 모든 패키지에서 메서드를 호출할 수 있음
	// default : 클래스가 속한 패키지 안에서만 메서드를 호출할 수 있음
	//	(default로 접근제한자를 지정할 때는 접근제한자를 생략한다)
	// protected : 클래스가 속한 패키지이거나 상속관계일때 메서드 호출가능
	// private : 같은 클래스 안에서만 메서드를 호출할 수 있음
	
	//리턴타입 : 메서드의 실행결과로 반환되는 타입을 작성(반환되는 값이 없으면 void)
	//메서드명(매개변수)
	//매개변수 : 메서드를 호출하는 쪽에서 보내주는 값을 받기위한 변수
	public void changeValue() //메서드 선언부
	{ 
		String name = "하명도";
		char gender = 'M';
		int age = 20;
		double height = 170.5;
		
		System.out.println(name + "님의 개인 정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요 : ");		
		//charAt() : 문자열의 원하는 위치에 있는 문자를 반환
		gender = sc.next().charAt(0);
		
		System.out.println("나이를 입력하세요 : ");		
		age = sc.nextInt();
		
		System.out.println("키(소수점 첫째자리) : ");
		height = sc.nextDouble();
		
		System.out.println("성별 : " + gender + " / 나이 : " + age 
				+ " / 키 : " + height);
	}
	
	
	
	
	
	
	
	
	
	
	

}
