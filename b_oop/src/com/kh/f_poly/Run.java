package com.kh.f_poly;

public class Run {

	//다형성 : 하나의 인스턴스를 여러 타입으로 다루는 것
	//		 상속을 통해서 타입을 물려받기 때문. *****
	//		 상속을 통해서 물려받는 것 -> 필드변수, 메서드, 타입*****
	
	// * 타입에는 메서드 선언부가 담겨있다.
	//	 부모타입의 레퍼런스로 인스턴스를 다룰 경우, 부모타입에 담겨있는 메서드 선언부만 사용이 가능해서
	//	 부모 클래스에 작성되어있는 메서드만 호출이 가능해진다.
	public static void main(String[] args) {
		
		Product product = new Product("삼성", "청소기", 50000);
		//Product 클래스의 인스턴스를 Object 타입의 레퍼런스에 담을 수 있다!
		//Product 클래스가 Object 클래스를 상속받기 때문.
		Object obj = product;
		
		//부모타입의 레퍼런스로 자식 클래스 생성 -> o
		Product lgTv = new Tv("LG","LG티비",350000,46);
	
		//부모타입 -> 자식타입으로 캐스팅 : down casting
		//자식타입 -> 부모타입 : up casting
		Tv castedTv = (Tv)lgTv;
		
		Product galaxy = new SmartPhone("사과", "아이폰", 1300000,"긱벤치",8,"SKT");
		//Product 타입으로 powerOn 메서드 사용 -> 불가능
		//Computer 타입으로 downCasting
		Computer castedSmartPhone = (Computer)galaxy;
		//Computer 클래스에는 powerOn 메서드가 있다.
		//부모타입의 레퍼런스로 메서드를 호출 하더라도 오버라이드 된 메서드가 호출된다.
		castedSmartPhone.powerOn();
		
		Desktop desktop = new Desktop("삼성","울트라",1000000,"intel",8,true);
		
		Computer[] computers = {castedSmartPhone, desktop};
		for (int i = 0; i < computers.length; i++) {
			computers[i].powerOn();
		}
		
		//Tv, SmartPhone, Desktop 클래스 인스턴스의 이름을 출력하는 코드
		//System.out.println(lgTv.getpName());
		//System.out.println(castedSmartPhone.getpName());
		//System.out.println(desktop.getpName());
		
		Product[] products = {lgTv,castedSmartPhone,desktop};
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getpName());
			
			//만약에 products[i] 가 Computer타입을 가지고 있으면
			//powerOn 메서드를 호출
			//instanceof 연산자 
			// reference instanceof Class : 레퍼런스가 가지고 있는 타입을 확인해서 true, false 반환
			if(products[i] instanceof Computer) {
				//다운캐스팅을 통해서 Computer 타입으로 변경해주고
				//powerOn메서드 호출
				((Computer)products[i]).powerOn();
			}
		}
		
		//모든 클래스의 부모인 Object를 통해서 어떤 타입의 인스턴스이든 담을 수 있는 만능 배열 만들 수 있다.
		//primitive type? 기본타입을 객체로 활용하기 위한 Wrapper Class가 있기 때문에 기본타입도 Object배열에 담을 수 있다.
		Object[] objArr = {lgTv, galaxy, desktop, 1.0, 1, 'c', true};
		//Wrapper Class는 literal 초기화가 지원 되는 클래스
		Integer integer = 10;
		Character ch = 'C';
		Double dnum = 1.0;
		System.out.println("//////////////////////////////////////");
		for (int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
