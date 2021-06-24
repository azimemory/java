package com.hmd.servlet.strategy;

import java.io.IOException;

import com.hmd.servlet.http.Request;
import com.hmd.servlet.http.Response;

/**
 * 
 * 사용자의 요청을 다룰 Request객체와 응답을 다룰 Response 객체를 주입받는 클래스 입니다.
 * Servlet 인터페이스의 구현체와 URL을 HandlerMapping의 mappingServletWithURL 사용해 매핑해두면
 * Request객체와 Response객체를 doGet 메서드의 전달인자로 넘겨 줍니다. 
 * @author azimemory
 *
 */
public interface Servlet {
	
	/**
	 * Request객체와 Response객체를 주입받기 위한 메서드
	 * 요청이 발생하면 Container가 호출합니다.
	 * @param reqeust : reqeust
	 * @param response : reqeust
	 * @throws IOException : IOException
	 */
	public void doGet(Request reqeust, Response response) throws IOException;

}
