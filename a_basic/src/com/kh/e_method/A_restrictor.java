package com.kh.e_method;

public class A_restrictor {
	
	//접근제한자 [예약어]... 반환형 메서드명(매개변수){}
	//public(접근제한자) void(반환형) quize(메서드명)([매개변수는 없었음]){}
	
	//접근제한자 : 메서드를 호출할 수 있는 범위를 지정
	//	1) public, 2) default, 3) protected, 4) private
	
	//public(+) : 다른 패키지에서도 이 메서드를 호출 할 수 있음
	public void publicMethod() {
		System.out.println("접근제한자가 public인 메서드 입니다.");
		//같은 클래스 안에서는 메서드 이름 만으로 메서드 호출이 가능하다.
		//해당 인스턴스의 주소값을 가지고 있는 this를 생략할 수 있기 때문이다.
		privateMethod();
	}
	
	//default(~) : 같은 패키지 내에서만 이 메서드를 호출 할 수 있음.
	//			   접근제한자 default를 사용할 경우 메서드 선언부에서 접근제한자를 생략한다.
	void defaultMethod() {
		System.out.println("접근제한자가 default인 메서드 입니다.");
	}
	
	//protected(#) : 같은 패키지 내에서 호출 가능, 상속관계일 경우 다른 패키지에서도 호출 할 수 있음
	protected void protectedMethod() {
		System.out.println("접근제한자가 protected인 메서드 입니다.");
	}
	
	//private(-) : 같은 클래스 안에서만 호출 가능
	private void privateMethod() {
		System.out.println("접근제한자가 private인 메서드 입니다.");
	}
	
	
	
	
	
	
	
	
	
	

}
