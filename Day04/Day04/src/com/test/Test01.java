package com.test;

public class Test01 {
	public static void Prn01(char ch) {
		System.out.println("a = "+ ch);
	}
	public static void Prn02(int a, double b) {
		System.out.println("a ="+ a+", b= " + b );
	}
	public static void Prn03(String message) {
		System.out.println("String message = "+ message );
		
	}
	public static void Prn04(boolean T,boolean F) { // boolean t = true ; boolean f = false;
		System.out.println(T + "," + T); //
//		String str = str + "," + F;
		System.out.println("boolean : " + F);
		
		
	}
	public static void Prn05(char ch, int a, double b, String str, boolean f) {
		System.out.println(ch + a + b + str + f);
	}
	
	public static void main(String[] args) {
		Prn01('a'); // char ch  
		Prn02(100, 90.8); // int a , double b 
		Prn03("연습이야"); // String message 
//		Prn04(true, false);  // boolean t, boolean f 
		Prn05('a', 100, 98.9, "abc", true); //char ch, int a, double b, String str, boolean f 
		
		String str = "abc" + "," + "def";
		System.out.println(str);
	}

}
