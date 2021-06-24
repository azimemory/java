package com.kh.e_qr;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRServer {

	private ServerSocket serverSocket;

	public QRServer() {
		try {
			serverSocket = new ServerSocket(9191);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void serverStart() {
		
		System.out.println("QR 싱글쓰래드 서버 시작 합니다...");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		
		while (true) {
			try (Socket clientSocket = serverSocket.accept();
					BufferedOutputStream bos = new BufferedOutputStream(clientSocket.getOutputStream());
					BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
			) {

				String request = br.readLine();
				request = URLDecoder.decode(request, "utf-8");
				Map<String, String> parameter = getParameter(request);
				System.out.println(parameter);
				String response = httpHeader();

				if (parameter != null) {
					response = qrHttpHeader(parameter.get("fileName"));					
					sendResponse(bos, response);
					createQR(bos,parameter.get("contents"),parameter.get("color"));
					continue;
				}
				
				response +=  indexTemplate();
				sendResponse(bos, response);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (WriterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

	private void sendResponse(BufferedOutputStream writer, String response) throws IOException {
		writer.write(response.getBytes());
		writer.flush();
	}

	private String httpHeader() {
		return "HTTP/1.1 200 ok \n" + "Content-Type: text/html; Charset=utf-8 \n\n";
	}

	private String qrHttpHeader(String fileName) {
		return "HTTP/1.1 200 ok \n" 
				+ "Content-Type: text/html; Charset=utf-8 \n"
				+ "Content-Disposition: attachment; filename="+fileName+".jpg \n\n";
	}

	private String indexTemplate() {
		return "<div style='background-image: "
				+ "		 url(https://post-phinf.pstatic.net/MjAyMDA3MDVfNTYg/MDAxNTkzOTI1Mzc0ODE5.o3B7kLsyl8DObAcpAaUWSA9BjNcNett3MzWnjfhR4MMg.wbizUF4GQf3N8qG4rp2cWcX-gz5fZGJ6bCOkPyFjYRUg.JPEG/13.jpg?type=w1200)"
				+ "'>" 
				+ "<h1>QRCode 다운로드 받는 사이트</h1>" 
				+ "<h2>QR코드 원하세요?</h2>" 
				+ "<form action='/'>\n"
				+ "<h4>다운 받을 파일 이름  *************</h4> \n"
				+ "<input type='text' name='fileName' required/> \n"
				+ "<h4>QR코드로 만들 문자열 *************</h4> \n"
				+ "<input type='text' name='contents' required/> \n"
				+ "<h4>QR코드 색상 *************</h4> \n"
				+ "<input type='color' name='color' required/> \n"
				+ "<button>전송</button> \n"
				+ "</form> \n";
	}
	
	private void createQR(BufferedOutputStream bos, String contents, String color) throws WriterException, IOException {
		QRCodeWriter qrMaker = new QRCodeWriter();
		BitMatrix matrice = qrMaker.encode(contents, BarcodeFormat.QR_CODE, 1000, 1000);
		
		MatrixToImageConfig config 
		= new MatrixToImageConfig(parseRGBStringToInt(color), MatrixToImageConfig.WHITE);
		MatrixToImageWriter.writeToStream(matrice, "jpg", bos, config);
	}
	
	private int parseRGBStringToInt(String color) {
		color = color.substring(1);
		color = "ff" + color;
		long l = Long.parseLong(color, 16);	
		return (int)l;
	}
	
	private Map<String,String> getParameter(String request){
		Map<String, String> parameter = null;

		if (request.contains("?")) {				
			request = request.substring(request.indexOf("?") + 1, request.lastIndexOf(" "));
			parameter = new HashMap<>();
			for (String param : request.split("&")) {
				String[] entryArr = param.split("=");
				parameter.put(entryArr[0], entryArr[1]);
			}
		}
		
		return parameter;
	}
	
	
	
}
