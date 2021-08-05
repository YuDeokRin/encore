package com.test;

public class Test05 {

	// String name을 받아서 name+"님 환영합니다 ~ "를 String 으로 리턴하는 메소드 
	public static String getName(String name) {
		return name+"님 환영합니다 ~ ";
		
	}
	
	public static void main(String[] args) {
		String res = getName("홍길동");
		System.out.println(res);
		
		System.out.println(getName("정길동"));
	}

}
