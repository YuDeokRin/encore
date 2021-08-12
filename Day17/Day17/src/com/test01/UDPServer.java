package com.test01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) {
		try {
			DatagramSocket dsocket = new DatagramSocket(5432); // 1번
			byte[] buff = new byte[1024];

			DatagramPacket recvPacket = new DatagramPacket(buff, buff.length);
			dsocket.receive(recvPacket);// 5
			String recvMsg = new String(recvPacket.getData());
			System.out.println("받은 메시지 :" + recvMsg);// 5
		} catch (IOException ie) {
			System.out.println(ie);
		}

	}

}
