package com.kh.b_overloading;

public class Overloading {
	
	//Overloading : 이름이 같은 메서드를 여러개 만드는 것.
	//조건 : 매개변수의 개수나 타입이 달라야 한다.
	
	public void olTest() {}
	
	//접근제어자가 다른 olTest -> 불가능
	//private void olTest() {}
	
	//반환형이 다른 olTest -> 불가능
	//public String olTest() {return "hi";}
	
	//매개변수의 개수가 다른 olTest -> 가능
	public void olTest(String name) {}
	
	//매개변수의 타입이 다른 olTest -> 가능
	public void olTest(int score) {}
	
	//매개변수의 변수명이 다른 olTest -> 불가능
	//public void olTest(int age) {}
	
	////////////////////////////////////////////////
	
	//매개변수가 여러개인 경우
	public void olTest(int a, String b) {}
	
	//매개변수가 여러개인 경우, 매개변수의 순서가 다른 olTest ->  가능
	public void olTest(String b, int a) {}
	
	//배열의 마지막에 data를 추가해주는 메서드
	// * ArrayList api 참고
	public void add(int data) {};
	
	//두번째 매개변수로 넘어온 인덱스에 data를 삽입해주는 메서드
	public void add(int data, int idx) {};
	
	
	
	
	
	
	
	
	
	
	
	
	

}
