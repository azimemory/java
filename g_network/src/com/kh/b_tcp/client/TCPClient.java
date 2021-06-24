package com.kh.b_tcp.client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	
	public void clientStart() {
		
		//1. 서버의 IP와 Port를 가지고 있는 변수 선언
		String ip = "192.168.20.102";
		int port = 8989;
		
		//2. Socket 및 스트림 변수 선언(null로)
		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		BufferedReader br = null;
				
		
		try {
			//3. 서버의 IP와 Port로 통신할 Socket 생성
			socket = new Socket(ip,port);
			
			//4. 연결에 성공하면 서버와의 입출력스트림 생성
			if(socket != null) {
				oos = new ObjectOutputStream(socket.getOutputStream());
				br = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
			}
			
			//5. music.dat 파일을 읽어서 서버로 전송
			//hint : 객체를 읽고 쓸때는 ObjectInputStream ObjectOutputStream
			ois = new ObjectInputStream(new FileInputStream("music.dat"));
			oos.writeObject(ois.readObject());
									
			//6. 서버로부터 끝났다는 메시지(exit)가 돌아오면 통신을 종료
			//		각종 스트림을 반환하고 socket을 닫아준다.
			if(br.readLine().equals("exit")) {
				System.out.println("서버가 exit 전송함.");
				ois.close();
				oos.close();
				br.close();
				socket.close();
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
