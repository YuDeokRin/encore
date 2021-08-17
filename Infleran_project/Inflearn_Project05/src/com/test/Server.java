package com.test;

import java.net.*;
import java.io.*;


public class Server {
	public static void main(String[] args) {
        ServerSocket ss=null; 
        try {
			ss=new ServerSocket(9999); //1.ServerSocket ����, �� ��Ʈ(9999) ����
			System.out.println("Server ready...."); 
		} catch (Exception e) {
           e.printStackTrace();
		}
        while(true) { // 2. ������ �����ڵ��� ����ؼ� �ޱ����ؼ� 
        	try {
		        Socket socket=ss.accept(); //3.accept()�� �����ڵ��� ��� ��Ų��. The method blocks until a connection is made
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