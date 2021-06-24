package com.hmd.qrmaker.qr.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.hmd.qrmaker.qr.model.service.QRService;
import com.hmd.servlet.http.Request;
import com.hmd.servlet.http.Response;
import com.hmd.servlet.strategy.Servlet;


public class QRController implements Servlet{
	
	@Override
	public void doGet(Request request, Response response) throws IOException {
		
		try {
			
			QRService service = new QRService();
			int color = parseRGBStringToInt(request.getParameter("color"));
			
			BitMatrix matrix = service.createQR(request.getParameter("contents"));
			MatrixToImageConfig config = service.createQRConfig(color);
			
			Map<String,String> header  = new HashMap<String, String>();
			header.put("Content-Type", "text/html; Charset=utf-8");
			header.put("Content-Disposition", "attachment; filename=" + request.getParameter("fileName") + ".jpg");
			
			response.setHttpHeader(header);
			MatrixToImageWriter.writeToStream(matrix, "jpg", response.getResponseStream(), config);
			
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int parseRGBStringToInt(String color) {
		color = color.substring(1);
		color = "ff" + color;
		long l = Long.parseLong(color, 16);
		return (int) l;
	}
	

}
