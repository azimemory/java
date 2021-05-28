package com.kh.prac8.controller;

import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

import com.kh.prac8.model.vo.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);
	public BookManager() {}
	
	public void fileSave() {
		Book[] bk = new Book[5];
		
		bk[0] = new Book("C¾ð¾î", "±è¾¾", 10000, setCalendar(2012,2,2), 0.1);
		bk[1] = new Book("ÀÚ¹Ù", "ÀÌ¾¾", 20000, setCalendar(2013,3,3), 0.2);
		bk[2] = new Book("C++", "¹Ú¾¾", 30000, setCalendar(2014,4,4), 0.3);
		bk[3] = new Book("³ÓÁö", "¼­¾¾", 40000, setCalendar(2015,5,5), 0.4);
		bk[4] = new Book("¿¬±Ý¼ú»ç", "ÃÖ¾¾", 50000, setCalendar(2016,6,6), 0.5);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))){
			
			for(int i=0;i<bk.length;i++) {
				oos.writeObject(bk[i]);				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public Calendar setCalendar(int year, int month, int date) {
		Calendar pDate = Calendar.getInstance();
		pDate.set(year, month-1, date);
		
		return pDate;
	}
	
	public void fileRead() {

		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))){
		
			while(true) {
				System.out.println((Book)ois.readObject());
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("books.dat ÀÐ±â ¿Ï·á!");			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
