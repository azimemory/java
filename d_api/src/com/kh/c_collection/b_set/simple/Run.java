package com.kh.c_collection.b_set.simple;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.c_collection.model.vo.Music;

public class Run {
	public static void main(String[] args) {
		
		SimpleSet<Music> set = new SimpleSet<>();
		set.add(new Music("백지영","총맞은것처럼"));
		set.add(new Music("김경호","와인"));
		set.add(new Music("피터펜컴플랙스","우정"));
		set.add(new Music("김경호","와인"));
		
		//System.out.println(set);
		
		//1. set에 있는 데이터를 for-each를 활용해 출력해보세요.
		for (Music music : set) {
			System.out.println(music);
		}
		
		System.out.println("///////////////////////////////////////");
		
		Iterator<Music> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
		
		

	}
}
