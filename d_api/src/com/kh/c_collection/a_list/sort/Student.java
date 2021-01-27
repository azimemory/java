package com.kh.c_collection.a_list.sort;

//Comparable : 비교가 가능한 클래스
public class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		//이 인스턴스의 나이가 매개변수로 넘어온 인스턴스의 나이보다 
		//크면 양수, 작으면 음수, 같으면 0 -> 오름차순정렬
		//작으면 양수, 같으면 0, 크면 음수 -> 내림차순정렬
		//return this.age - o.getAge();
		
		//String의 compareTo메서드를 사용해 결과값 반환
		//String의 compareTo메서드도 음수,0,양수를 반환하도록 override되어 있다.
		//내부적으로 abc 또는 가나다 순으로 비교를 해 결과 값을 반환해준다.
		//return this.name.compareTo(o.getName());
		
		
		//Quize. 이름으로 오름차순, 동명이인일 경우 나이로 내림차순
		
		int res = this.name.compareTo(o.getName());
		
		//이름이 같지 않은 경우
		if(res != 0) {
			return res;
		//이름이 같은 경우 나이로 내림차순
		}else {
			return -(this.age - o.getAge());
		}
	}
	
	
	
	
	

}
