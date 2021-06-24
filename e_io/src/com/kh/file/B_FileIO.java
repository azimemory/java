package com.kh.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class B_FileIO {
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
		//		객체를 입출력할 수 있도록 기능을 제공
		// InputStreamReader/OutputStreamWriter
		//		바이트기반의 스트림을 문자기반의 스트림으로 변환
	
	Scanner sc = new Scanner(System.in);
	
	//OutputStream : 출력스트림
	//			프로그램(메모리)에 있는 데이터를 외부자원(데이터목적지)로 출력하는 스트림
	public void fileOut() {
		System.out.print("파일명 : ");
		String fileName = sc.nextLine();
		System.out.print("문구를 작성하세요 : ");
		String contents = sc.nextLine();
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(fileName);
			//getBytes() : 문자열을 바이트 배열로 반환
			//write() : 연결된 Stream에 데이터를 전송
			fos.write(contents.getBytes());
			System.out.println("파일 생성이 완료되었습니다. 프로젝트를 새로고침하세요.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//열었던 OutputStream을 닫아준다.
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	//InputStream : 입력스트림
	//		외부자원으로 부터 프로그램(메모리)로 데이터를 가져오는 스트림
	public void fileIn() {
		System.out.print("읽어올 파일명을 작성하세요 : ");
		String fileName = sc.nextLine();
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(fileName);
			int check = 0;
			String res = "";
			
			while(check != -1) {
				check = fis.read();
				res += (char)check;
			}
			
			//checkEncoding(res);
			res = new String(res.getBytes("iso-8859-1"),"utf-8");
			System.out.println(res);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileInOut() {
		System.out.print("읽어올 자원의 경로를 입력하세요 : ");
		String url = sc.nextLine();
		System.out.print("저장할 파일명을 입력하세요 :");
		String fileName = sc.nextLine();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//파일 저장에 걸리는 시간을 측정
		System.out.println("NoBuffer : " + System.currentTimeMillis());
		
		try {
			fis = new FileInputStream(url);
			fos = new FileOutputStream(fileName);
			
			int check = 0;
			while(check != -1) {
				check = fis.read();
				fos.write(check);
			}
			
		//파일 저장에 걸리는 시간을 측정
		System.out.println("NoBuffer : " + System.currentTimeMillis());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void checkEncoding(String encode) {
		String [] charSet = {"utf-8","euc-kr","ksc5601","iso-8859-1","x-windows-949"};
		for (int i=0; i<charSet.length; i++) {
			for (int j=0; j<charSet.length; j++) {
				try {
					System.out.println("[" + charSet[i] +"," + charSet[j] +"] = " 
					+ new String(encode.getBytes(charSet[i]), charSet[j]));

				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
