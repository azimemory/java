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
		System.out.println("입력한 것을 파일에 저장과 함께 콘솔에 출력해보기 ");
		try {
			// 파일 생성
//			f.createNewFile();
			
			// 콘솔로부터 값 입력 받기
			bis = new BufferedInputStream(System.in,1024);
			bis.read(bt);
			
			// 파일 출력 스트림 열기
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
