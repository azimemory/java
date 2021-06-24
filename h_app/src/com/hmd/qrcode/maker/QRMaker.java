package com.hmd.qrcode.maker;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRMaker {

	public void creatQR(String fileName, String contents) {
		
		//QR파일을 저장할 경로를 지정
		// ex) /CODE/QRFILE/
		String path = "/CODE/QRFILE/";
		
		//해당 경로에 파일을 생성
		QRCodeWriter qrWriter = new QRCodeWriter();
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + fileName + ".jpg"))) {
			
			BitMatrix matrix = qrWriter.encode(contents, BarcodeFormat.QR_CODE, 1000, 1000);
			MatrixToImageWriter.writeToStream(matrix, "jpg", bos);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriterException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
