package com.hmd.qrmaker;

import com.hmd.qrmaker.index.IndexController;
import com.hmd.qrmaker.qr.controller.QRController;
import com.hmd.servlet.Server;
import com.hmd.servlet.strategy.HandlerMapping;
import com.hmd.servlet.strategy.Servlet;

public class Run {

	public static void main(String[] args) {
		
		Server server = new Server(new HandlerMapping() {
	
			@Override
			public Servlet mappingServletWithURL(String url) {
				Servlet servlet = null;
				switch (url) {
					case "index": servlet = new IndexController();
						break;
					case "qrcode": servlet = new QRController();
						break;
					default : servlet = new IndexController();
				}
				return servlet;
			}
		});
		
		server.serverStart();
	}
	
}
