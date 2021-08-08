package com.test01;

public class MyClass03 {
	private int a ;
	private int b ;
	public MyClass03() {
		super(); // Object class or superClass's default Constructor
	}
	public MyClass03(int a, int b) {
//		super();  있어도 그만 없어도 그만
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "MyClass03 [a=" + a + ", b=" + b + "]";
	}

		
}
