package com.hmd.qrmaker.index;

import java.io.IOException;

import com.hmd.servlet.http.Request;
import com.hmd.servlet.http.Response;
import com.hmd.servlet.strategy.Servlet;

public class IndexController implements Servlet{

	@Override
	public void doGet(Request reqeust, Response response) throws IOException {
		
		response.sendResponse(indexTemplate());
		
	}
	
	private String indexTemplate() {
		return "<div style='background-image: "
				+ "       url(https://post-phinf.pstatic.net/MjAyMDA3MDVfNTYg/MDAxNTkzOTI1Mzc0ODE5.o3B7kLsyl8DObAcpAaUWSA9BjNcNett3MzWnjfhR4MMg.wbizUF4GQf3N8qG4rp2cWcX-gz5fZGJ6bCOkPyFjYRUg.JPEG/13.jpg?type=w1200)"
				+ "'>" + "<h1>QRCode 다운로드 받는 사이트</h1>" 
				+ "<h2>QR코드 원하세요?</h2>" 
				+ "<form action='/qrcode'>\n"
				+ "<h4>다운 받을 파일 이름  *************</h4> \n" 
				+ "<input type='text' name='fileName' required/> \n"
				+ "<h4>QR코드로 만들 문자열 *************</h4> \n" 
				+ "<input type='text' name='contents' required/> \n"
				+ "<h4>QR코드 색상 *************</h4> \n" 
				+ "<input type='color' name='color' required/> \n"
				+ "<button>전송</button> \n" 
				+ "</form> \n";
	}
}
