package com.kh.b_date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	
	public void date() {
		//1. Date
		// Date는 자바 개발 초기에 급하게 만들어져 완성도가 낮고
		// 특히 다국적 용도로 활용되기에는 적합하지 않다.
		// 그래서 jdk1.1 버전 이후로는 가능하면 Calendar 클래스를 사용
		// Date클래스에서 년도에는 1900을 월에는 1을 더 해야 한다.
		Date today = new Date();
		System.out.println(today);
		
		//년 월 일 시 분 초
		System.out.println("년 : " + (today.getYear()+1900));
		System.out.println("월 : " + (today.getMonth()+1));
		System.out.println("일 : " + today.getDate());
		System.out.println("시 : " + today.getHours());
		System.out.println("분 : " + today.getMinutes());
		System.out.println("초 : " + today.getSeconds());
	}
	
	public void calendarTest() {
		
		//2. Calendar
		// - TimeZone 기능 제공
		// TimeZone : 특정 국가나 지역의 현지시간
		// GMT(그리니치 표준시, 경도 0도를 태양이 지나는 시간)을 기준으로
		//	지역의 시간이 몇 시간이나 빠른지 혹은 느린지로 표시. 한국은 GMT 9시간 빠르다.
		// TimeZone은 ST, DST로 나누어서 표기를 한다.
		//	ST:일반 시간 계산방법
		// DST(Daylight saving time) 일광 절약 시간제
		//	하절기에 시간을 1시간 빠르게 계산
		//  ST를 따를 경우 가운데 S, DST를 따를 경우 가운데 D
		//  KST, JST, KDT, JDT, EDT
		
		// - filed Number 개념 도입
		// Calendar 클래스에서 제공하는 메서드들의 매개변수 주로 활용되며
		// 특정한 의미를 지니는 상수.
		
		//Calendar는 추상클래스이다.
		//인스턴스를 만들어 반환해주는 getInstance 메서드를 제공
		//GregorianCalendar 를 반환해준다.
		Calendar calendar = Calendar.getInstance();
		System.out.println("GregorianCalendar의 인스턴스 입니까? : " + 
					(calendar instanceof GregorianCalendar));
		
		//연, 월, 일, 시, 분, 초
		//field number와 get메서드를 활용해서 원하는 정보를 출력
		System.out.println();
		System.out.println("년 : " + calendar.get(Calendar.YEAR));
		System.out.println("월 : " + (calendar.get(Calendar.MONTH)+1)); //월은 +1!
		System.out.println("일 : " + calendar.get(Calendar.DATE));
		System.out.println("시 : " + calendar.get(Calendar.HOUR));
		System.out.println("분 : " + calendar.get(Calendar.MINUTE));
		System.out.println("초 : " + calendar.get(Calendar.SECOND));
		
		//set() : 원하는 시간으로 Calendar 인스턴스를 세팅
		//month : 현재 월에서 1을 뺀 값
		calendar.set(2020,9,27,5,42,39);
		
		//getTime() : Calendar 인스턴스에 세팅된 시간을 가지는 Date 인스턴스 반환
		System.out.println(calendar.getTime());
		
		//setTime() : Date 인스턴스에 세팅된 시간을 Calendar 인스턴스에도 세팅
		Date today = new Date(); //오늘 날짜로 Date 인스턴스 생성
		calendar.setTime(today);
		System.out.println(calendar.getTime());
		
		//getTimeInMillis()
		//Epoch(1970/01/01 00:00:00 GMT)로부터 calendar에 세팅된 시간 사이의 기간을
		//millisecond(1/1000초)로 반환
		System.out.println("1970년 1월 1일 이후 " 
					+ (calendar.getTimeInMillis()/1000) + " 초가 흘렀습니다." );
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
