package com.test;
import java.net.*;
public class URI_Test {
	public static void main(String[] args) {
		//URI(String str)
		
		String my_url = "https://docs.oracle.com/javase/8/docs/api/index.html?id=finish07&pw=1234";
		my_url = "http://192.168.56.1:8080/MyWeb/mytest/a.html";
		
		try {
			URI u = new URI(my_url); 
			System.out.println(u.getScheme());
			System.out.println(u.getUserInfo());
			System.out.println(u.getAuthority());
			System.out.println(u.getPath());
			System.out.println(u.getQuery());
			System.out.println(u.getFragment());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
				
	}
}
