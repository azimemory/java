package com.kh.e_method;

public class B_return {
	
	//접근제한자 [예약어]... 반환형 메서드명(매개변수){}
	//반환형 : 메서드를 호출한 대상에게 반환할 데이터의 타입을 명시
	//		모든 타입 다 가능(기본형, 참조형)
	//		만약 반환할 데이터가 없다면 반환형의 위치에 void를 작성
	
	
	//반환할 데이터가 없는 메서드
	public void voidTest() {
		System.out.println("반환형이 없는 메서드 입니다.");
	}
	
	//String 타입의 데이터를 반환하는 메서드
	public String returnTest() {
		System.out.println("반환형이 있는 메서드 입니다.");
		//String result = "반환형이 있는 메서드 입니다.";
		return "반환형이 있는 메서드 입니다.";
	}
	
	//int 타입의 데이터를 반환하는 메서드
	public int intReturnTest(){
		//int res = 200 * 300;
		return 200 * 300;
	}
	

}
