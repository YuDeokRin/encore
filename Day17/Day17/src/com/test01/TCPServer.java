package com.test01;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		OutputStream os = null ;
		DataOutputStream dos = null;
		String msg = "Hello, Client";
		try {
			server = new ServerSocket(7777);
			System.out.println("Wait Client....");
			socket = server.accept();
			System.out.println("Client Connection Success");
			System.out.println("server socket : " + socket.getInetAddress().getHostAddress());
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF(msg);
			socket.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
