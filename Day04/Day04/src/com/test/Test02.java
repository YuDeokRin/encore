package com.test;


public class Test02 {

	public static int getA() {
		return 100;
	}
	public static int getB() {
		return 300;
	}
	public static char getCh() {
		return 'A';
	}
	
	public static void main(String[] args) {
		int a =getA(); //() method, Test02.getA() , 100을 리턴했으니까 int를 리턴했다.
						// public static void getA(){return 100;}
		System.out.println("a =" + a );
		int b = getB();
		System.out.println("b="+b);
		
		char ch = getCh(); // () method, static , char 타입을 리턴했다, return 'A';
		System.out.println("ch = "+ ch);
		
	}
}
