package com.kh.qrcode.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.kh.qrcode.maker.QRCodeMaker;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private final Action fileBtnClick = new FileBtnClick();
	JTextArea urlContents;
	JTextArea titleContents;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel appName = new JLabel("QRCodeMaker");
		appName.setForeground(new Color(255, 99, 71));
		appName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		appName.setBounds(12, 10, 183, 30);
		contentPane.add(appName);
		
		JLabel url = new JLabel("url");
		url.setForeground(new Color(255, 99, 71));
		url.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		url.setBounds(75, 50, 29, 31);
		contentPane.add(url);
		
		JLabel title = new JLabel("title");
		title.setForeground(new Color(255, 99, 71));
		title.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		title.setBounds(230, 50, 40, 31);
		contentPane.add(title);
		
		urlContents = new JTextArea();
		urlContents.setBounds(22, 82, 143, 169);
		contentPane.add(urlContents);
		
		titleContents = new JTextArea();
		titleContents.setBounds(177, 82, 143, 169);
		contentPane.add(titleContents);
		
		JButton fileBtn = new JButton("파일생성");		
		//AbstractAction클래스를 상속받은 내부클래스의 인스턴스를 setAction메서드에 넣어줌		
		fileBtn.setAction(fileBtnClick);
		fileBtn.setFont(new Font("나눔고딕코딩", Font.PLAIN, 12));
		fileBtn.setForeground(new Color(153, 50, 204));
		fileBtn.setBackground(new Color(240, 255, 255));
		fileBtn.setBounds(332, 82, 97, 40);
		contentPane.add(fileBtn);
		
		JButton clearBtn = new JButton("초기화");
		
		clearBtn.addMouseListener(new MouseAdapter() {
			
			//clearBtn 영역에 마우스가 올라오면
			@Override
			public void mouseEntered(MouseEvent e) {
				clearBtn.setBackground(new Color(255,0,0));
			}
			
			//clearBtn 영역에서 마우스가 나가면
			@Override
			public void mouseExited(MouseEvent e) {
				clearBtn.setBackground(new Color(240, 255, 255));
			}
						
			@Override
			public void mouseClicked(MouseEvent e) {
				titleContents.setText("");
				urlContents.setText("");
			}
		});
		
		clearBtn.setFont(new Font("나눔고딕코딩", Font.PLAIN, 12));
		clearBtn.setForeground(new Color(153, 50, 204));
		clearBtn.setBackground(new Color(240, 255, 255));
		clearBtn.setBounds(332, 132, 97, 40);
		contentPane.add(clearBtn);
	}
	
	private class FileBtnClick extends AbstractAction {
		public FileBtnClick() {
			putValue(NAME, "파일생성");
		}
		
		//버튼의 클릭 이벤트가 발생하면 수행할 코드
		public void actionPerformed(ActionEvent e) {
			String url = urlContents.getText();
			String title = titleContents.getText();
			
			//줄바꿈 문자를 기준으로 문자열을 분리해 배열로 반환
			String[] urlArr = url.split("\n");
			String[] titleArr = title.split("\n");
			QRCodeMaker maker = new QRCodeMaker();
			
			//url과 title의 쌍이 안 맞을 경우를 대비한 예외처리
			//url의 줄 수가 title의 줄 수 보다 적으면 적은 url의 줄 수만큼
			//반복하며 qr코드를 생성
			if(urlArr.length < titleArr.length) {
				for(int i = 0; i < urlArr.length; i++) {
					//문자열의 앞 뒤 공백을 제거
					urlArr[i] = urlArr[i].trim();
					titleArr[i] = titleArr[i].trim();
					maker.makeQR(urlArr[i], titleArr[i]);
				}
			}else {
				for(int i = 0; i < titleArr.length; i++) {
					//문자열의 앞 뒤 공백을 제거
					urlArr[i] = urlArr[i].trim();
					titleArr[i] = titleArr[i].trim();
					maker.makeQR(urlArr[i], titleArr[i]);
				}
			}
			
			JOptionPane.showMessageDialog(null,"파일생성이 완료되었습니다.");
		}
	}
}

