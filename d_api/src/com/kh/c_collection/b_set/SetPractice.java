package com.kh.c_collection.b_set;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
	
	Set<String> firstSet = new HashSet<>();
	Set<String> secondSet = new HashSet<>();
	
	public void setPractice() {
		
		firstSet.add("김수현");
		firstSet.add("김승현");
		firstSet.add("박지현");
		firstSet.add("박현욱");
		
		secondSet.add("염준식");
		secondSet.add("왕상준");
		secondSet.add("이성욱");
		secondSet.add("이승연");
		secondSet.add("김수현");
		
		//1.합집합
		Set<String> setAll = new HashSet<String>();
		setAll.addAll(firstSet);
		setAll.addAll(secondSet);
		
		System.out.println("합집합-------------------");
		for (String string : setAll) {
			System.out.println(string);
		}
		
		System.out.println("///////////////////////");
		
		//2.차집합
		System.out.println("차집합-------------------");
		setAll.removeAll(secondSet);
		for (String string : setAll) {
			System.out.println(string);
		}
		System.out.println("///////////////////////");
		
		//3.교집합
		System.out.println("교집합-------------------");
		firstSet.retainAll(secondSet);
		for (String string : firstSet) {
			System.out.println(string);
		}
		
		System.out.println("///////////////////////");
		
		//4.부분집합 여부 확인
		System.out.println("부분집합 여부 : " 
				+ secondSet.containsAll(firstSet));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
