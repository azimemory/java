package com.kh.prac7.run;

import com.kh.prac7.controller.SungjukProcess;

public class Run {

	public static void main(String[] args) {
		
		SungjukProcess sp = new SungjukProcess();
		sp.sungjukSave();
		sp.scoreRead();
	}

}
