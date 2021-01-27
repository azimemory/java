package com.kh.file;

public class Run {

	public static void main(String[] args) {
		A_FileTest ft = new A_FileTest();
		//ft.doFile();
		
		B_FileIO fio = new B_FileIO();
		//fio.fileInOut();
		
		C_FileWR fwr = new C_FileWR();
		fwr.fileOut();
	}
}
