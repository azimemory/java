package com.kh.prac4.controller;

import java.io.File;
import java.io.IOException;

public class MakeFile {

	public void fileMethod() {
		try {
			File dir = new File("dir");
			File[] f = {new File("dir\\file1.txt"),
						new File("dir\\file2.jpg"),
						new File("dir\\file3.dat"),		// 데이터를 저장하는 용도
						new File("dir\\file4.xml")};	
						// 인터넷에서 바로 사용 가능한 문서를 표현(정보들을 태그로써 마크하여 필요한 내용을 안에 적는 양식)

			dir.mkdir();
			for(int i = 0;i<f.length;i++) {
					f[i].createNewFile();	// IOException 처리
			}
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}

}
