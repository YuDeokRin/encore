package com.test;

public class ThreadEx4 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
//		System.out.println(startTime);
		for(int i = 0; i <300; i++) 
			System.out.printf("%s", new String("-"));
		
			System.out.print("소요시간 : " + (System.currentTimeMillis() - startTime));
			
			for(int i = 0; i<300; i++) 
				System.out.printf("%s", new String("|"));
				System.out.print("소요시간2 : "+ (System.currentTimeMillis() - startTime));
			
		
	}

}
