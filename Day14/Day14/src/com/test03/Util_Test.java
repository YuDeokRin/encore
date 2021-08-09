package com.test03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.imageio.IIOException;

public class Util_Test {
	public static void Prn01() {
		Properties pro = new Properties();
		pro.setProperty("id", "bigdata_13");
		pro.setProperty("ps", "admin1234");
		System.out.println(pro); //확인 
		//my.properties 
		try {
			pro.store(new FileWriter("my.properties"), "연습용");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			pro.storeToXML(new FileOutputStream("my.xml"), "연습용");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void Prn02() {
		String file = "C:\\javaWork\\.metadata\\version.ini";
		Properties res = new Properties();
		try {
			res.load(new FileReader(file));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(res);
		Set<Entry<Object, Object>>  t =res.entrySet();
		for(Entry<Object, Object> res02: t) {
			System.out.println(res02.getKey() + ", " + res02.getValue());
		}
		
		//xml로 저장
		try {
			res.storeToXML(new FileOutputStream("my02.xml"), "연습용");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void Prn03() {
		
	}
	public static void main(String[] args) {
		Prn02();
	}

}
