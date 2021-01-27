package com.kh.e_inheritance.before;

public class Run {

	public static void main(String[] args) {
		
		//제조사, 상품명, 가격, cpu, ram, 일체여부
		Desktop desktop = new Desktop("삼성", "울트라", 2000000, "intel", 8, true);
				
		//제조사, 상품명, 가격, cpu, ram, 통신사
		SmartPhone smartPhone = new SmartPhone("사과", "아이폰", 1300000, "긱벤치", 4, "KT");
		
		//제조사, 상품명, 가격, 인치(크기)
		Tv tv = new Tv("LG", "LG티비", 350000, 46);
		
		System.out.println(desktop.toString());
		System.out.println(smartPhone); //표준출력문을 사용할 경우 레퍼런스를 매게변수로 넘기면
										//내부적으로 toString() 메서드를 호출해 인스턴스의 정보를 출력한다.
		System.out.println(tv);
		
		//세 클래스가 모두 공통적으로 가지고 있는 필드 : 제조사, 상품명, 가격  --> Product
		//Desktop, SmartPhone가 공통적으로 가지고 있는 필드 : cpu, ram --> Computer 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
