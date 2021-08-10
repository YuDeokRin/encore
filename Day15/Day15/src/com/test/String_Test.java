package com.test;

import java.util.ArrayList;
import java.util.List;

public class String_Test {
	
	public static void View_String() {
		String str = "The String  class represents character strings.";
		
		System.out.println("1. str의 객체 전체 대문자로 출력");
		String res = str.toUpperCase();
		System.out.println("원본 :" + str);
		System.out.println("결과 :" + res);
		
		System.out.println("2. str의 객체 전체 소문자로 출력");
		res = str.toLowerCase();
		System.out.println("원본 : " + str);
		System.out.println("결과 : " + res);
		
		
		System.out.println("3. str의 \"character\" 단어를 String으로 변환하자.");
		res = str.replace(str, "character");
		System.out.println("원본 : " + str);
		System.out.println("결과 : " + res);
		
		
		System.out.println("4. str의 객체 전체중 공백을 없애고 출력해보자.");
		res = str.replace(" " , "");
		System.out.println("원본 : " + str);
		System.out.println("결과 : " + res);
		
	}
	
	public static void View_StringBuffer() {
		
		StringBuffer sb = new StringBuffer(10);
//		sb.append("abc");
//		sb.append("abc");
//		sb.append("abc");
//		sb.append("abc");
		for(int i = 1 ; i<=10; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString() + "," + sb.capacity()+"," + sb.length());
		
	}
	public static void View_StringBuilder() {
		StringBuilder sb = new StringBuilder(10);
		for(int i = 1 ; i<=10; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString() + "," + sb.capacity()+"," + sb.length());
		
		
	}
	
	public static void main(String[] args) {
//		View_String();
//		View_StringBuffer();
		View_StringBuilder();
		
		///////////////////////////////////////////////////
		//Autoboxing 
		Character ch = new Character('a'); 
		Integer in = 100; // -> Integer i = new Integer(100);
		System.out.println(ch);
		
		//
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 50; i += 2)
		    li.add(i);
	}
}
