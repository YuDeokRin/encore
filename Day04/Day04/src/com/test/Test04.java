package com.test;

public class Test04 {
	// char ch = 'Z';
	// getCh()��� �޼ҵ�� char  2byte �� 'Z'�� �����Ѵ�.
	public static char getCh() {
	
		return ('A'+1);  // 'B'=66 �� ��µȴ� 
//		return 'Z'; //�ƽ�Ű�ڵ� 90 , A= 65
	}
	//getA()��� �޼ҵ� int 4byte �� 100�� �����Ѵ�.
	public static int getA() {
		return 100;
	}
	//getD()��� �޼ҵ�� double 8byte�� 98.8�� �����Ѵ�. 
	public static double getD() {
//		return 98.9;
		return 98.9 + getA();
	}	
	
	public static void main(String[] args) {

		char ch = getCh(); //char type�� 'Z'�� �����ϴ� �޼ҵ�,
		int res = getA(); //int type�� 100�� �����ϴ� �޼ҵ�
		double d = getD(); //double type�� 98.9�� �����ϴ� �޼ҵ�
		
		System.out.println(ch + "\t" + res + "\t" + d); // 'Z' 100 98.9
		
		System.out.println(getCh() + "\t" + getA() + "\t" + getD()); 
		
		double res02 = getA() + getD(); // double res02 = 100+ 98.9;
		System.out.println("res02 = " + res02);
		
		
	}

}
