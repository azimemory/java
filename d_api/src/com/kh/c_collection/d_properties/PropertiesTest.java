package com.kh.c_collection.d_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesTest {
	
	//1. Properties
	// XML파일 입출력을 지원하면서 Key와 Value의 타입이 String으로 고정된 Map
	// HashTable을 상속받고 있다.
	
	// XML : Extensible MarkUp Laguange
	//		확장 가능한 마크업 언어
	//	MarkUP Language : 데이터를 저장하고 전달하기 위해 디자인된 언어
	//  		미리 약속된 tag를 사용해 데이터를 저장하고 식별
	//			하지만 XML은 확장 가능한 마크업 언어이기 때문에 미리 정의된 tag가 없다.
	//	tag : 
	//		ex) <a>www.naver.com</a> 
	//			<a></a> : 태그
	//			태그 사이에 있는 정보가 Data가 된다. tag는 Data에 대한 정보를 담고 있다.
	
	public void doProperties() {
		
		Properties prop = new Properties();
		
		//데이터 저장
		prop.setProperty("DATE", "202011101750");
		prop.setProperty("Day", "tues");
		prop.setProperty("Time", "17:51");
		
		//데이터 출력
		System.out.println(prop.getProperty("DATE"));
		System.out.println(prop.getProperty("Day"));
		System.out.println(prop.getProperty("Time"));
		
		//수정
		prop.setProperty("DATE", "202011111111");
		System.out.println("DATE 수정 ===============================");
		for(Object s : prop.keySet()) {
			System.out.println(prop.getProperty((String)s));
		}
		
		//삭제
		prop.remove("Time");
		System.out.println("Time 삭제 ===============================");
		for(Object s : prop.keySet()) {
			System.out.println(prop.getProperty((String)s));
		}
	}
	
	public void storeToXMLTest() {
		
		Properties prop = new Properties();
		
		//데이터 저장
		prop.setProperty("DATE", "202011101750");
		prop.setProperty("Day", "tues");
		prop.setProperty("Time", "17:51");
		
		try {
			prop.storeToXML(new FileOutputStream("prop.xml"), "user info");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadFromXMLTest() {
		
		Properties readProp = new Properties();
		//XML파일의 데이터를 읽어 readProp에 저장
		try {
			
			readProp.loadFromXML(new FileInputStream("prop.xml"));
			
			System.out.println("////////////////////////////////////");
			
			for(Object key : readProp.keySet()) {
				System.out.println(readProp.getProperty((String)key));
			}
			
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
