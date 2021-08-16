package com.test04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Object 단위로 연동되는 데이터를 쓰고 읽어 보자 .
// ObjectInputStream 

public class Test_Stream {
	
	public static void My_FileWrite(File f)throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(new My_profile("111","111"));
		oos.writeObject(new My_profile("222","222"));
		oos.writeObject(new My_profile("333","333"));
		oos.close();
	}
	
	public static void My_FileReader(File f)throws IOException,ClassNotFoundException{
		ObjectInputStream oos = new ObjectInputStream(new FileInputStream(f));
		System.out.println(oos.readObject());
		System.out.println(oos.readObject());
		System.out.println(oos.readObject());
		System.out.println(oos.readObject());
		oos.close();
	}
	
	public static void main(String[] args) {
		File f = new File("test04.txt");
		try {
			My_FileWrite(f);
			try {
				My_FileReader(f);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}catch(IOException ie) {
			System.out.println(ie.toString());
		}
	
		
	}
}
