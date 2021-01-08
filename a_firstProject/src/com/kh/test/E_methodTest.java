package com.kh.test;

import com.kh.e_method.A_restrictor;

public class E_methodTest {

	public static void main(String[] args) {
		
		A_restrictor test = new A_restrictor();
		
		//public : 다른 패키지에서도 호출 할 수 있다.
		test.publicMethod();
		
		//default : 같은 패키지 안에서만 호출 할 수 있다.
		//test.defaultMethod();
		
		//protected : 같은 패키지 또는 상속관계일 때 호출 가능.
		//test.protectedMethod();
		
		//private : 같은 클래스 안에서만 호출 가능
		//test.privateMethod();

	}
}
