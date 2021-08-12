package com.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
//해당페이지로 접속해서 페이지 a.html 페이지의 내용을 읽어오자 . 
public class URI_Test3 {
	public static void main(String[] args) {
		//URI(String str)
		
		String my_url ="http://192.168.56.1:8080/MyWeb/mytest/a.html";
		URL u;
		
		
		try {
			u = new URL(my_url); 
			URLConnection res =  u.openConnection(); 
			res.connect();
			//URLConnection openConnection() // <-http://192.168.56.1:8080/MyWeb/mytest/a.html페이지를 열어서 URLConnection 객체로 넘기면,
			// URLConnection 읽어서 리턴해준다 그럼 콘솔에 출력된다.
			
			BufferedReader in = new BufferedReader(new InputStreamReader(res.getInputStream()));
			String inputLine;
			while((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
				
	}
}
