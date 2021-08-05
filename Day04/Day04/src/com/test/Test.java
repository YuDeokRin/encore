package com.test;

public class Test {
	//전역변수 
	public int a ;
	protected int b;
	int c; //default 접근제한자
	private double d;
	
	public void Disp() {}
	
	public static void Prn() {
		System.out.println("Test'Prn");
		
	}
	
	public static void Prn01(int a) { //꼭 정수하나를 주면서 호출해야됨 int a = 100;
		System.out.println("a = "+ a);
		
	}
	public static void Prn02(int a, int b) { //꼭 정수 두개를 주면서 호출해야됨
		System.out.printf("a=%3d, b=%3d \t |", a, b);
	}
	
	public static void main(String[] args) {
		Prn01(100);
		Prn02(200, 300);
		Prn02(400, 500);
		Prn02(100, 200);
		
	}

}
