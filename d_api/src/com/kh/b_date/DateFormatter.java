package com.kh.b_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatter {
	//SimpleDateFormat
	public void formatterTest() {
		
		Calendar calendar = Calendar.getInstance();
		
		//원하는 포멧으로 시간 출력하기
		//SimpleDateFormat의 생성자 매개변수에 포멧을 작성해서 전달
		SimpleDateFormat sdf = new SimpleDateFormat(
						"금일은 yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		
		//SimpleDateFormat.format
		//format(Date date) : 매개변수로 넘어온 Date에 설정된 시간을
		//					SimpleDateFormat에 등록된 포맷대로 문자열로 작성해 반환
		// Calendar.getTime() : Calendar에 설정된 시간을 가지는 Date 타입의 인스턴스를 반환
		System.out.println(sdf.format(calendar.getTime()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
	}
}
