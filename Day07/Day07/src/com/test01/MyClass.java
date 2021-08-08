package com.test01;

public class MyClass {
	private int a ;
	private int b ;
	
	public MyClass() {
		//this.a = 0;  this.b = 0;
		System.out.println("내가 만든 기본 생성자");
	}
	public MyClass(int a) {
		this.a  = a ; 
		
		System.out.println("a = " + this.a+ this.b);
	}
	
	public MyClass(int a, int b) {
		this.a = a ;
		this.b = b ;
		System.out.println("a = " + a + ", b = "+ b);
	}
		
	public static void main(String[] args) {
		
		MyClass c1 =  new MyClass();
//		MyClass c2 = new MyClass(100);
//		MyClass c3 = new MyClass(100,70);
//		
		
		
		System.out.println(c1);
		System.out.println(c1.toString());
		
		for(int i = 0; i < 10; i++) {
			System.out.println(new MyClass().toString());
//			System.out.println(new MyClass());  to.String() <<생략 가능
			
		}
		
	}
}
