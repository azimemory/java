package com.kh.c_collection.b_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.c_collection.model.vo.Music;

public class SetTest {
	
	//Set의 특징
	//저장되는 값들의 순서를 유지하지 않는다. 
	//          -> 순서가 없기 때문에 원하는 데이터만 꺼내는 것이 불가능, get메서드가 없다.									
	//저장되는 값들의 중복을 허용하지 않는다.
	//구현 클래스 : HashSet, LinkedHashSet(순서가 유지되는 Set)
	
	public void doSet() {
		//HashSet
		Set<Music> set = new HashSet<>();
		set.add(new Music("백지영","총맞은것처럼"));
		set.add(new Music("김경호","와인"));
		set.add(new Music("피터펜컴플랙스","우정"));
		set.add(new Music("김경호","와인"));
		
		System.out.println(set);
		
		//1. set에 있는 데이터를 for-each를 활용해 출력해보세요.
		for (Music music : set) {
			System.out.println(music);
		}
		
		//2. set을 출력하는 두번째 방법 : Iterator활용
		System.out.println("\n//////////////////////////////////");
		Iterator<Music> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//3. 김경호 노래를 삭제
		System.out.println("\n//////////////////////////////////");
		set.remove(new Music("김경호","와인"));
		for (Music music : set) {
			System.out.println(music);
		}
		
		//4. set -> list로 변환
		System.out.println("\n//////////////////////////////////");
		List<Music> fromSetToList = new ArrayList<>(set);
		for (int i = 0; i < fromSetToList.size(); i++) {
			System.out.println(i + "번 인덱스 : " + fromSetToList.get(i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
