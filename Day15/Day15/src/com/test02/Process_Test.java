package com.test02;

import java.io.IOException;

public class Process_Test {
	public static void main(String[] args) {
		//command ����� �̿��ؼ� ���� Process exe�� �����ؼ� �ε� �غ���.
		
		Runtime r = Runtime.getRuntime(); // python �� �����⸦ ����� javaaplication���� ������ �� ����Ѵ�.
				try {
					Process pro = r.exec("notepad");
					System.out.println(r.freeMemory());
					System.out.println(r.maxMemory());
					r.gc();
					
					System.out.println(pro);
					System.out.println(pro.isAlive());
					System.out.println(pro.exitValue());
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
}
