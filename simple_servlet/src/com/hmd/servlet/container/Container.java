package com.hmd.servlet.container;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

import com.hmd.servlet.http.Request;
import com.hmd.servlet.http.Response;
import com.hmd.servlet.strategy.HandlerMapping;
import com.hmd.servlet.strategy.Servlet;

public class Container implements Runnable{
	
	private LinkedBlockingQueue<Socket> socketPool;
	private HandlerMapping handlerMapper;
	
	public Container(HandlerMapping handlerMapper, LinkedBlockingQueue<Socket> socketPool) {
		this.handlerMapper = handlerMapper;
		this.socketPool = socketPool;
	}

	@Override
	public void run() {
	
		while(true) {
			
			try (	Socket clientSocket = socketPool.take();
					BufferedOutputStream bos = new BufferedOutputStream(clientSocket.getOutputStream());
					BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
				
				String statusLine = br.readLine();
				String path = parseURL(statusLine); //url파싱
				
				Servlet target = handlerMapper.mappingServletWithURL(path); //Servlet 반환
				Request request = new Request(br, parseParameter(statusLine)); //Request객체 생성
				Response response = new Response(bos); //Response 객체 생성
				
				target.doGet(request, response); //요청 응답 처리
				
			} catch (IOException e ) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			} 
		}
	}
	
	private String parseURL(String statusLine) {
		
		if(statusLine.contains("?")) {
			return statusLine.substring(statusLine.indexOf("/")+1,statusLine.lastIndexOf("?"));
		}
		
		String temp = statusLine.substring(statusLine.indexOf("/"),statusLine.lastIndexOf(" "));
		return temp;	
	}
	
	private Map<String, String> parseParameter(String statusLine) throws UnsupportedEncodingException {
		Map<String, String> parameter = null;
		
		statusLine = statusLine.substring(statusLine.indexOf("?") + 1, statusLine.lastIndexOf(" "));
		statusLine = URLDecoder.decode(statusLine, Config.CHARSET);

		if (statusLine.contains("&")) {
			parameter = new HashMap<>();
			for (String param : statusLine.split("&")) {
				String[] entryArr = param.split("=");
				parameter.put(entryArr[0], entryArr[1]);
			}
		}

		return parameter;
	}
}
