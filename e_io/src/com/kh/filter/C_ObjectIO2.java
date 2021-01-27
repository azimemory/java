package com.kh.filter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kh.filter.model.vo.Phone;
import com.kh.filter.model.vo.Student;
import com.kh.filter.model.vo.Teacher;

public class C_ObjectIO2 {
	
	public void objectOutput() {
		
		//각 객체들에 대한 list를 생성
		List<Phone> phoneList = new ArrayList<>();
		List<Student> studentList = new ArrayList<>();
		List<Teacher> teacherList = new ArrayList<>();
		
		phoneList.add(new Phone("삼성", 70));
		phoneList.add(new Phone("LG", 60));
		phoneList.add(new Phone("애플", 90));
		
		studentList.add(new Student("인병욱",'M',phoneList.get(0)));
		studentList.add(new Student("왕상준",'M',phoneList.get(1)));
		studentList.add(new Student("이승연",'F',phoneList.get(2)));
		
		teacherList.add(new Teacher("P", "하명도"));
		teacherList.add(new Teacher("Q", "이동헌"));
		teacherList.add(new Teacher("S", "이창진"));
		
		Map<String,Object> commandMap = new HashMap<>();
		commandMap.put("phone", phoneList);
		commandMap.put("student", studentList);
		commandMap.put("teacher", teacherList);
		
		try(ObjectOutputStream oos 
				= new ObjectOutputStream(
						new FileOutputStream("student2.dat"))){
			
			oos.writeObject(commandMap);
			System.out.println("student2.dat 파일 생성완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void objectInput() {
		
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("student2.dat"))){
			
			Map<String, Object> commandMap 
				= (Map<String, Object>)ois.readObject();
			
			//학생데이터가 궁금하다?
			List<Student> students = (List<Student>)commandMap.get("studnet");
			
			for (Student student : students) {
				System.out.println(student);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
