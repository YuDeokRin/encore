package com.test;

public class MyTest {
	 private int a ; // ���� ������ �ʱ�ȭ ���� �ʴ´�   
	 private int b ; // ��� ���� ����ȭ
	
//	 //a setter & getter
//	 //��ü �ּҸ� ���� ���� �Ű� ���� int a�� �޾� ��� ���� a���� ���� �� ���� �ϴ� �޼ҵ�
//	 public void setA(int a) {
//		 this.a = a ;  //this = ���� object(��ü)�� ��Ī�ϴ� ������
//	 }
//	 //a getter
//	 //������� a�� ���� �����ϴ� �޼ҵ� 
//	 public int getA() {
//		 return this.a;
//	 }
//	 public void setB(int b) {
//		 this.b = b;
//	 }
//	 public int getB() {
//		 return b;
//	 }
	 
	 
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

	public static void main(String[] args) {
//		System.out.println(a); ���� : non-static �� �ٷ� ȣ���� �Ұ��ϴ� . 
//		1) Ŭ�����̸� ���� = new Ŭ�����̸�();
//		2) ����.�ɹ�
		
		MyTest m1 = new MyTest();
		m1.a=100;
		m1.b=200;
		System.out.println(m1.a + ":" + m1.b);
		MyTest m2 = new MyTest();
		System.out.println(m2.a + ":" + m2.b);
		m2.a = 300;
		m2.b = 500;
		System.out.println(m2.a +":" + m2.b);

		m1 = null; //��ü������ �ʱ�ȭ �ϴ� Ű����
//		System.out.println(m1.a + ":" + m1.b);   //���� : NullPointerException
		
		m1 =new MyTest();
		System.out.println(m1.a + ":" + m1.b); // 0: 0
	}
	
	
}
















