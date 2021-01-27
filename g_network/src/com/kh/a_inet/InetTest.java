package com.kh.a_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
	
	//1. 네트워크 : 통신회선으로 여러 대의 컴퓨터를 연결한 것.
	//		네트워크에 연결된 모든 종류의 장치를 노드라고 부른다.
	
	//2. IP : 네트워크 상에서 컴퓨터를 식별하는 번호
	//		노드 중에서 IP주소가 할당된 노드를 호스트(Host)라고 부른다.
	
	//3. Port :  호스트에서는 여러 프로세스가 동시에 동작하고 있다.
	//			데이터를 전달해 줄 프로세스를 식별하는 번호.
	
	//4. socket : 프로세스가 네트워크를 통해 데이터를 주고받기 위해 반드시 열어야하는 통로
	//			네트워크 통신망의 양 끝점이다.
	
	//5. 통신 규약
	// TCP(transmission control protocol) :
	//		1:1통신, 연결기반, ByteStream기반, 안정성과 순서보장, 자동패킷분할
	// UDP(user datagram protocol) :
	//		1:n, n:m 통신, 비연결기반, 데이터그램 기반, 순서보장 X, 빠른 속도
	
	public void ipTest() {
		
		//InetAddress
		try {
			//내 컴퓨터의 IP주소와 관련된 정보를 보관하는 인스턴스
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 IP : " + local.getHostAddress());
			System.out.println("내 PC : " + local.getHostName());
			
			//도메인명을 통해 IP주소와 관련된 정보를 보관하는 인스턴스
			InetAddress naverIP = InetAddress.getByName("www.naver.com");
			System.out.println("네이버 서버 이름 : " + naverIP.getHostName());
			System.out.println("네이버 서버 IP : " + naverIP.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
