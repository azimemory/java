package com.hmd.servlet.strategy;


/**
 * 
 * 요청 URL에 알맞은 Servlet객체를 생성해 반환해주는 인터페이스입니다.	 
 * @author azimemory
 *
 */
public interface HandlerMapping {
	
	/**
	 * 
	 * 요청 URL에 알맞은 Servlet객체를 생성해 반환해주는 메서드입니다.	 
	 * Server인스턴스를 생성 할 때 mappingServletWithURL 메서드를 구현한 HandlerMapping의 인스턴스를 주입해줘야 합니다.
	 * @param url : 매핑할 url
	 * @return : 매핑된 Servlet 인스턴스
	 */
	Servlet mappingServletWithURL(String url);
	
}
