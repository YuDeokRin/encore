package com.test02;

import java.io.IOException;

public class Process_Test {
	public static void main(String[] args) {
		//command 명령을 이용해서 단일 Process exe를 생성해서 로딩 해보자.
		
		Runtime r = Runtime.getRuntime(); // python 웹 수집기를 만들어 javaaplication으로 제어할 때 사용한다.
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
