package com.test;

public class Test04 {
	// char ch = 'Z';
	// getCh()라는 메소드는 char  2byte 값 'Z'를 리턴한다.
	public static char getCh() {
	
		return ('A'+1);  // 'B'=66 가 출력된다 
//		return 'Z'; //아스키코드 90 , A= 65
	}
	//getA()라는 메소드 int 4byte 값 100을 리턴한다.
	public static int getA() {
		return 100;
	}
	//getD()라는 메소드는 double 8byte값 98.8를 리턴한다. 
	public static double getD() {
//		return 98.9;
		return 98.9 + getA();
	}	
	
	public static void main(String[] args) {

		char ch = getCh(); //char type의 'Z'를 리턴하는 메소드,
		int res = getA(); //int type의 100을 리턴하는 메소드
		double d = getD(); //double type의 98.9를 리턴하는 메소드
		
		System.out.println(ch + "\t" + res + "\t" + d); // 'Z' 100 98.9
		
		System.out.println(getCh() + "\t" + getA() + "\t" + getD()); 
		
		double res02 = getA() + getD(); // double res02 = 100+ 98.9;
		System.out.println("res02 = " + res02);
		
		
	}

}
