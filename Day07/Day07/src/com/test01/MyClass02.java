package com.test01;

public class MyClass02 {
	private int a ;
	private int b ;
	
	public MyClass02() {
		//this.a = 0;  this.b = 0;
		System.out.println("���� ���� �⺻ ������");
	}
	public MyClass02(int a) {
		this(a, 700); // ������ ���ο��� ���λ����ڸ� ȣ���ϸ鼭 ���� ù�ٿ� �����Ѵ�.
//		this.a  = a ; 
		System.out.println("a ===> " + this.a);
	}
	
	public MyClass02(int a, int b) {
		this.a = a ;
		this.b = b ;
		System.out.println("a = " + a + ", b = "+ this.b);
	}
		
	public static void main(String[] args) {
		
//		MyClass02 c1 =  new MyClass02();   6�� ������ ���� 
		MyClass02 c2 = new MyClass02(100); //100   700
//		MyClass02 c3 = new MyClass02(100,70);
		
		System.out.println(c2);
		
//		System.out.println(c1);
//		System.out.println(c1.toString());
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(new MyClass().toString());
////			System.out.println(new MyClass());  to.String() <<���� ����
//			
//		}
		
	}
}
