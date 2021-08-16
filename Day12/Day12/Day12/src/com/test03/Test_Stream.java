package com.test03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Datatype ������ �����Ǵ� �����͸� ���� �о� ���� .
// DataInputStream 		DataInOutStream


public class Test_Stream {
	
	public static void My_FileWrite(File f) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
		dos.writeByte(97);
		dos.writeChar('A');
		dos.writeUTF("�����̾�");
		dos.close();
		
	}
	

		public static void My_FileReader(File f) throws IOException {
			DataInputStream dos = new DataInputStream(new FileInputStream(f));
			System.out.println(dos.readByte());
			System.out.println(dos.readChar());
			System.out.println(dos.readUTF());
			dos.close();
			
		}
	

	public static void main(String[] args) {
		File f = new File("test03.txt");
		try {
			My_FileWrite(f);
			My_FileReader(f);
		}catch(IOException ie) {
			System.out.println(ie.toString());
		}
	
		
	}
}
