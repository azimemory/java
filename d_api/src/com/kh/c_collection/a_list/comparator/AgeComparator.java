package com.kh.c_collection.a_list.comparator;

import java.util.Comparator;
import com.kh.c_collection.a_list.sort.Student;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();
	}
}
