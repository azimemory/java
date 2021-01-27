package com.kh.a_string;

public class StringConcatenation {
	
	//String은 값을 수정할 수 없는 불변객체(immutable)이다.
	//String의 값을 수정할 경우, 해당 인스턴스가 변경되는 것이 아니라 새로운 인스턴스를 만든다.
	//String을 자주 수정하게 되면 메모리 공간을 비효율적으로 사용하게 된다.
	public void stringConcatenation() {
		String test = "JAVA";
		System.out.println("수정 전 주소 : " + System.identityHashCode(test));
		test += " Class";
		System.out.println("수정 후 주소 : " + System.identityHashCode(test));
		System.out.println(test);
		
		//문자열 결합연산을 메서드로도 가능
		test = test.concat(" Easy");
		System.out.println("concat : " + System.identityHashCode(test));
		System.out.println(test);
	}
	
	//문자열 값을 수정하는 mutable객체
	//내부적으로 기본 16문자 크기의 buffer를 사용하고, 이 buffer의 크기를 조정할 수 있다.
	//쓰래드 동기화를 지원하지 않는다.
	public void stringBuilderConcat() {
		
		StringBuilder builder = new StringBuilder("ABC");
		System.out.println("결합 전 : " + System.identityHashCode(builder));
		
		//append(String s) : 문자열 결합
		builder.append(" Java Class");
		System.out.println("결합 후 : " + System.identityHashCode(builder));
		System.out.println(builder);
		
		String res = builder.toString();
		System.out.println(res);
		
	}
	
	//문자열 값을 수정할 수 있는 mutable 객체
	//기본 16문자 크기의 buffer를 사용
	//쓰래드 동기화를 지원
	//속도가 StringBuilder보다 느리지만 유의미하지 않기 때문에 StringBuffer를 주로 사용
	public void stringBufferConcat() {
		StringBuffer buffer = new StringBuffer("ABC");
		System.out.println("결합 전 : " + System.identityHashCode(buffer));
		buffer.append(" Java Class");
		System.out.println("결합 후 : " + System.identityHashCode(buffer));
		System.out.println(buffer);
	}
	
	
	
	
	
	
	
	
	

}
