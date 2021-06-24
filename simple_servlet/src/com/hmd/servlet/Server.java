package com.hmd.servlet;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.hmd.servlet.container.Config;
import com.hmd.servlet.container.Container;
import com.hmd.servlet.strategy.HandlerMapping;

/**
 * 서버
 * @author azimemory
 *
 */
public class Server {

	private ServerSocket serverSocket; 
	private LinkedBlockingQueue<Socket> socketPool; 
	
   public Server(HandlerMapping handlerMapper) {
		try {
			
			serverSocket = new ServerSocket(Config.PORT);
			socketPool = new LinkedBlockingQueue<>();
			
			for (int i = 0; i < 50; i++) {
				new Thread(new Container(handlerMapper,socketPool)).start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void serverStart() {

		System.out.println("서버 시작 합니다...");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		
		while(true) {
			try {
				socketPool.put(serverSocket.accept()); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				
			}
		}
	}
}