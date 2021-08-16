package com.test;

import java.io.File;
import java.io.IOException;

public class Test_File {
	public static void View() {
		//File(String pathname)
		//Test ���� �ؿ� �߱� ������ ����� ����.
		File f = new File("C:\\Test\\�豸");  // �ڹٴ� ��ҹ��ڸ� �������� �ü�� ������� ��ҹ��� ������ ����.

		
		//2. File(String parent, Stringg child)
		
		// c:\\Test\\�豸 �ؿ� �󱸸� ����� ����.
		File fi = new File("C:\\Test\\�豸", "��");
		
		//3. File(File parent, String child) �θ� ��θ� ������ ��ü�� ����
		// �豸 �ؿ� ��2�� ����� ���� .
		File fi02 = new File(f, "��2");
	
		
		
		if(fi02.exists()) { //����� ���� ���� ����
			System.out.println("�̸̹������");
		}else {
			fi02.mkdir();			
		}
		
		//������� ��ü�� f�� �����ϰ� �� �� mkdir()�� ������ ���� Ȯ�� �� �Ӽ� ������ ����غ���.
		System.out.println(fi02.canExecute()); // ���� ��������
		System.out.println(fi02.canRead()); // �б� ��������
		System.out.println(fi02.canWrite()); // ���� �������� Ȯ��
		System.out.println();
		//�Ӽ��� �� �� �ڼ���
		System.out.println(fi02.getAbsolutePath());
		System.out.println(fi02.getFreeSpace()); // ���������̶� ? �޸𸮳����� �ִ�� ���� �� �ִ� ũ��
		System.out.println(fi02.getName());
		System.out.println(fi02.getParent()); // ���� ��� 
		System.out.println(fi02.getTotalSpace());  //���丮 ������ �ִ� ũ�� 
	}
	
	public static void View02() {
		String str = "c:" + File.separatorChar+ "test";
		System.out.println(str);
	}
	
	public static void View03() {
		File fi02 = new File("c:\\test\\a.txt");
		
		// ���ϸ��� �� �Ű��ߵ� ��  1.���� , 2.�б����� ���� ,  3.  
		if(fi02.exists()) {
			System.out.println("�����Ѵ�.");
			//f.delete();
		}else {
			try {
				fi02.createNewFile();
			} catch (IOException e) {
				System.out.println("========================");
				e.printStackTrace();
			}//end catch    
		}//end else
		System.out.println(fi02.canExecute()); // ���� ��������
		System.out.println(fi02.canRead()); // �б� ��������
		System.out.println(fi02.canWrite()); // ���� �������� Ȯ��
		System.out.println();
		//�Ӽ��� �� �� �ڼ���
		System.out.println(fi02.getAbsolutePath()); //������ ��� 
		System.out.println(fi02.getFreeSpace()); // ���������̶� ? �޸𸮳����� �ִ�� ���� �� �ִ� ũ��
		System.out.println(fi02.getName()); //������ ���� �̸� �ҷ�����  
		System.out.println(fi02.getParent()); // ���� ��� 
		System.out.println(fi02.getTotalSpace());  //���丮 ������ �ִ� ũ�� 
	}//end view03
	
	
	public static void View04() {
		//������ �н��� ����� ��� �غ���.
		
//		String ->list()
//		File -> listFiles()
		File f = new File("C:\\Windows\\System32");
		String[] res = f.list() ;
		for(String res_info  : res) {
			System.out.println(res_info);
		}
	}
	
	public static void View05() {
		
		//���丮�� [dir], ���� [file]
		File f = new File("C:\\Windows\\System32");
		File[] res = f.listFiles() ;
		int dcnt = 0;
		int fcnt = 0;
		for(File res_info  : res) {
			if(res_info.isDirectory()) {
				dcnt++;
				System.out.println("[dir]"+ res_info.getAbsolutePath());
				
			}
			if(res_info.isDirectory()) {
				fcnt++;
				System.out.println("[file]"+res_info.getAbsolutePath());
				
			}
		}
		
		System.out.printf("dir cnt = %5d, file cnt = %5d�� \n", dcnt, fcnt);		
	}

	public static void main(String[] args) {
		View05();
	}
}
