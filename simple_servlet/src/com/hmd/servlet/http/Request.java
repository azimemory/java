package com.hmd.servlet.http;

import java.io.BufferedReader;
import java.util.Map;

public class Request {
	
	private BufferedReader requestReader;
	private Map<String,String> parameterMap;

	public Request(BufferedReader requestReader, Map<String, String> parameterMap) {
		super();
		this.requestReader = requestReader;
		this.parameterMap = parameterMap;
	}

	public BufferedReader getRequestReader() {
		return requestReader;
	}

	public Map<String, String> getParameterMap() {
		return parameterMap;
	}
	
	public String getParameter(String parameter) {
		return parameterMap.get(parameter);
	}
}
