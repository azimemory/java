package com.kh.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class C_FileWR {
	Scanner sc = new Scanner(System.in);
	//문자 기반 스트림(Writer, Reader)
	//자바의 문자는 2바이트이다.
	//바이트 기반 스트림은 데이터를 1바이트씩 쪼개어 입출력을 하기 때문에
	//문자를 바이트 기반 스트림으로 다룰 경우 문제가 발생할 여지가 있다.
	//문자 기반 스트림은 데이터를 2바이트(char) 로 주고 받기 때문에
	//문자 데이터를 안전하게 다룰 수 있다.
	
	public void fileOut() {
		System.out.print("파일명을 작성하세요 : ");
		String fileName = sc.nextLine();
		System.out.print("문구를 작성하세요 : ");
		String contents = sc.nextLine();
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName,true);
			fw.write(contents);
			System.out.println("파일 생성이 완료되었습니다. 프로젝트를 새로고침하세요.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileIn() {
		
		System.out.print("읽어올 파일명을 작성하세요 : ");
		String fileName = sc.nextLine();
		
		//try-with-resources문
		//자바 1.7부터 지원
		//try(스트림 선언 및 생성){}catch{}finally{}
		//AutoCloseable을 구현한 객체만 try-with-resources문에서 사용할 수 있다.
		//try-with-resources문이 종료될 때 
		//선언한 객체의 close메서드를 자동으로 호출해준다.
		try(FileReader fr = new FileReader(fileName);) {
			int check = 0;
			String res = "";
			
			while((check = fr.read()) != -1) {
				res += (char)check;
			}
			
			System.out.println(res);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
