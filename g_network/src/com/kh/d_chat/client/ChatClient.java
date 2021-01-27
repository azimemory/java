package com.kh.d_chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {
	private Socket socket;
	private String host;
	private int port;
	Scanner sc = new Scanner(System.in);
	
	public void chatStart() {
		connect();
		//새로운 thread start 시키고
		read();
		//main thread가 무한 반복문으로 계속해서 사용자의 입력을 대기하다가 서버에게 메세지를 보내야한다.
		write();
	}
	
	private void connect() {
		try {
			System.out.print("서버 IP : ");
			host = sc.nextLine();
			
			System.out.print("서버 port : ");
			port = sc.nextInt();
			
			socket = new Socket(host,port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void write() {
		//버퍼 비우는 용도
		sc.nextLine();
		
		//닉네임 입력
		System.out.print("닉네임 : ");
		String userId = sc.nextLine();
		
		while(true) {
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			System.out.print("입력 : ");
			String msg = sc.nextLine();
			
			PrintWriter writer = null;
			
			try {
				writer = new PrintWriter(socket.getOutputStream());
				writer.println(userId + ":" + msg);
				writer.flush();
			} catch (IOException e) {
				try {
					writer.close();
					socket.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	
	private void read() {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				BufferedReader br = null;
				
				while(true) {
					try {
						br = new BufferedReader(
								new InputStreamReader(socket.getInputStream()));
						
						String data = br.readLine();
						if(data != null) {
							System.out.println("\n"+data);
						}
				
					} catch (IOException e) {
						try {
							br.close();
							socket.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		});
		
		thread.start();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
