package com.kh.c_collection.a_list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("박준범",18));
		studentList.add(new Student("박준범",20));
		studentList.add(new Student("왕상준",22));
		studentList.add(new Student("조하나",17));
		studentList.add(new Student("천지영",19));
		studentList.add(new Student("유연수",20));
		studentList.add(new Student("김승현",24));
		studentList.add(new Student("김수현",26));
		
		//1. list 정렬
		//Collections : Collection을 다루기 위한 여러 util을 제공해주는 메서드
		Collections.sort(studentList);
		//list 출력
		for(Student s : studentList) {
			System.out.println(s);
		}
		
		
		//////////////////////////////////////////////////////////////////
		
		//Collections.sort() 메서드를 활용해 정렬을 하되
		//기본적으로는 이름의 오름차순으로 정렬을 해주세요.
		//만약 이름이 같은 동명이인 존재할 경우 나이로 내림차순 정렬하시오
		
		//////////////////////////////////////////////////////////////////
		
		
		//2. list 정렬
		// list인터페이스의 sort메서드를 활용
		studentList.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		});
		
		//list 출력
		System.out.println("==========================================");
		for(Student s : studentList) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
