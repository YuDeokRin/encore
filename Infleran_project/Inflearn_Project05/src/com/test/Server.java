package com.test;

import java.net.*;
import java.io.*;


public class Server {
	public static void main(String[] args) {
        ServerSocket ss=null; 
        try {
			ss=new ServerSocket(9999); //1.ServerSocket 생성, 즉 포트(9999) 열림
			System.out.println("Server ready...."); 
		} catch (Exception e) {
           e.printStackTrace();
		}
        while(true) { // 2. 서버에 접속자들을 계속해서 받기위해서 
        	try {
		        Socket socket=ss.accept(); //3.accept()는 접속자들을 대기 시킨다. The method blocks until a connection is made
		        System.out.println("client connect success!");
		        InputStream in=socket.getInputStream(); 
		        DataInputStream dis=new DataInputStream(in);
		        String message=dis.readUTF();
		        
		        OutputStream out=socket.getOutputStream();
                DataOutputStream dos=new DataOutputStream(out);
                dos.writeUTF("[ECHO]"+message+"(from Server!)");
		        dos.close();
		        dis.close();
		        socket.close();    
		        System.out.println("client socket close....");
			} catch (Exception e) {
              e.printStackTrace();
			}
        }//while
	}//main
}//class