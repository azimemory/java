package com.kh.prac9.run;

import java.util.Scanner;

import com.kh.prac9.controller.FileController;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileController fc = new FileController();
		while(true) {
			
			System.out.println("****** MyNote ******");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("4. ������");
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : fc.fileSave(); break;
			case 2 : fc.filOpen(); break;
			case 3 : fc.fileEdit(); break;
			case 4 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); continue;
			}
		}
	}
}
