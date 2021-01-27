package com.kh.g_abstract.sports;

//추상클래스
//추상클래스 클래스의 선어부에 abstract 예약어를 사용함으로써 생성
//추상클래스는 abstract 메서드가 0개이상 존재하는 클래스
//  * 일반클래스는 abstract 메서드가 0개인 클래스
//	  abstract메서드 하나라도 있으면 반드시 추상클래스
//abstract 메서드 : 메서드 선언부만 존재하는 메서드. 메서드의 선어부에 
//				abstract 예약어를 사용해서 생성
//추상클래스는 미완성 클래스로, 인스턴스화가 불가능 하다.
//추상클래스를 상속받은 클래스가 추상메서드를 오버라이드함으로써 추상클래스가 완성
//추상클래스의 추상메서드는 자식클래스가 반드시 오버라이드를 해야한다. *오버라이드를 강제한다.

public abstract class Sports {
	
	private int peopleCnt; //참여인원수
	
	public Sports() {
		
	}

	public Sports(int peopleCnt) {
		super();
		this.peopleCnt = peopleCnt;
	}

	public int getPeopleCnt() {
		return peopleCnt;
	}

	public void setPeopleCnt(int peopleCnt) {
		this.peopleCnt = peopleCnt;
	}

	@Override
	public String toString() {
		return "Sports [peopleCnt=" + peopleCnt + "]";
	}
	
	//추상메서드
	// * 추상메서드는 반드시 자식클래스에서 오바라이드 해야한다.
	// 스포츠마다 반드시 규칙이 있지만 그 규칙의 내용은 모두 다르기 때문에
	// 스포츠를 상속받는 모든 자식클래스에서 규칙을 재정의하도록 강제
	public abstract void rule();	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
