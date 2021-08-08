package com.test;

public class MMyTest {

	public static void main(String[] args) {
		MyTest m1 = new MyTest();
		m1.setA(100);
		System.out.println(m1.getA());
		
		MyTest m2 = new MyTest();
		m2.setA(100);
		System.out.println(m1.getA());
		
		
		
		m1.setB(50);
		m1.setB(70);
		
		System.out.println(m1.getB() + "\t" + m2.getB());
	}

}
