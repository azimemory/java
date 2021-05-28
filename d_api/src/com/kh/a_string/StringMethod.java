package com.kh.a_string;

import java.util.Arrays;

public class StringMethod {
	
	String str = "   The String class represents character string.   ";
	
	public void testMethod() {
		
		//1. str의 길이를 출력하세요.
		//java.lang.String.length()
		//[출력양식] str의 길이 : ?
		System.out.println("str의 길이 : " + str.length());


		//2. str을 모두 대문자로 바꿔주세요.
		//java.lang.String.toUpperCase()
		//[출력양식] str을 대문자로 변환 : ?
		String upperStr = str.toUpperCase();
		System.out.println("str을 대문자로 변환 : " + upperStr);


		//3. str을 모두 소문자로 바꿔주세요.
		//
		//[출력양식] str을 소문자로 변환 : ?
		String lowerStr = str.toLowerCase();
		System.out.println("str을 소문자로 변환 : " + lowerStr);


		//4. str에 있는 "class"를 "java"로 바꿔주세요
		//java.lang.String.replace()
		//[출력양식] class->java:?
		str = str.replace("class", "java");
		System.out.println(str);


		//5. str에서 첫번째 v의 위치를 구해주세요.
		//java.lang.String.indexOf()
		//[출력양식] 문자열에서 v의 위치 : ?
		System.out.println("문자열에서 v의 위치 : " + str.indexOf("v"));

		
		//6. str의 앞 뒤 공백을 제거해서 출력해주세요
		//java.lang.String.trim()
		//[출력양식] 문자열의 앞뒤 공백제거 : ?
		System.out.println("문자열의 앞 뒤 공백제거 : " + str.trim());
		

		//7. str을 char[]형태로 출력
		//java.lang.String.toCharArray() 
		char[] charArr = str.toCharArray();
		System.out.println(Arrays.toString(charArr));
		
	}
}
