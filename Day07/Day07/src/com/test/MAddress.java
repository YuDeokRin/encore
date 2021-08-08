package com.test;

public class MAddress {
	public static void main(String[] args) {
		Address a1 = new Address();// 객체를 생성 
		Address a2 = new Address();// 객체를 생성 
		Address a3 = new Address();// 객체를 생성 
		
		
		 a1.setName("홍길동"); 
		 a1.setAddr("서울"); 
		 a1.setPhone("02-000-000");
		 
		 System.out.printf("\n %10s %10s %15s \n", a1.getName(), a1.getAddr(), a1.getPhone());
		 
		
		 a2.setName("정길동"); 
		 a2.setAddr("인천");  
		 a2.setPhone("031-000-000");
		 
		 System.out.printf("\n %10s %10s %15s \n", a2.getName(), a2.getAddr(), a2.getPhone());
		 
		
		 a3.setName("최길동"); 
		 a3.setAddr("부산"); 
		 a3.setPhone("051-000-000");
		 
		 System.out.printf("\n %10s %10s %15s \n", a3.getName(), a3.getAddr(), a3.getPhone());
		 

	}

}
