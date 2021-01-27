package com.kh.c_collection.a_list.simple;

import com.kh.c_collection.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		
		SimpleLinkedList<Music> list = new SimpleLinkedList<>();
		list.add(new Music("백지영","총맞은것처럼"));
		list.add(new Music("김경호","금지된사랑"));
		list.add(new Music("윤도현","나는나비"));
		
		//size() : 리스트이 크기를 반환
		for(int i = 0; i < list.size(); i++) {
			//get() : 매개변수로 지정한 인덱스의 데이터를 반환
			System.out.println(list.get(i));
		}
		
		list.set(2, new Music("아이유","미아"));
		System.out.println("2번인덱스 수정-------------------------------");
		for(int i = 0; i < list.size(); i++) {
			//get() : 매개변수로 지정한 인덱스의 데이터를 반환
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		System.out.println("2번인덱스 삭제-------------------------------");
		for(int i = 0; i < list.size(); i++) {
			//get() : 매개변수로 지정한 인덱스의 데이터를 반환
			System.out.println(list.get(i));
		}
		
		//예외 발생을 위한 코드
		//list.get(3);
		
		System.out.println("\nIterable 구현 후 for-each문------------------");
		
		/*
		 * for(Music m : list) {
		 * System.out.println(m);
		 * }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
