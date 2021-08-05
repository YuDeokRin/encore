package com.test02;

public class Test {
	
	public static int test_a = 10; //전역 변수 , 맴버 변수 
	
	public static void main(String[] args) {
		
		int a = 10 ;
		System.out.println(Test.test_a); 
		System.out.println(a); 
		
		{
			int b = 100;
			a =3000;
			System.out.println("inner block area :" + a);
			System.out.println("inner block area :" + b);
		}
		
//		System.out.println("inner block area :" + b); 오류가 발생한다. 
		System.out.println("inner block area :" + a);
	}

}
