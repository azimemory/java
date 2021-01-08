package com.kh.d_controllStatement.a_decisionMakingStatement;

import java.util.Scanner;

public class B_ifElse {
	
	//양자택일 조건문
	//[표현식]
	//if(조건식){실행코드}else{실행코드}
	//조건이 참일 경우 실행할 코드와 조건이 거짓일 경우 실행할 코드를 작성하는 조건문
	public static void main(String[] args) {
		B_ifElse test = new B_ifElse();
		//test.testIfElse();
		test.quize1();
	}
	
	public void testIfElse() {
		//숫자를 하나 입력받아 홀수인지 짝수인지 판별하는 코드
		
		//숫자를 하나 입력 받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		//입력받은 숫자가 짝수인지
		if(num % 2 == 0) {
			//"짝수입니다" 출력
			System.out.println("짝수 입니다.");
		//아닌지		
		}else {
			//"홀수입니다" 출력
			System.out.println("홀수 입니다.");
		}
			
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void quize1() {
		//사용자로부터 숫자 하나를 입력받아서
		//숫자가 0보다 크면 '양수입니다'
		//0이면 '0'
		//0보다 작으면 '음수입니다'
		//를 출력하는 조건문 작성하기.
		//hint! : 조건문 안에 조건문 중첩해서 사용 가능.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력하세요 : " );
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수 입니다.");
		}else {
			if(num < 0) {
				System.out.println("음수입니다.");
			}else {
				System.out.println("0");
			}
		}
	}
	
	
	
	
	
	
	
	

}
