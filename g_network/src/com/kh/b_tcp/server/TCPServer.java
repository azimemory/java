package com.kh.b_tcp.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	public void serverStart() {
		//1. 서버의 포트번호 지정
		int port = 8989;
		
		//2. 서버소켓 및 기타 스트림 레퍼런스 선언(null로)
		ServerSocket server = null;
		ObjectInputStream ois = null;
		PrintWriter writer = null;
		Socket client = null;		
		try {
			//3. 서버소켓 생성
			server = new ServerSocket(port);
			
			//4. 클라이언트로부터 접속 요청이 올 때까지 대기
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
			
			//5. 접속요청이 오면 요청 수락 후 클라이언트에 대한 소켓을 생성
			client = server.accept();
			
			//6. 연결한 클라이언트의 IP정보를 출력
			System.out.println("client IP : " 
						+ client.getInetAddress().getHostAddress());
			
			//7. 연결된 클라이언트와 입출력 스트림 생성
			ois = new ObjectInputStream(client.getInputStream());
			writer = new PrintWriter(client.getOutputStream());
			
			//8. 클라이언트로 부터 전송된 객체를 읽어서 출력			
			//	hint : 객체를 읽고 쓸 때는 ObjectInputStream, ObjectOutputStream
			System.out.println(ois.readObject());
			
			//9. 클라이언트에게 'exit' 메시지를 전송
			writer.println("exit");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//10. 통신 종료(스트림 및 소켓 close)
			try {
				ois.close();
				writer.close();
				client.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
