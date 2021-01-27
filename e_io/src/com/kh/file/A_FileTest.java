package com.kh.file;

import java.io.File;
import java.io.IOException;

public class A_FileTest {
	
	//1. IO
	// 입출력 : 외부자원(키보드, 파일, DB서버, API서버 등등)f로 부터
	//		자바 프로그램으로(메모리로) 데이터를 읽어오거나 반대로 외부자원에 출력하는 것.
	
	//2. Stream
	// 데이터가 오가는 단방향 통로이다. 즉 하나의 Stream으로 입력과 출력을 모두 해결할 수 없다.
	// 입렵과 출력을 하기 위해서는 반드시 두개의 Stream이 필요하다.
	// Stream의 사용이 끝나면 반드시 Stream을 닫아줘야한다.(close()) 
	// 만약 사용이 끝난 Stream을 닫아주지 않으면 JVM이 알아서 닫아준다. 하지만 예상하지 못한 예외상황이 발생할 수 
	// 있음으로 반드시 수동으로 닫아줘야 한다.
	
	//3. Stream의 구분
	// - 바이트스트림과 문자스트림으로 구분
	// 	바이트스트림은 Stream을 통해서 입출력되는 데이터의 크기가 1바이트 단위
	//	문자스트림은 Stream을 통해 입출력되는 데이터의 크기가 2바이트 단위
	//	->자바의 문자는 2바이트이기 때문에 바이트스트림을 통해 문자를 주고 받을 경우, 데이터가 유실되거나 문제가 
	//	  발생하는 경우가 있다. 2바이트 단위로 데이터를 입출력하는 문자스트림이 문자를 다룰때는 안전하다.

	
	// - 기반스트림과 보조스트림으로 구분
	// 기반스트림 : 실제로 외부자원과 데이터를 입출력하는 스트림
	//	FileInputStream/FileOutputStream		- 파일 입출력 스트림
	//	PipedInputStream/PipedOutputStream		- 쓰래드간 데이터를 입출력
	//  ByteArrayInputStream/ByteArrayOutputStream - 바이트 배열에 입출력
	
	// 보조스트림 : 기반스트림에 기능을 추가해주는 클래스
	// BufferedInputStream/BufferedOutputStream
	//		중간 버퍼를 생산해 입출력 속도를 향상
	// ObjectInputStream/ObjectOutputStream
	//		객체를 파일 또는 네트워크와 입출력할 수 있도록 기능을 제공
	// InputStreamReader/OutputStreamWriter
	//		바이트기반의 스트림을 문자기반의 스트림으로 변환
	
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
			//파일에 지정한 경로가 존재하면
			if(dir.exists()) {
				//파일을 생성
				dirsFile.createNewFile();
			//존재하지 않으면
			}else {
				//경로를 먼저 생성한 뒤
				dir.mkdirs();
				//파일을 생성
				dirsFile.createNewFile();
			}
			
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
