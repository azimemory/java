package com.kh.c_operator;

public class H_문자열결합 {

	public static void main(String[] args) {
		
		//문자열(String) : 참조형 타입
		String str = new String("기차");
		System.out.println(str);
		
		//문자열은 너무 자주 사용하기 때문에
		//간편하게 litral로 생성 초기화 할 수 있도록 만들어졌습니다.
		String str2 = " 칙칙폭폭";
		System.out.println(str2);
		
		//문자열 결합
		String res = str + str2;
		System.out.println(res);
		System.out.println(str + str2);
		
		//문자열과 다른 타입의 결합
		//String str3 = str + 123 + 45;
		//String str3 = str + (123 + 45);
		String str3 = "가" + 123 + 45 + str;
		System.out.println(str3);
	}
}
