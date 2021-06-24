package com.hmd.servlet.http;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;
import java.util.Properties;

import com.hmd.servlet.container.Config;

public class Response {
	
	private BufferedOutputStream responseStream;
	private String statusLine;
	private Map<String,String> httpHeader;
	
	public Response(BufferedOutputStream responseStream) throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		super();
		this.responseStream = responseStream;
		statusLine = "HTTP/1.1 200 ok ";
		
		httpHeader = new HashMap<String, String>();
		httpHeader.put("Content-Type", "text/html; Charset=" + Config.CHARSET);
	}

	public BufferedOutputStream getResponseStream() throws IOException {
		prepareResponse();
		return responseStream;
	}
	
	public void sendResponse(String httpBody) throws IOException {
		prepareResponse();
		responseStream.write(httpBody.getBytes());
		responseStream.flush();
	}
	
	public void sendResponse(InputStream inputStream) throws IOException {
		prepareResponse();
		
		int check = 0;
		while((check = inputStream.read()) != -1) {
			responseStream.write(check);
		}
		
		responseStream.flush();
	}
	
	public String getStatusLine() {
		return statusLine;
	}

	public void setStatusLine(String statusLine) {
		this.statusLine = statusLine;
	}

	public Map<String, String> getHttpHeader() {
		return httpHeader;
	}

	public void setHttpHeader(Map<String, String> httpHeader) {
		this.httpHeader = httpHeader;
	}

	private void prepareResponse() throws IOException {
		
		String response = statusLine + "\n";

		for (String key : httpHeader.keySet()) {
			response += key + ":" + httpHeader.get(key);
			response += "\n";
		}
		
		response += "\n";
		responseStream.write(response.getBytes());
	}
}
