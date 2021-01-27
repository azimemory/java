package com.kh.filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class B_BufferedWR {
	
	Scanner sc = new Scanner(System.in);
	
	public void bufferedReader() {
		
		System.out.print("읽어올 파일명을 작성하세요 : ");
		String fileName = sc.nextLine();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			//readLine()
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void bufferedWriter() {
		System.out.print("파일명을 작성하세요 : ");
		String fileName = sc.nextLine();
		System.out.print("문구를 작성하세요 : ");
		String contents = sc.nextLine();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
			bw.write(contents);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
