package com.kh.c_operator;

public class B_증감연산자 {

	public static void main(String[] args) {
		B_증감연산자 test = new B_증감연산자();
		//test.test1();
		test.quize1();
	}
	
	public void test1() {
		//증감연산자는 값을 1씩 증가 시키거나 감소 시킨다.
		// ++ : 1 증가, -- : 1 감소
		//전위연산자(++변수) : 계산(출력, 연산, 대입)을 처리하기 전에 증감
		//후위연산자(변수--) : 계산을 먼저 처리하고 증가나 감소가 발생한다.
		
		int firstNum = 10;
		int secondNum = 100;
		
		++firstNum; //11
		System.out.println("++firstNum의 결과는 ? " + firstNum);
		firstNum++; //12
		System.out.println("firstNum++의 결과는 ? " + firstNum);
		
		//출력문 안에서 전위연산자 사용
		System.out.println("--firstNum의 결과는 ? " + --firstNum); //11
		System.out.println("firstNum--의 결과는 ? " + firstNum--); //11
		System.out.println("firstNum : " + firstNum); //10
		System.out.println("quize! : " + --firstNum); //9
		
		System.out.println("==================================");
		
		firstNum = 10;
		secondNum = 100;
		System.out.println("firstNum + secondNum = " + (firstNum + secondNum));
		System.out.println("++firstNum + secondNum = " + (++firstNum + secondNum));
		System.out.println("firstNum + --secondNum = " + (firstNum + --secondNum));
		System.out.println("firstNum + secondNum-- = " + (firstNum + secondNum--));
		System.out.println("firstNum:" + firstNum + "/secondNum:" + secondNum);
	}
	
	public void quize1() {
		
		int firstNum = 10;
		int secondNum = 5;
		int thirdNum = firstNum + secondNum++; //thirdNum : 15
											//secondNum : 6
		
		// firstNum++ + --secondNum + thirdNum++ 의 결과값은?
		// 위의 연산이후 각 firstNum , secondNum, thirdNum의 값은?
		System.out.println("연산 결과 : " + (firstNum++ + --secondNum + thirdNum++));
		System.out.println("firstNum : " + firstNum);
		System.out.println("secondNum : " + secondNum);
		System.out.println("thirdNum : " + thirdNum);
	}
	
	
	
	
	
	
	
	
	
	
}


