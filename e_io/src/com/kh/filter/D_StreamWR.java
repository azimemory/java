package com.kh.filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//InputStreamReader : InputStream -> Reader
//OutputStreamWriter : OutputStream -> Writer
public class D_StreamWR {
	
	Scanner sc = new Scanner(System.in);
	
	public void writerWithStream() {
		System.out.print("파일명을 작성하세요 : ");
		String fileName = sc.nextLine();
		System.out.println("문구를 작성하세요 : ");
		String contents = sc.nextLine();
		
		//OutputStreamWriter를 사용해서
		//사용자가 입력한 파일경로에 있는 파일에 사용자가 입력한 문구를 출력하세요
		try(OutputStreamWriter osw 
				= new OutputStreamWriter(new FileOutputStream(fileName))){
			
			osw.write(contents);
			System.out.println("파일 생성이 완료되었습니다. 프로젝트를 새로고침하세요.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	//InputStreamReader
	public void readerWithStream() {
		System.out.print("읽어올 파일명을 작성하세요 : ");
		String fileName = sc.nextLine();
		
		try(BufferedReader br
				= new BufferedReader(
						new InputStreamReader(
						new FileInputStream(fileName)))){
			
			System.out.println(br.readLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
