package com.kh.filter;

public class Run {
	public static void main(String[] args) {
		A_BufferedIO bio = new A_BufferedIO();
		//bio.bufferedWithFile();
		
		B_BufferedWR bwr = new B_BufferedWR();
		//bwr.bufferedWriter();
		
		C_ObjectIO oio = new C_ObjectIO();
		//oio.objectInput();
		
		C_ObjectIO2 oio2 = new C_ObjectIO2();
		//oio2.objectOutput();
		
		E_PrintWriter writer = new E_PrintWriter();
		writer.printWriter();
		
		
	}
}
