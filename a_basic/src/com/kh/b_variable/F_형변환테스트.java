package com.kh.b_variable;

public class F_형변환테스트 {

	//형변환이 필요한 이유
	//갑 처리 규칙
	//1. 같은 자료형끼리 대입
	//2. 같은 자료형끼리 연산
	//다른 자료형의 값을 대입하고 싶거나 다른 자료형과 연산을 하고 싶을 경우
	//자료형을 하나로 통일 해줘야 한다.
	
	//형변환(casting) : 자동형변환(자바가 알아서 형변환)
	//				  강제형변환(개발자가 명시적으로 형변환)
	public static void main(String[] args) {
		//자동형변환
		//크기가 작은 타입의 값을 크기가 큰 타입의 변수에 담으려고 할때
		//자동형변환이 발생한다.(자바가 알아서 형변환)
		byte bnum = 100;
		int inum = bnum;
		System.out.println(inum);
		
		//강제형변환
		//형변환을 하면 데이터손실이 발생하는 경우
		//1) 크기가 큰 타입의 변수를 크기가 작은 타입의 변수에 대입할 때
		//2) 실수타입의 값을 정수타입의 변수에 담으려고 할 때
		//  정수타입의 변수에는 소수점 아래 수를 보관할 수 없기 때문에
		//  버림처리를 한다.(데이터 손실 발생)
		
		//크기가 큰 타입의 변수를 크기가 작은 타입의 변수에 대입
		int inum2 = 300;
		byte bnum2 = (byte)inum2;
		System.out.println(inum2 + "를 byte로 강제형변환 : " + bnum2);
		
		//실수타입의 값을 정수타입의 변수에 담으려고 할 때
		double dnum = 10.5;
		int inum3 = (int)dnum;
		System.out.println(dnum + "을 int로 형변환 : " + inum3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
