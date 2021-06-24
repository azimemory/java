package com.hmd.qrmaker.qr.model.service;

import java.io.IOException;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRService {
	
	public BitMatrix createQR(String contents) throws WriterException, IOException {
		QRCodeWriter qrMaker = new QRCodeWriter();
		BitMatrix matrix = qrMaker.encode(contents, BarcodeFormat.QR_CODE, 1000, 1000);
		return matrix;
	}
	
	public MatrixToImageConfig createQRConfig(int color) {
		return new MatrixToImageConfig(color, MatrixToImageConfig.BLACK); 
	}
}
