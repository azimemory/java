package com.kh.prac7.controller;

import java.io.*;
import java.util.Scanner;

public class SungjukProcess {
Scanner sc = new Scanner(System.in);
	
	public void sungjukSave() {
		int num = 0;
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"))){
			while(true) {
				System.out.println("======������ �������� �Է��Ͻÿ�======");
				System.out.print("���� : ");
				int kor = sc.nextInt();
				System.out.print("���� : ");
				int eng = sc.nextInt();
				System.out.print("���� : ");
				int mat = sc.nextInt();
				
				int sum = kor + eng + mat;
				double avg = sum / 3.0;
				
				dos.writeInt(kor);
				dos.writeInt(eng);
				dos.writeInt(mat);
				dos.writeInt(sum);
				dos.writeDouble(avg);
				String ans =null;
				
				num++;
				System.out.println(num + "��° �л� ���� ���");
				
				while(true) {
					System.out.print("��� �����Ͻðڽ��ϱ�? (y/n)");
					ans = sc.next();
					if(ans.equalsIgnoreCase("y")||ans.equalsIgnoreCase("n")) {
						break;
					}else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
						continue;
					}
				}
				if(ans.equalsIgnoreCase("y")) {
					continue;
				}else if(ans.equalsIgnoreCase("n")) {
					System.out.println("score.dat ���Ͽ� ���� �Ϸ�");
					break;
				}
			}
				
				
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void scoreRead() {
		int kor=0, eng=0, mat=0, sum=0, sumS=0;
		double avg=0.0, avgS=0.0;
		int count=0;
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"))){
			
			while(true) {
				
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				sum = dis.readInt();
				avg = dis.readDouble();
				
				sumS += sum;
				avgS += avg;
				
				count++;
				System.out.println(count + "��° �л�");
				System.out.println("��     ��     ��     ����     ���");
				System.out.printf("%d  %d  %d  %d  %.2f\n", kor, eng, mat, sum, avg);
				
			}
	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
		
			System.out.println("���� Ƚ��     ��ü ���� ���        ��ü ���");
			System.out.printf("  %d        %.2f         %.2f\n", count, sumS/(double)count, avgS/(double)count);
			
			System.out.println("score.dat ���� �б� �Ϸ�!");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
