package com.kh.d_controllStatement.b_loopingStatement;

public class B_doWhile {
	
	//[표현식]
	//do{실행코드}while(조건식)
	//실행코드를 우선 1회 실행한 다음
	//조건식을 판단해서 실행코드를 반복할지 결정한다.
	public static void main(String[] args) {
		
		B_doWhile test = new B_doWhile();
		test.doWhile();
	}
	
	public void doWhile() {
		int i = 1;
		
		while(i > 1) {
			System.out.println("while문 입니다. " + i);
		}
		
		System.out.println("=========================");
		
		do {
			System.out.println("do-while문 입니다." + i);
		}while(i>1);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
