package com.kh.e_inheritance.override;

public class Run {

	public static void main(String[] args) {
		
		Book book1 = new Book("수학의 정석","나수학",100);
		Book book2 = new Book("수학의 정석","나수학",100);
		
		//1. Object.toString()
		// 오버라이드 전 : 클래스 전체 이름 + 객체의 주소값(16진수)을 출력
		// 오버라이드 후 : 생성한 인스턴스의 속성 정보가 출력
		System.out.println(book1.toString());
		System.out.println(book2);
		
		//2. Object.equals(Object obj)
		// 오버라이드 전 : 주소값이 일치하는 지 비교 / 동일비교, 주소값이 같은 객체 : 동일객체
		// 오버라이드 후 : 주소값이 다르더라도 속성들의 값이 일치하면 같은 객체라고 판단. / 동등비교, 동등객체
		//			주소값 비교 -> 값 비교
		System.out.println("book1과 book2는 동일한 객체인가요? " + (book1 == book2));
		System.out.println("book1과 book2은 동등한 객체인가요? " + book1.equals(book2));
		
		//3. Object.hashCode();
		// 오버라이드 전 : 주소값을 해싱한 값을 반환하는 메서드로, 인스턴스를 식별할 수 있는 고유한 숫자값을 반환한다.
		System.out.println("book1의 hashCode : " + book1.hashCode());
		System.out.println("book2의 hashCode : " + book2.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
