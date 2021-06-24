package com.hmd.qrcode;

import java.awt.EventQueue;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.hmd.qrcode.view.mainframe.MainFrame;

public class Run {

	public static void main(String[] args) {

		initDownloadPath();
		initLibPath();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void initDownloadPath() {
		String path = "/CODE/QRFILE/LOG/";
		//해당 경로가 존재하는지 판단해서, 존재하지 않으면 경로를 생성
		File filePath = new File(path);

		if (!filePath.exists()) {
			filePath.mkdirs();
		}
	}

	public static void initLibPath() {
		String libPath = "/QRMAKER_lib/";
		URL coreURL = null;
		URL javaseURL = null;
		
		try {
			coreURL = new URL("https://repo1.maven.org/maven2/com/google/zxing/core/3.4.1/core-3.4.1.jar");
			javaseURL = new URL("https://repo1.maven.org/maven2/com/google/zxing/javase/3.4.1/javase-3.4.1.jar");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		File libDirPath = new File(libPath);
		if (!libDirPath.exists()) {
			libDirPath.mkdirs();
			try (BufferedInputStream corefis = new BufferedInputStream(coreURL.openStream());
					BufferedInputStream javasefis = new BufferedInputStream(javaseURL.openStream());
					BufferedOutputStream corefos = new BufferedOutputStream(
							new FileOutputStream(libPath + "core-3.4.1.jar"));
					BufferedOutputStream javasefos = new BufferedOutputStream(
							new FileOutputStream(libPath + "javase-3.4.1.jar"));) {

				int coreByte = 0;
				int javaseByte = 0;

				while ((coreByte = corefis.read()) != -1) {
					corefos.write(coreByte);
				}

				while ((javaseByte = javasefis.read()) != -1) {
					javasefos.write(javaseByte);
				}

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
