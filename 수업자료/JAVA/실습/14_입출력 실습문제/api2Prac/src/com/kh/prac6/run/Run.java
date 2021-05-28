package com.kh.prac6.run;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		byte[] bt = new byte[1024];
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
//		File f = new File("input.txt");
//		FileOutputStream fos = null;
		System.out.println("�Է��� ���� ���Ͽ� ����� �Բ� �ֿܼ� ����غ��� ");
		try {
			// ���� ����
//			f.createNewFile();
			
			// �ַܼκ��� �� �Է� �ޱ�
			bis = new BufferedInputStream(System.in,1024);
			bis.read(bt);
			
			// ���� ��� ��Ʈ�� ����
			bos = new BufferedOutputStream(new FileOutputStream("input.txt"));
			bos.write(bt);
			
			System.out.println(new String(bt));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
