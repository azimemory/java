package com.kh.d_classformat;

//클래스
//접근제한자[예약어]  class 클래스명
//접근제한자 : public, default
//예약어 : abstarct, final
public class Car {
	
	//클래스 : 속성 + 기능
	//클래스 : 필드 + 지역
	//		필드 : 메서드 외부, member(필드변수, 메서드)
	//			필드변수 : 필드에 선언한 변수(속성)
	//				인스턴스변수 : 필드변수 중 일반변수 
	//				클래스변수 : 필드변수 중 static 변수
	//					클래스로 만든 모든 인스턴스가 공유하는 변수
	//					만약 클래스변수를 변경하게 되면 클래스로 만들어진 모든 인스턴스가
	//					영향을 받는다.
	//		지역 : 메서드 내부
	//			지역변수 : 메서드 내부에서 선언된 변수
	
	//인스턴스 변수
	private String color;
	private int speed;
	
	//클래스 상수
	private static final int MAXSPEED = 250;
	//클래스 변수
	private static int price;
	
	//초기화 블록
	//필드변수를 초기화 하는 용도
	//클래스가 인스턴스화 될 때 한번만 호출되어 필드변수를 초기화 한다.
	//생성자 보다 먼저 실행
	{
		color = "red";
		speed = 0;
	}
	
	//static 초기화 블록
	//클래스변수를 초기화 한다.
	static {
		price = 500000;
	}
	
	//생성자
	//클래스를 인스턴스화 할 때 호출하는 메서드
	//필드변수를 초기화하기 위해 사용
	//초기화 순서 : 
	//		인스턴스변수 : jvm 기본값 -> 필드변수에 직접 대입한 값 -> 초기화 블록 -> 생성자
	//		클래스변수 : jvm 기본값 -> 필드변수에 직접 대입한 값 -> static 초기화블록
	//다른 생성자가 없을 경우 작성하지 않으면 JVM이 자동으로 생성
	public Car() {
		color = "blue";
	}
	
	//매개변수가 있는 생성자 -> 생성자도 오버로딩이 가능하다.
	//overloading : 같은 이름으로 여러개의 메서드를 만드는 것.
	//규칙 : 매개변수의 타입이나 개수가 달라야 한다.
	public Car(String color) {
		this.color = color;
	}
	
	//캡슐화
	//필드변수의 접근제한자를 private으로 지정해 외부에서의 직접적인 접근을 막고
	//getter/setter 메서드를 통해서만 필드변수에 접근을 하도록 하는 것.
	//필드변수에 의도하지 않은 값이 들어가는 것을 방지.
	
	//캡슐화2
	//클래스 외부에서 호출하기 위한 메서드와, 내부 로직을 구현하기 위한 메서드를 분리
	//외부에서 호출하기 위한 메서드의 접근제한자를 public으로
	//내부 로직을 구현하기 위한 메서드의 접근제한자는 private으로 지정해
	//결합도를 낮추어 유연한 프로그램을 만드는 것
	
	//getter/setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Car.price = price;
	}
	
	
	
	
	
	
	
	
	

}
