package com.kh.c_myException;

//개발자가 원하는 예외를 만들 수 있다.
//RuntimeException을 상속받아 Custom Exception을 만들면
//해당 예외는 UnCheckedException이 된다.
public class MyUncheckedException extends RuntimeException{
	
	public MyUncheckedException() {
		// TODO Auto-generated constructor stub
	}
	
	public MyUncheckedException(String message) {
		super(message);
	}

}
