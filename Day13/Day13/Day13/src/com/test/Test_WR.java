package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test_WR {
	public static void MyWriter(File f) {

		try(FileWriter fw = new FileWriter(f)){
			fw.write("�����̶��");
			
		}catch(IOException e) {
			System.out.println(e);			
		} // fw.close()�� �ڵ�ȣ���ϸ鼭 fw�� ��ü�� �Ҹ��Ų��.
	}
	
	public static void MyReader(File f) {
		//case 1. try ()~catch~ finally : try-with-resoueces statement
		try(FileReader fr = new FileReader(f)){
			int res = 0;
			while((res =fr.read()) != -1) {
				System.out.println((char)res);
			}
			
		}catch(IOException ie) {
			
		}
	}
	
	
	public static void MyReader02(File f) {
		//case 2. try ~ catch ~ finally
		// fr�� ��ü�� close()�ϱ� ���� �Ǵ� close()�� ��
		// ������ �ۼ��� ���� �ݵ�� �Ʒ��ڵ带 ����ؼ� ����Ѵ�.
		FileReader fr = null;
		int res = 0;
			try {
				fr = new FileReader(f);
				while((res =fr.read()) != -1) {
					System.out.println((char)res);
				}
				
			} catch (FileNotFoundException fe) {
				fe.printStackTrace();
			} catch (IOException ie) {
				ie.printStackTrace();
			}catch (Exception e) {
				System.out.println(e);
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				} // inner try end
			} // try end
		
			
	}//method end 
	
	
	public static void main(String[] args) {
		File f = new File("test.dat");
		MyWriter(f);
		MyReader02(f);
	}
}
