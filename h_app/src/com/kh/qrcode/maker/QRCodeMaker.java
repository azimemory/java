package com.kh.qrcode.maker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCodeMaker {

	//zxing : android용 바코드, QRCode 관련 라이브러리  
	public void makeQR(String url, String fileName) {
		//1. 원하는 색상의 QR코드 제작해보기
		//2. 사용자가 원하는 내용의 QR코드를 원하는 파일명으로 여러장을 한번에 생성할 수 있도록 기능 확장
		try {
			BitMatrix bm = new QRCodeWriter().encode(url, BarcodeFormat.QR_CODE, 200, 200);
			
			String filePath = "C:\\QRCode\\";
			//경로의 존재여부를 판단하고 필요하다면 경로를 생성 해줄 파일 객체
			File path = new File(filePath);
			
			//만약 경로가 존재하지 않는다면
			if(!path.exists()) {
				//경로를 생성
				path.mkdirs();
			}
			
			//C:\QRCode 폴더에 QR코드 파일 저장
			MatrixToImageWriter.writeToStream(bm, "jpg", new FileOutputStream(
					filePath+fileName+".jpg"));
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
