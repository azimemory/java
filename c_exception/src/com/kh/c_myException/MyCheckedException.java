package com.kh.c_myException;

//개발자가 직접 만드는 예외
//1. CheckedException일 경우 Exception을 상속 받는다.
//2. 기본생성자와 부모클래스에 message를 전달하는 매개변수가 있는 생성자를 만든다.
public class MyCheckedException extends Exception{
	
	public MyCheckedException() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수 받은 message는 부모클래스의 생성자를 통해
	//부모 클래스로 전달. 최종적으로는 모든 예외클래스의 부모인 Exception이 상속받고 있는
	//Throwable 클래스로 전달이 된다. -> Throwable의 detailMessage 변수에 담기게 된다.
	//detailMessage에 담긴 문자열은 getMessage()를 통해서 반환받을 수 있다.
	public MyCheckedException(String message) {
		super(message);
	}

}
