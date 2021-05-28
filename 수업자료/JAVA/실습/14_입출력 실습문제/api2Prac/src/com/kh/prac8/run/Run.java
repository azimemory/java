package com.kh.prac8.run;

import com.kh.prac8.controller.BookManager;

public class Run {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();
	}
}
