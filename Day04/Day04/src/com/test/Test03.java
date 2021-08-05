package com.test;

public class Test03 {
	// 이름을 리턴하는 메소드
	public static String getName() {
		return "홍길동";
	}
	

	//"서울시 강남구 도곡동 47번지"를 리턴하는 메소드 
	
	public static String getAddress() {
		return  "서울시 강남구 도곡공 457번지";
	}
	
	public static void main(String[] args) {
	String name = getName();
	String address = getAddress();
	System.out.println("name : "+name + "arrdress : " + address);
		
	}

}
