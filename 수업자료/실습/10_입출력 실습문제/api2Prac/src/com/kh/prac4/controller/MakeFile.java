package com.kh.prac4.controller;

import java.io.File;
import java.io.IOException;

public class MakeFile {

	public void fileMethod() {
		try {
			File dir = new File("dir");
			File[] f = {new File("dir\\file1.txt"),
						new File("dir\\file2.jpg"),
						new File("dir\\file3.dat"),		// �����͸� �����ϴ� �뵵
						new File("dir\\file4.xml")};	
						// ���ͳݿ��� �ٷ� ��� ������ ������ ǥ��(�������� �±׷ν� ��ũ�Ͽ� �ʿ��� ������ �ȿ� ���� ���)

			dir.mkdir();
			for(int i = 0;i<f.length;i++) {
					f[i].createNewFile();	// IOException ó��
			}
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}

}
