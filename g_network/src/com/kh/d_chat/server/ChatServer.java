package com.kh.d_chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	
	private ServerSocket server;
	private List<Socket> socketList;
	
	public ChatServer() {
		try {
			server = new ServerSocket(8989);
			socketList = new ArrayList<Socket>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void startServer() {
		System.out.println("서버를 시작합니다...");
		while(true) {
			try {
				Socket client = server.accept();
				socketList.add(client);
				System.out.println("===========================");
				System.out.println("입장인원 : " + socketList.size());
				System.out.println("===========================");
				read(client);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void read(Socket socket) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				BufferedReader br = null;
				try {
					br = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
					
					while(true) {
						String data = br.readLine();
						if(data != null) {
							allClientWrite(data);
						}
					}
					
				} catch (IOException e) {
					try {
						br.close();
						removeSocket(socket);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		thread.start();
	}
	
	public void allClientWrite(String msg) {
		PrintWriter writer = null;
		for (Socket client : socketList) {
			try {
				writer = new PrintWriter(client.getOutputStream());
				writer.println(msg);
				writer.flush();
			} catch (IOException e) {
				writer.close();
				removeSocket(client);
			}
		}		
	}
	
	//SocketList에서 예외가 발생한 Socket 제거
	public void removeSocket(Socket socket) {
		System.out.println("socket is close");
		System.out.println("================================");
		System.out.println("접속인원 : " + socketList.size());
		
		try {
			//매개변수로 넘어온 socket을 list에서 제거
			socketList.remove(socket);
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("접속인원 : " + socketList.size());
		System.out.println("================================");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
