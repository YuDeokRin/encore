package com.test;


import java.net.*;

public class Test {
	public static void main(String[] args) {
		try {
		InetAddress[] address_all = InetAddress.getAllByName("www.daum.net");
			for(InetAddress res : address_all) {
				System.out.println(res.getHostAddress());
				System.out.println(res.getHostName());
				System.out.println(res.getAddress());
				System.out.println(res.getLocalHost());
				
				System.out.println(res.getByName("www.abc.com"));
				
				byte [] res02 = res.getAddress();
				for(byte r0 : res02) {
					System.out.printf("%d", r0);
				}
				System.out.println();
				System.out.println(res.getLocalHost());
				System.out.println(res.getByName("www.abc.com"));
			}
		
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
