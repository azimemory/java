package com.kh.c_init;

public class Constructor {
	
	//필드변수의 초기화 순서 
	// 인스턴스변수 : jvm의 기본값 -> 필드변수에 직접 대입한 값 -> 초기화 블록 -> 생성자
	// 클래스변수 : jvm의 기본값 -> 필드변수에 직접 대입한 값 -> static 초기화 블록
	
	//필드변수
	//	인스턴스변수 : 클래스를 인스턴스화 했을 때 메모리에 올라가는 변수
	//  클래스변수 : 프로그램이 실행되면 메모리에 올라가는 변수
	private String memberStr = "하명도"; //인스턴스변수
	private static int classInt = 10; //클래스변수
	
	//초기화블록
	//클래스가 인스턴스화 되는 순간에 한번만 호출되어 인스턴스 변수의 값을 초기화하는 용도
	//생성자보다 먼저 호출된다.
	{
		System.out.println("초기화 블록 호출 전에 memberStr에 담겨 있는 값 : " 
						+ memberStr);
		memberStr = "강사";
	}
	
	//static 초기화 블록
	//프로그램이 시작 될 때 동작해 static변수에 값을 넣는다.
	static {
		System.out.println("초기화 블록 호출 전에 classInt에 담겨 있는 값 : "
				+ classInt);
		classInt = 100;
	}
	
	//생성자 : 클래스가 인스턴스화 될 때 호출되는 메서드
	//		필드변수를 초기화하는 용도로 사용 된다.
	//	만약 다른 생성자가 없는데, 기본 생성자를 작성하지 않으면 JVM이 자동으로 생성한다.
	//  생성자는 반환형이 없고, 이름은 클래스명과 같다.
	public Constructor() {
		super(); //부모클래스의 생성자를 호출
				 //작성하지 않을 경우 자동으로 생성된다.
		System.out.println("Constructor클래스의 기본 생성자 입니다.");
		System.out.println("생성자가 호출 되기 전 memberStr에 담겨 있는 값 : "
				+ memberStr);
		memberStr = "pclass";
	}
	
	public Constructor(String name) {
		System.out.println("Constructor클래스의 매개변수가 있는 생성자 입니다.");
		System.out.println("생성자가 호출 되기 전 memberStr에 담겨 있는 값 : "
				+ memberStr);
		memberStr = name;
	}

	public String getMemberStr() {
		return memberStr;
	}

	public void setMemberStr(String memberStr) {
		this.memberStr = memberStr;
	}

	public static int getClassInt() {
		return classInt;
	}

	public static void setClassInt(int classInt) {
		Constructor.classInt = classInt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
