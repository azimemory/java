package com.kh.e_method;

public class D_static {
	
	// 접근제한자 [예약어] 반환형 메서드명(매개변수)
	
	// static
	// 메서드나 변수 앞에 static 예약어를 붙이면 class가 메모리에 올라갈 때 static 영역으로 데이터를 올린다.
	// 프로그램이 종료 될때 까지 메모리에서 내려오지 않는다.
	// 그래서 참조형변수를 선언하고 초기화하는 과정 없이도, 메서드를 호출할 수 있다.
	// 사용법 : 클래스명(타입명).메서드명()
	
	//필드변수 
	//멤버변수
	String noneStatic = "Static 아님";
	
	//클래스변수
	static String staticName = "하명도";
	
	//일반 메서드
	public void methodTest() {
		System.out.println("일반 메서드 입니다.");
	}
	
	//Static 메서드
	public static void staticTest() {
		System.out.println("Static 메서드 입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
