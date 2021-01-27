package com.kh.a_encapsulation.method_encapsulation;

//연주자 클래스
//연주 기능
public class Player {
	
	//객체는 자율성을 지녀야 한다.
	//캡슐화 : 외부에서 직접 접근하는 것을 막는 것.
	
	public void startPlay() {
		prepare();
		//start();
		playing();
		end();
		curtainCall();
	}
	
	private void prepare() {
		System.out.println("연주를 준비합니다.");
	}
	
	/*
	 * private void start() {
	 * System.out.println("연주를 시작합니다.");
	 * }
	 */
	
	private void playing() {
		System.out.println("연주 중 입니다.");
	}
	
	private void end() {
		System.out.println("연주를 마무리합니다.");
	}
	
	private void curtainCall() {
		System.out.println("커튼콜을 진행합니다.");
	}
	
	
	
	
	
	
	
	
	
	

}
