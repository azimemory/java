package com.kh.file;

import java.io.File;
import java.io.IOException;

public class A_FileTest {
	
	//File
	//파일에 관련된 기능을 제공해주는 클래스
	public void doFile() {
		try {
			//파일 클래스 인스턴스 생성
			File file = new File("C:\\CODE\\test.txt");
			
			//원하는 위치에 파일 생성
			file.createNewFile();
			
			//경로 지정
			//절대경로 : root(window에서는 C드라이브)부터 경로를 지정하는 방식, \\로 경로 구분 
			//상대경로 : 현재 위치부터 경로를 지정하는 방식, /로 경로 구분
			//	공백 또는 ./ : 현재 위치
			//  ../ 	   : 현재 폴더의 상위폴더
			//현재 위치(프로젝트의 위치)에 파일 생성
			File projectFile = new File("../../PathTest/PathTest2/PathTest2.txt");
			projectFile.createNewFile();
			
			//2. 원하는 경로(폴더) 생성:
			// mkdir : 마지막 폴더 하나만 생성 ex)  
			//			"test/pclass/easy" -> easy폴더만 생성, 만약 pclass폴더가 없으면 에러	
			// * mkdirs : 여러 폴더를 동시에 생성 
			//			"test/pclass/easy" pclass폴더가 없으면 pclass도 한번에 생성
			//createNewFile의 경우 존재하지않는 경로에 파일을 생성하면 에러가 발생
			
			String path = "c:\\pclass\\io\\";
			String fileName = "io.txt";
			
			File dirsFile = new File(path+fileName);
			File dir = new File(path);
			
			if(!dir.exists()) {
				new File(path).mkdirs();
			}
			
			dirsFile.createNewFile();
			
			
			//파일명 출력
			System.out.println(dirsFile.getName());
			
			//저장경로 출력
			System.out.println(dirsFile.getPath());
			
			//파일용량 확인
			System.out.println(dirsFile.length());
			
			//파일 삭제
			dirsFile.delete();
			System.out.println("dirsFile에 지정된 경로의 파일이 존재합니까? : "
														+ dirsFile.exists());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
