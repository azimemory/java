package com.kh.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class question2 {
	
	public static void main(String[] args) {
		new question2().fileSave("test.dat");
	}
	
	public void fileSave(String fileName) {
		ObjectOutputStream oos = null;
		File file = new File(fileName);
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			 oos =	new ObjectOutputStream(fos);
			
			Book book = new Book("자바를 정복하자",35000);
			oos.writeObject(book);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
