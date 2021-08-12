package com.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
//�ش��������� �����ؼ� ������ a.html �������� ������ �о���� . 
public class URI_Test3 {
	public static void main(String[] args) {
		//URI(String str)
		
		String my_url ="http://192.168.56.1:8080/MyWeb/mytest/a.html";
		URL u;
		
		
		try {
			u = new URL(my_url); 
			URLConnection res =  u.openConnection(); 
			res.connect();
			//URLConnection openConnection() // <-http://192.168.56.1:8080/MyWeb/mytest/a.html�������� ��� URLConnection ��ü�� �ѱ��,
			// URLConnection �о �������ش� �׷� �ֿܼ� ��µȴ�.
			
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
