package com.test;

public class Test {
	//�������� 
	public int a ;
	protected int b;
	int c; //default ����������
	private double d;
	
	public void Disp() {}
	
	public static void Prn() {
		System.out.println("Test'Prn");
		
	}
	
	public static void Prn01(int a) { //�� �����ϳ��� �ָ鼭 ȣ���ؾߵ� int a = 100;
		System.out.println("a = "+ a);
		
	}
	public static void Prn02(int a, int b) { //�� ���� �ΰ��� �ָ鼭 ȣ���ؾߵ�
		System.out.printf("a=%3d, b=%3d \t |", a, b);
	}
	
	public static void main(String[] args) {
		Prn01(100);
		Prn02(200, 300);
		Prn02(400, 500);
		Prn02(100, 200);
		
	}

}
