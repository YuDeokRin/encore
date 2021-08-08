package com.test01;

public class M_MyClass03 {
	
	public static void main(String[] args) {
		System.out.println("1 . 객체를 생성하자.  new MyClass03");
		
		MyClass03 m1 = new MyClass03();
		 System.out.println(m1); // m1.toString() 
		
		 
		 System.out.println("2. a값을 변경해 보자  ");
		 m1.setA(100);
		 System.out.println("변경된 값을 확인해보자 a : "+ m1.getA());
		
		 System.out.println("3. b값을 변경해 보자  ");
		 m1.setB(200);
		 System.out.println("변경된 값을 확인해보자 a : "+ m1.getB());
		
	}
}
