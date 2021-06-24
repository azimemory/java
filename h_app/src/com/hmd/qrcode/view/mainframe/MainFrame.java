package com.hmd.qrcode.view.mainframe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

import com.hmd.qrcode.view.mainframe.event.MouseEventBtnClear;
import com.hmd.qrcode.view.mainframe.event.MouseEventBtnCreate;

public class MainFrame {

	private JFrame frame;
	private JLabel appTitle;
	private JLabel titFileName;
	private JLabel titContents;
	private JTextArea inpFileName;
	private JTextArea inpContents;
	private JButton btnCreate;
	private JButton btnClear;
	private JLabel dateInfo;
	private JLabel timeInfo;

	public JLabel getDateInfo() {
		return dateInfo;
	}

	public JLabel getTimeInfo() {
		return timeInfo;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JLabel getAppTitle() {
		return appTitle;
	}

	public JLabel getTitFileName() {
		return titFileName;
	}

	public JLabel getTitContents() {
		return titContents;
	}

	public JTextArea getInpFileName() {
		return inpFileName;
	}

	public JTextArea getInpContents() {
		return inpContents;
	}

	public JButton getBtnCreate() {
		return btnCreate;
	}

	public JButton getBtnClear() {
		return btnClear;
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = createJFrame();
		appTitle = createAppTitle();
		titFileName = createTitFileName();
		titContents = createTitContents();
		inpFileName = createInpFileName();
		inpContents = createInptContents();
		btnCreate = createBtnCreate();
		btnClear = createBtnClear();
		
		dateInfo = createDateInfo();
		timeInfo = createTimeInfo();
		
		btnCreate.addMouseListener(new MouseEventBtnCreate(this));
		btnClear.addMouseListener(new MouseEventBtnClear(this));
		renderDateInfo();
	}
	
	private void renderDateInfo() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						Date now = new Date();
						DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
						DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM);
						dateInfo.setText(dateFormat.format(now));
						timeInfo.setText(timeFormat.format(now));
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	private JLabel createTimeInfo() {
		JLabel timeInfo = new JLabel("오전 11:25");
		timeInfo.setVerticalAlignment(SwingConstants.BOTTOM);
		timeInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		timeInfo.setForeground(new Color(51, 255, 204));
		timeInfo.setFont(new Font("나눔고딕코딩", Font.BOLD, 17));
		timeInfo.setBounds(251, 40, 149, 20);
		frame.getContentPane().add(timeInfo);
		return timeInfo;
	}

	private JLabel createDateInfo() {
		JLabel dateInfo = new JLabel("21.06.16");
		dateInfo.setForeground(new Color(51, 255, 204));
		dateInfo.setFont(new Font("나눔고딕코딩", Font.BOLD, 17));
		dateInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		dateInfo.setBounds(251, 20, 149, 20);
		frame.getContentPane().add(dateInfo);
		return dateInfo;
	}

	private JFrame createJFrame() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 204, 255));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 442, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		return frame;
	}

	private JButton createBtnClear() {
		JButton btnClear = new JButton("초기화");
		btnClear.setBackground(new Color(255, 255, 255));
		btnClear.setFont(new Font("나눔고딕코딩", Font.PLAIN, 14));
		btnClear.setBounds(309, 137, 98, 33);
		frame.getContentPane().add(btnClear);
		return btnClear;
	}

	private JButton createBtnCreate() {
		JButton btnCreate = new JButton("실행");
		btnCreate.setBackground(new Color(255, 255, 255));
		btnCreate.setFont(new Font("나눔고딕코딩", Font.PLAIN, 14));
		btnCreate.setBounds(309, 94, 98, 33);
		frame.getContentPane().add(btnCreate);
		return btnCreate;
	}

	private JTextArea createInptContents() {
		JTextArea inpContents = new JTextArea();
		inpContents.setBounds(117, 94, 180, 169);
		inpContents.setFocusAccelerator('c');
		frame.getContentPane().add(inpContents);
		return inpContents;
	}

	private JTextArea createInpFileName() {
		JTextArea inpFileName = new JTextArea();
		inpFileName.setBounds(12, 94, 101, 169);
		inpFileName.setFocusable(true);
		inpFileName.setFocusAccelerator('f');
		frame.getContentPane().add(inpFileName);
		return inpFileName;
	}

	private JLabel createTitContents() {
		JLabel titContents = new JLabel("contents");
		titContents.setForeground(new Color(51, 0, 51));
		titContents.setHorizontalAlignment(SwingConstants.CENTER);
		titContents.setFont(new Font("나눔고딕코딩", Font.PLAIN, 14));
		titContents.setBounds(170, 70, 74, 26);
		frame.getContentPane().add(titContents);
		return titContents;
	}

	private JLabel createTitFileName() {
		JLabel titFileName = new JLabel("file-name");
		titFileName.setForeground(new Color(51, 0, 51));
		titFileName.setFont(new Font("나눔고딕코딩", Font.PLAIN, 14));
		titFileName.setHorizontalAlignment(SwingConstants.CENTER);
		titFileName.setBounds(25, 70, 74, 26);
		frame.getContentPane().add(titFileName);
		return titFileName;
	}

	private JLabel createAppTitle() {
		JLabel appTitle = new JLabel("QRCodeMaker");
		appTitle.setVerticalAlignment(SwingConstants.BOTTOM);
		appTitle.setForeground(new Color(51, 0, 51));
		appTitle.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
		appTitle.setBounds(12, 27, 157, 33);
		frame.getContentPane().add(appTitle);
		return appTitle;
	}
}
