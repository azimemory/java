package com.kh.c_web_server.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;

public class TCPServer {

   int port = 9400;
   ServerSocket serverSocket;

   public TCPServer() {
      try {
         serverSocket = new ServerSocket(port);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public void serverStart() {
      while (true) {
         try (Socket clientScoket = serverSocket.accept();
               PrintWriter writer = new PrintWriter(clientScoket.getOutputStream());
               BufferedReader br = new BufferedReader(new InputStreamReader(clientScoket.getInputStream()))) {

            String clientCard = br.readLine();
            clientCard = clientCard.substring(clientCard.indexOf("=") + 1, clientCard.lastIndexOf(" "));
            clientCard = URLDecoder.decode(clientCard, "utf-8");
            
            String serverCard = choiceServerCard();
            String result = winOrLose(serverCard, clientCard);
            String response = httpHeader();
            
            response += htmlTemplate(serverCard, clientCard, result);
            sendResponse(writer,response);
            
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }

   private String choiceServerCard() {
      int random = (int) (Math.random() * 3);
      String serverCard = "";
      switch (random) {
      case 0:
         serverCard = "바위";
         break;
      case 1:
         serverCard = "가위";
         break;
      case 2:
         serverCard = "보";
         break;
      }

      return serverCard;
   }

   private String winOrLose(String serverCard, String clientCard) {
	   
      String result = "졌습니다";
      
      if (clientCard.equals(serverCard)) {
         result = "비겼습니다";
      } else if (clientCard.equals("바위")) {
         if (serverCard.equals("가위")) {
            result = "이겼습니다";
         }
      } else if (clientCard.equals("가위")) {
         if (serverCard.equals("보")) {
            result = "이겼습니다";
         }
      } else if (clientCard.equals("보")) {
         if (serverCard.equals("바위")) {
            result = "이겼습니다";
         }
      }else {
    	  return "Index";
      }

      return result;
   }
   
   private String httpHeader() {
	   StringBuffer sb = new StringBuffer();
	   
	   sb.append("HTTP/1.1 200 ok \n");
       sb.append("Content-Type: text/html; charset=utf-8 \n\n");
       
       return sb.toString();
   }
   
   private String htmlTemplate(String serverCard, String clientCard, String result) {
	 
	   StringBuffer sb = new StringBuffer();
       
       if(result.equals("Index")) {
    	   sb.append("<h1>하명도와 가위바위보 하세요</h1>"+ "\n");
    	   sb.append(rockScissorsPaper());
          return sb.toString();
       }
       
       sb.append("<h3> 하명도 : " + serverCard + "</h3>" + "\n");
       sb.append("<h3> 당신 : " + clientCard + "</h3><hr>"+ "\n");
       sb.append("<h1> " + result + "</h1>"+ "\n");
       sb.append(rockScissorsPaper());
      
       return sb.toString();
   }
   
   private String rockScissorsPaper() {
	   
	   StringBuffer sb = new StringBuffer();
	   sb.append("<a href='/?type=가위'>가위</a>"+ "\n");
	   sb.append("<a href='/?type=바위'>바위</a>"+ "\n");
       sb.append("<a href='/?type=보'>보</a>"+ "\n");
       return sb.toString();
   }
   
   private void sendResponse(PrintWriter writer, String response) {
	   for(String txt : response.split("\n")) {
		   writer.println(txt);
	   }
	   writer.flush();
   }
   
   
   
   
   
   
   
   
   
}