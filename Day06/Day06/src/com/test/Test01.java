package com.test;
//기본 자료형
public class Test01 {
	public static void Prn() {

		//자동 캐스팅
		byte b1 = 100; //-128 ~  128     
		int i = b1 ; 
		double d = i ; 
		
		System.out.println("byte b1 = "+b1);
		System.out.println("int i   ="+ i);
		System.out.println("double d = " + d);
	}
	
	public static void Prn01() {
		byte b1 = 100;  //It has a minimum value of -128 and a maximum value of 127 (inclusive)
		System.out.println("b1 = "+ b1 );

		byte b2 = (100+20);
		System.out.println("b1 = "+ b2 );
		
//		byte b3 = b1 + 20 ; //byte + int = int + int = int로 나온다.
		int b3 = (byte) (b1 + 20) ;
		System.out.println("b3 = "+ b3);
	}

	public static void Prn02() {
		char ch = 'A'; //65	-> 2진화로 변환 후 대입
		System.out.println("ch= "  + ch);// 2byte 내의 문자로 코드를 변환 후 리턴
		char ch02=65; //0 ~ 65535
		System.out.println("ch02 =" + ch02);
	
		char a1 = '\ub300';
		char a2 = '\ud55c';
		char a3 = '\ubbfc';
		char a4 = '\uad6d';
		System.out.println(a1 + ""+a2+ ""+ a3+ ""+ a4); 

		System.out.println(a1 +a2+ a3+ a4);  //int + int  + int + int 
		
		System.out.println(a1 +    "\t" + (int)a1);
		System.out.println(a2 +    "\t" + (int)a2);
		System.out.println(a3 +    "\t" + (int)a3);
		System.out.println(a4 +    "\t" + (int)a4);
		
		char ch03 = (char) (ch02 + 3); 
		System.out.println("ch03="+ ch03);

	}
	public static void main(String[] args) {
		Prn02();
	}

}
