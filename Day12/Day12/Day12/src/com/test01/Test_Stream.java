package com.test01;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// byte 단위로 연동되는 데이터를 쓰고 읽어 보자 .
// FileInputStream      FileOutputStream
// BufferedInputStream  BufferedOutputStream


public class Test_Stream {
	
	public static void My_FileWrite(File f) throws IOException {
		FileOutputStream fos  = new FileOutputStream(f);
		
			for(int i = 97; i<=120; i++) {
				fos.write(i);
			}
			fos.write(13);
			fos.close();
	}

	public static void My_FileReader(File f) throws IOException {
		int res = 0 ;
		FileInputStream fis = new FileInputStream(f);
		while((res = fis.read()) != -1) {
			System.out.println((char)res);
		}
		fis.close();
	}
	public static void My_FileWrite02(File f) throws IOException {

		//write(byte[] b)
		
		byte [] b = new byte[1024];
		FileOutputStream fos  = new FileOutputStream(f);
		// a ~ x 
		for(int i=92; i <= 200; i++ ) {
			b[i-97] = (byte)i;
		}
        fos.write(b);
		fos.write(13);
		fos.close();
}

	
	public static void My_File() throws IOException {
		//이미지 파일 읽어서 다른 이름으로 저장
		File file = new File("c:\\1.PNG");
		FileInputStream fis = new FileInputStream(new File("1.PNG"));
		FileOutputStream fos = new FileOutputStream(new File("copy.PNG"));
		int r = 0 ;
		while((r = fis.read()) != -1) {
			fos.write(r);
		}
		fos.close();
		fis.close();
	}
	
	
	public static void My_FileWrite03(File f) throws IOException {
		FileOutputStream fos  = new FileOutputStream(f);
		
			for(int i = 97; i<=120; i++) {
				fos.write(i);
			}
			fos.write(13);
			fos.close();
	}

	public static void My_FileReader03(File f) throws IOException {
		int res = 0 ;
		FileInputStream fis = new FileInputStream(f);
		while((res = fis.read()) != -1) {
			System.out.println((char)res);
		}
		fis.close();
	}
	
	public static void main(String[] args) {
		try {
			My_File();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//
	}//end main
}
