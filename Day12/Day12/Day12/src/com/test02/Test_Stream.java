package com.test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// byte 단위로 연동되는 데이터를 쓰고 읽어 보자 .
// FileWriter      FileReader
// BufferedWriter  BufferedReader


public class Test_Stream {
	
	public static void My_FileWrite(File f) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		for(int i = 'ㄱ' ; i<='ㅎ'; i++) {
			bw.write(i);
		}
		bw.close();
	}
	
	public static void My_FileReader(File f)  throws IOException{
	BufferedReader br = new BufferedReader(new FileReader(f));
	int r = 0 ; 
	while( (r= br.read()) != -1) {
		System.out.println((char)r);
		
	}
	br.close();
}
	public static void main(String[] args) {
		File f = new File("test02.txt");
		try {
			My_FileWrite(f);
			My_FileReader(f);
		}catch(IOException ie) {
			System.out.println(ie.toString());
		}
	
		
	}
}
