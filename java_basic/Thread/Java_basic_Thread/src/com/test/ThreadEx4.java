package com.test;

public class ThreadEx4 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
//		System.out.println(startTime);
		for(int i = 0; i <300; i++) 
			System.out.printf("%s", new String("-"));
		
			System.out.print("�ҿ�ð� : " + (System.currentTimeMillis() - startTime));
			
			for(int i = 0; i<300; i++) 
				System.out.printf("%s", new String("|"));
				System.out.print("�ҿ�ð�2 : "+ (System.currentTimeMillis() - startTime));
			
		
	}

}
