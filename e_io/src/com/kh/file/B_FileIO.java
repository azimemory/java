package com.kh.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class B_FileIO {
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
