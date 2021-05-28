package com.kh.prac5.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInOut {
	public void filePrac() {
		OutputStream os = null;
		InputStream is = null;
		
		try {
			os = new FileOutputStream("prac.txt");
			is = new FileInputStream("prac.txt");
			
			String str = "Hey!guys!\nDo your best!!\nDon't give up!!";
			os.write(str.getBytes());
			
			int check = 0;
			while((check=is.read())!=-1) {
				System.out.print((char)check);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
				is.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
