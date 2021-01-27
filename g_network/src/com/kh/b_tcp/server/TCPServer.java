package com.kh.b_tcp.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	//1. 서버가 먼저 실행되어 클라이언트의 요청을 기다려야한다.
	//2. 클라이언트의 첫번 째 요청을 받기위한 소켓이 하나는 늘 열려있어야 한다.
	//		-> 첫 요청을 받기 위해 먼저 열어두고 있는 socket을 serverSocket이라 한다.
	//		-> ServerSocket은 클라이언트의 요청이 들어오면 해당 클라이언트와 통신을 할 socket을
	//		 생성해준다.
	
	public void serverStart() {
		
		//1. 서버의 포트를 결정
		int port = 8989;
		
		ServerSocket serverSocket = null;
		Socket client = null;
		PrintWriter writer = null;
		BufferedReader reader = null;
		
		try {
			//2. ServerSocket 생성
			serverSocket = new ServerSocket(port);
			
			//3. 클라이언트로부터 접속요청이 올때까지 대기
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			//4. 접속요청이 오면 요청 수락 후 해당 클라이언트와 통신할 소켓을 생성
			client = serverSocket.accept();
			System.out.println(client.getInetAddress().getHostAddress()
					+ "가 연결을 요청하였습니다...");
			
			//5. 연결된 클라이언트와 입출력 스트림을 생성
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			//6. 보조스트림을 사용해서 성능 개선
			writer = new PrintWriter(output);
			reader = new BufferedReader(new InputStreamReader(input));
			
			//7. 스트림을 통해서 읽고 쓰기
			//클라이언트 -> 서버로 전송한 메세지 읽음
			String message = reader.readLine();
			System.out.println(client.getInetAddress().getHostAddress()
					+ ":" + message);
			
			//8. 서버 -> 클라이언트로 메세지 전송
			writer.println(message + " 라고 말했구나! 참 잘했어!");
			writer.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//메시지 전달이 끝나면 통신 종료
			try {
				writer.close();
				reader.close();
				client.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
