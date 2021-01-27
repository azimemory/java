package com.kh.b_date.dDay;

import java.util.Calendar;

public class Dday {
	
	public long dDay(int year, int month, int date) {
		long between = 0;
		//현재시간을 세팅할 Calendar
		Calendar now = Calendar.getInstance();
		//사용자가 입력한 시간을 세팅할 Calendar
		Calendar input = Calendar.getInstance();
		
		//사용자가 입력한 시간을 input에 세팅
		input.set(year, month-1,date);
		
		//두 날짜 사이의 milliSecond 계산
		//getTimeInMillis() -> Epoch 로부터 Calendar에 세팅된 시간까지의 milliseconds
		between = input.getTimeInMillis() -  now.getTimeInMillis();
		between /= 1000; //초
		between /= 3600; //시간
		between /= 24; //일
		
		return between;
		
	}
}
