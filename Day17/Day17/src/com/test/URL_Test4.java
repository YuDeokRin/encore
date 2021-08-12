package com.test;

import java.net.*;
import java.io.*;

public class URL_Test4 {
	public static void main(String[] args) throws Exception {

		String my_url = "http://localhost:8080/MyWeb/test";
		URL url = new URL(my_url);
		String stringToReverse = URLEncoder.encode(" Reverse Me", "UTF-8");

		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		//���������� ����  
		// URLConnection���� �� :"http://localhost:8080/MyWeb/test?string = Reverse Me"

		OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
		out.write("string ="+ stringToReverse);
		
		out.close();

		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String decodedString;
		while ((decodedString = in.readLine()) != null) {
			System.out.println(decodedString);
		}
		in.close();
	}
}
