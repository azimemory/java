package com.kh.prac9.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
	Scanner sc = new Scanner(System.in);
	public FileController() {}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		System.out.print("���Ͽ� ������ ������ �Է��Ͻÿ�(\"exit\"�� �Է��ϸ� ���� �Է� ��) : ");
		
		String content = null;
		
		while(true) {
			content = sc.nextLine();
			if(content.equalsIgnoreCase("exit"))
				break;
			else {
				sb.append(content);
				sb.append("\n");
			}			
			
		}
		
		System.out.print("�����Ͻðڽ��ϱ�? (y/n)");
		String save = sc.nextLine();
		
		if(save.equalsIgnoreCase("y")) {
			System.out.print("������ ���ϸ��� �Է��Ͻÿ� : ");
			String fileName = sc.nextLine();
			BufferedWriter bw = null;
			
			try{
				bw = new BufferedWriter(new FileWriter(fileName+".txt"));
				bw.write(sb.toString());
				System.out.println(fileName + ".txt ���Ͽ� ���������� �����Ͽ����ϴ�.");
				
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					bw.close();					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}else {	
			System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
		}
	}
	
	public void filOpen() {
		System.out.print("���� �� ���ϸ� : ");
		String fileName = sc.nextLine();
		BufferedReader br = null;
		String content = null;
		try {
			
			br = new BufferedReader(new FileReader(fileName+".txt"));
			while((content = br.readLine()) != null) {
				System.out.println(content);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void fileEdit() {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		System.out.print("������ ���ϸ� : ");
		String fileName = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String content = null;
		
		try{
			
			br = new BufferedReader(new FileReader(fileName+".txt"));
			bw = new BufferedWriter(new FileWriter(fileName+".txt", true));	// ���� ���� ���� �״�� �ΰ� �߰�
			
			while((content = br.readLine()) != null) {
				System.out.println(content);
			}
			
			System.out.print("���Ͽ� �߰��� ������ �Է��Ͻÿ� : ");
			while(true) {
				content = sc.nextLine();
				if(content.equalsIgnoreCase("exit"))
					break;
				else {
					sb.append(content);
					sb.append("\n");
				}			
			}
			
			System.out.print("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n)");
			String save = sc.nextLine();
			
			if(save.equalsIgnoreCase("y")) {
				bw.write(sb.toString());
				System.out.println(fileName + ".txt ������ ������ ����Ǿ����ϴ�.");		
			}else {
				System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
