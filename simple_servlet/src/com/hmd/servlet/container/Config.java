package com.hmd.servlet.container;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 서버가 사용할 문자인코딩과 포트 번호를 가진 설정 클래스 입니다.
 * 프로젝트의 root에 배치된 web.xml파일을 읽어들여 정보를 세팅합니다.
 * web.xml파일은 자바 properties 문서타입정의를 따르는 파일이어야 합니다.
 * 
 * 문자인코딩정보는 key속성이 "encoding" 인 entry 태그에 작성합니다.
 * 포트번호는  key속성이 "port" 인 entry 태그에 작성합니다.
 * 
 * @author azimemory
 *
 */
public class Config {
	
	public static final String CHARSET;
	public static final int PORT;
	
	static {
		Properties webProperties = new Properties();
		
		try(FileInputStream fis = new FileInputStream("web.xml")) {
			webProperties.loadFromXML(fis);
		} catch (IOException e) {
			System.out.println("web.xml을 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		
		CHARSET = webProperties.getProperty("encoding");
		PORT = Integer.parseInt(webProperties.getProperty("port"));
	}

}
