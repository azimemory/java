package com.kh.a_encapsulation;

// class
// 접근제한자 [예약어] class 클래스명
// 접근제한자 : public, default
// 예약어 : abstract, final

// 입금 기능과 출금 기능을 담당하고 있는 클래스
public class Account {
	//1. 추상화
	// 프로그램에서 필요로 하는 공통적인 기능 및 속성을 추출하고, 불필요한 것을 제거하는 과정
	// 기능이 먼저 정해지고, 그 다음 속성을 정할 수 있다.
	
	//2. 캡슐화
	// 클래스 내부의 필드변수에 클래스 바깥에서 직접 접근하는 것을 막는 것.
	// getter/setter 메서드를 통해 접근하도록 제한
	// 필드변수의 접근제한자를 private으로 지정.
	private String name; //이름
	private int balance; //잔액
	
	//setter메서드 : 캡슐화된 클래스의 필드변수에 값을 대입하기 위해 사용하는 메서드
	//setter메서드 명명법 : set + 변수명(맨 앞글자 대문자)
	public void setName(String name) {
		//this : 자기 자신의 주소를 가지고 있는 레퍼런스.
		this.name = name;
		System.out.println(name + "의 주소는 " + System.identityHashCode(this) + "입니다.");
	}
	
	//getter메서드 : 필드변수에 저장된 값을 반환하기 위해 사용하는 메서드
	//getter메서드 명명법 : get + 변수명(맨 앞글자 대문자)
	public String getName() {
		return name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	//입금을 위한 메서드
	//매개변수로 넘어온 금액을 잔액에 더해주는 메서드
	public void deposit(int money) {
		balance += money;
		System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
	}
	
	//출금을 위한 메서드
	//매개변수로 넘어온 금액을 잔액에서 차감하는 메서드
	public void withdraw(int money) {
		balance -= money;
		System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
	}
}
