package com.kh.c_operator;

import java.util.Scanner;

public class F_삼항연산자 {
	//조건식?true일때 연산 또는 값:false일때 연산 또는 값
	public static void main(String[] args) {
		F_삼항연산자 test = new F_삼항연산자();
		//test.opTest01();
		test.opTest2();
		//test.quize1();
	}
	
	public void opTest01() {
		int first = 2;
		int second = 3;
		int res = first>second? first+second : first-second;
		System.out.println("res : " + res);
		
		String result = first < second?"a가 b보다 작다":"a가 b보다 크다";
		System.out.println("result : " + result);
	}
	
	//사용자로부터 하나의 문자를 입력받아
	//입력받은 문자가 'y' 또는 'Y'라면 'y를 입력하셨습니다.'
	//입력받은 문자가 'y' 또는 'Y'가 아니라면 '잘못 입력하셨습니다.' 
	//를 출력하는 코드를 작성하시오.
	public void quize1() {
		//사용자로부터 하나의 문자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char input = sc.next().charAt(0);
		
		//사용자가 입력한 문자가 y or Y 인지 확인한다.
		//위의 조건이 true : 'y를 입력하셨습니다.' 출력
		//위의 조건이 false : '잘못 입력하셨습니다.' 출력 
		String res = input == 'y' || input == 'Y'
									?input + "를 입력하셨습니다."
									:"잘 못 입력하셨습니다.";
		
		//결과를 출력한다.
		System.out.println(res);
	}

	//사용자로부터 하나의 숫자를 입력받는다.
	//사용자가 입력한 숫자가 0보다 크면 '양수'출력
	//0이면 '0'출력
	//0보다 작으면 '음수' 출력
	public void opTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		//권장되지 않는 방식 : 가독성이...
		String result = num > 0?"양수":num < 0?"음수":"0";
		System.out.println(result);
	}
	
	
	
	
}
