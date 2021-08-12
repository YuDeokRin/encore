package com.test01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
public class TCPClient {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		InputStream is = null ;
		DataOutputStream dis = null;
		String serverMsg = null;
		try {
			socket = new Socket("127.0.0.1", 7777);
			System.out.println("Server Connection Success");
			System.out.println("clinet socket : "+ socket);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			serverMsg = new String(dis.readUTF());
			System.out.println("서버에서 전송된 메시지 : "+ serverMsg);
			dis.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
