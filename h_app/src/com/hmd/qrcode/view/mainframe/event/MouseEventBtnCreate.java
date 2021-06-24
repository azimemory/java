package com.hmd.qrcode.view.mainframe.event;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import com.hmd.qrcode.maker.QRMaker;
import com.hmd.qrcode.view.mainframe.MainFrame;

public class MouseEventBtnCreate extends MouseAdapter{
	
	private MainFrame frame;
	
	public MouseEventBtnCreate(MainFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		frame.getBtnCreate().setBackground(new Color(255,0,0));
		frame.getBtnCreate().setForeground(new Color(255, 255, 255));
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		frame.getBtnCreate().setBackground(new Color(255, 255, 255));
		frame.getBtnCreate().setForeground(new Color(0,0,0));
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		String fileNameList = frame.getInpFileName().getText();
		String contentsList = frame.getInpContents().getText();
		QRMaker qrMaker = new QRMaker();
		
		for (Map<String,String> qrMap : parseData(fileNameList, contentsList)) {
			qrMaker.creatQR(qrMap.get("fileName"),qrMap.get("contents"));
		}
		
		JOptionPane.showMessageDialog(null, "다운로드가 완료되었습니다.");
	}

	
	private List<Map<String,String>> parseData(String fileNameList, String contentsList) {
		
		List<Map<String,String>> res = new ArrayList<Map<String,String>>();
		
		String[] fileNameArr = fileNameList.split("\n");
		String[] contentsArr =  contentsList.split("\n");
		
		String logName = createLogFileName();
		
		try (FileWriter fw = new FileWriter(logName)) {
			
			int len = fileNameArr.length;
			int QRCnt = 0;
			
			if(fileNameArr.length != contentsArr.length) {
				len = fileNameArr.length < contentsArr.length?fileNameArr.length:contentsArr.length;
				fw.write("짝이 맞지 않는 데이터 입니다. \n");
			}
			
			for (int i = 0, n = 1; i < len; i++, n++) {
				Map<String,String> qrContents = new HashMap<String, String>();
				
				String fileName = fileNameArr[i].trim();
				String contents = contentsArr[i].trim();
				
				if(fileName.equals("") || contents.equals("")) {
					fw.write(n + "번째 데이터의 파일명이나 contents 중 공백이 있습니다. \n");
					continue;
				}
				
				qrContents.put("fileName", fileName);
				qrContents.put("contents", contents);
				res.add(qrContents);
				QRCnt++;
			}
			
			fw.write(QRCnt + "개 QR 생성을 완료하였습니다. \n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	private String createLogFileName() {
		Calendar cal = Calendar.getInstance();
		String logName = "" + cal.get(Calendar.YEAR) 
							 + (cal.get(Calendar.MONTH)+1) 
							 + cal.get(Calendar.DATE)
							 + cal.get(Calendar.HOUR)+"-"
							 + cal.get(Calendar.MINUTE)+"-"
							 + cal.get(Calendar.SECOND)
							 + ".txt";
		return "/CODE/QRFILE/LOG/" + logName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
