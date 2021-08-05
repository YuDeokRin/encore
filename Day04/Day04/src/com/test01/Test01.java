package com.test01;
//java.lang.Integer : 정수를 관리하는 클래스 
//import static java.lang.Math.*;
public class Test01 {

	public static void main(String[] args) {
		
		//숫자 100을  2진,8진법, 문자열로 리턴하자 
		
		int su = 100;
		System.out.println("2진화 : " + Integer.toBinaryString(su));
		System.out.println("16진화 : "+ Integer.toHexString(su));
		System.out.println("8진화 : "+ Integer.toOctalString(su));
		System.out.println("문자열로 변환 " + Integer.toString(su));
		
		String binary = Integer.toBinaryString(su);
		System.out.println(binary);
		

	}

}
