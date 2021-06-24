package com.hmd.qrcode.view.mainframe.event;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.hmd.qrcode.view.mainframe.MainFrame;

public class MouseEventBtnClear extends MouseAdapter{
	
	private MainFrame frame;

	public MouseEventBtnClear(MainFrame frame) {
		super();
		this.frame = frame;
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		frame.getBtnClear().setBackground(new Color(255,0,0));
		frame.getBtnClear().setForeground(new Color(255,255,255));
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		frame.getBtnClear().setBackground(new Color(255, 255, 255));
		frame.getBtnClear().setForeground(new Color(0,0,0));
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		frame.getInpContents().setText(null);
		frame.getInpFileName().setText(null);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
