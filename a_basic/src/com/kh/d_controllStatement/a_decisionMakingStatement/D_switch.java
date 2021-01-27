package com.kh.d_controllStatement.a_decisionMakingStatement;

import java.util.Scanner;

public class D_switch {
	
	//변수의 값을 case에서 찾아 실행하는 조건문
	//(범위가 아니라 정확한 하나의 값)
	//해당하는 값이 case에 없으면 default문을 실행
	//[표현식]
	//switch(변수){
	//	case 1 : 실행문; break; //변수의 값이 1일때 실행
	//	case 2 : 실행문; break; //변수의 값이 2일때 실행
	//  default : 실행문  //변수의 값이 case에 없을 때 실행
	//  break; 이 없으면 다음 case문들과 default문을 모두 실행
	public static void main(String[] args) {
		D_switch test = new D_switch();
		test.testSwitch();
	}
	
	public void testSwitch() {
		
		//정수 두개와 산술연산기호 1개를 입력받아서
		//연산 기호 문자에 해당하는 계산을 수행하고 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값 : ");
		int firstNum = sc.nextInt();
		System.out.print("두번째 값 : ");
		int secondNum = sc.nextInt();
		System.out.print("연산자 : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
			case '+':result = firstNum + secondNum;  break;
			case '-':result = firstNum - secondNum; break;
			case '*' :result = firstNum * secondNum; break;
			case '/':result = firstNum / secondNum; break;
			case '%':result = firstNum % secondNum; break;
			default:System.out.println("연산자를 정확하게 입력하세요");
		}
		
		System.out.println("연산 결과 : " + result);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
