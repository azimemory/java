package com.kh.c_operator;

public class D_비교연산자 {
	//비교연산자(관계연산자)
	//두 개의 변수의 관계를 판단하는 연산자.
	//조건을 만족하면 true, 만족하지 못하면 false
	// < , > , <= , >= , == , !=
	public static void main(String[] args) {
		//변수의 타입이 같다면 한줄에 여러개 변수의 선언 및 초기화 가능
		int firstNum = 10, secondNum = 20;
		System.out.println("firstNum > secondNum : " + (firstNum > secondNum));
		System.out.println("firstNum < secondNum : " + (firstNum < secondNum));
		System.out.println("firstNum >= secondNum : " + (firstNum >= secondNum));
		firstNum = 20;
		System.out.println("firstNum <= secondNum : " + (firstNum <= secondNum));
		System.out.println("firstNum == secondNum : " + (firstNum == secondNum));
		System.out.println("firstNum != secondNum : " + (firstNum != secondNum));
	}
}
