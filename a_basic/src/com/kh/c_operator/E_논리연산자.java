package com.kh.c_operator;

import java.util.Scanner;

public class E_논리연산자 {
	
	// &&(그리고, ~면서) : 두 항이 다 true일 때 true
	// ||(또는, ~거나) :  두 항이 다 false 일 때 false
	public static void main(String[] args) {
		E_논리연산자 test = new E_논리연산자();
		//test.opTest();
		test.quize1();
	}
	
	public void opTest() {
		// || or 두 항이 모두 false일 때만 false
		// || 연산의 경우 앞의 연산에서 true가 나오면 이후 연산은 수행하지 않는다.
		System.out.println(2 >= 2 || 2 > 3); //true || false
		System.out.println(2 > 1 || 3 > 2); //true || true
		System.out.println(3 < 2 || 2 > 1); //false || true
		System.out.println(3 < 2 ||  2 < 1); //false || false
		
		System.out.println("=================================");
		
		//&& and 두 항이 모두 true일 때만 true
		System.out.println(3 < 2 && 2 > 1); //false && true
		System.out.println(3 < 2 && 2 < 1); //false && false
		System.out.println(3 > 2 && 2 < 1); //true && false
		System.out.println(3 > 2 && 2 > 1); //true && true
	}
	
	public void quize1() {
		//사용자가 입력한 문자가 알파벳 y인지 확인하는 코드를 작성하시오
		//대소문자는 상관이 없다. 'y', 'Y' 를 입력하면 true를 출력
		//사용자가 'y' 또는 'Y'가 아닌 문자를 입력하면 false 출력
		
		//사용자로부터 문자를 하나 입력받는다.
		//hint : B_키보드입력테스트.java
		//반드시 char 변수에 사용자가 입력한 값을 담아주세요
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		char input = sc.next().charAt(0);
		
		//사용자가 입력한 문자가 y 또는 Y인지 확인한다.
		//hint : D_비교연산자.java, E_논리연산자.java		
		boolean isTrue = input == 'y' || input == 'Y';
		
		//결과를 출력한다.
		System.out.println(isTrue);
	}
	
	
	
	
	
	
	
	
}
