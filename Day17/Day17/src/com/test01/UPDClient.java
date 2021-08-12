package com.test01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UPDClient {

	public static void main(String[] args) {
		try {
			DatagramSocket dsocket = new DatagramSocket(); // 2번
			String sendMsg = new String("Hello UDP Echo!!");
			byte[] buff = sendMsg.getBytes();
			InetAddress addr = InetAddress.getByName("127.0.0.1");

			DatagramPacket sendPacket = new DatagramPacket(buff, buff.length, addr, 5432);// 2
			dsocket.send(sendPacket); // 3
			System.out.println("보낸 메시지 확인 출력 :" + sendMsg); // 4
		} catch (IOException ie) {
			System.out.println(ie);
		}
	}

}
