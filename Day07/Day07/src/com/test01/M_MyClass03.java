package com.test01;

public class M_MyClass03 {
	
	public static void main(String[] args) {
		System.out.println("1 . ��ü�� ��������.  new MyClass03");
		
		MyClass03 m1 = new MyClass03();
		 System.out.println(m1); // m1.toString() 
		
		 
		 System.out.println("2. a���� ������ ����  ");
		 m1.setA(100);
		 System.out.println("����� ���� Ȯ���غ��� a : "+ m1.getA());
		
		 System.out.println("3. b���� ������ ����  ");
		 m1.setB(200);
		 System.out.println("����� ���� Ȯ���غ��� a : "+ m1.getB());
		
	}
}
