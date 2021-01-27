package com.kh.a_string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringSplit {

	public void splitTest() {
		//String.split
		String str = "boo:and:foo";
		String[] result = str.split(":");
		System.out.println(Arrays.toString(result));
		
		System.out.println("////////////////////////////////");
		//구분자 매개변수를 넣어주지 않으면 공백으로 String을 쪼갠다.
		 StringTokenizer st = new StringTokenizer("this is a test");
		 
		 //StringTokenizer안에 토큰이 남았는지를 검사
		 while (st.hasMoreTokens()) {
	    	 //다음 토큰을 반환
	         System.out.println(st.nextToken());
	     }
		
		System.out.println("////////////////////////////////");
		//구분자를 t로 지정
		StringTokenizer st2 = new StringTokenizer("this is a test","t");
		 //StringTokenizer안에 토큰이 남았는지를 검사
	     while (st2.hasMoreTokens()) {
	    	 //다음 토큰을 반환
	         System.out.println(st2.nextToken());
	     }
	     
	     
	     System.out.println("////////////////////////////////");
	     StringTokenizer st3 = new StringTokenizer("this is a test","t",true);
		 //StringTokenizer안에 토큰이 남았는지를 검사
	     while (st3.hasMoreTokens()) {
	    	 //다음 토큰을 반환
	         System.out.println(st3.nextToken());
	     }
		
		
		
		
		
		
		
	}
}
