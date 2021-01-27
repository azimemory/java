package com.kh.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class A_BufferedIO {
	
	Scanner sc = new Scanner(System.in);
	
	//BufferedInputStream
	//기반스트림에게 내부 버퍼를 제공해 속도를 향상 시켜 주는 보조스트림
	//내부 버퍼의 크기만큼 데이터를 외부자원으로 부터 한번에 읽어온 다음
	//사용자가 필요한 만큼 데이터를 반환해준다.
	
	//BufferedOutputStream
	//기반스트림에게 내부 버퍼를 제공해 속도를 향상 시켜주는 보조스트림
	//내부 버퍼에 데이터를 저장한 다음 운영체제에 한번에 출력한다.
	
	public void bufferedWithFile() {
		
		System.out.print("읽어올 자원의 경로를 입력하세요 : ");
		String url = sc.nextLine();
		System.out.print("생성할 파일명을 입력하세요 : ");
		String fileName = sc.nextLine();
		
		//파일 입출력에 걸리는 시간을 체크한다.
		System.out.println("Buffer : " + System.currentTimeMillis());
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(url);
			fos = new FileOutputStream(fileName);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int check = 0;
			while((check = bis.read()) != -1) {
				bos.write(check);
			}
			
			//버퍼가 가득 찰 경우 자동으로 데이터를 외부자원에 보내지만
			//버퍼가 가득 차지 않아서 버퍼에 데이터가 남아있게 되는 경우가 있다.
			//내부버퍼에 남아있는 데이터를 모두 파일로 송출
			bos.flush();
			
			//파일 입출력에 걸리는 시간을 체크한다.
			System.out.println("Buffer : " + System.currentTimeMillis());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//보조스트림을 닫아주면 보조스트림안의 기반스트림까지 한번에 닫아준다.
				bis.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
