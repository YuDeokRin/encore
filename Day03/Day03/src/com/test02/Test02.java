package com.test02;

public class Test02 {
	public static void Exam01() {
		System.out.println("���� ��� �غ��� + [+�� \" \"�� ������ ���Ṯ�ڿ��� �ȴ�.]");
		System.out.print(true + "\n");
		System.out.print(false+ "\n");
		System.out.print(92.9+ "\n"); //double
		System.out.print(100+ "\n"); //int 
		System.out.print('a' + "\n");
		System.out.print("a" + "\n");
	}
	public static void Exam03() {
		//2��� ���ڸ� byte�濡  b1�̶�� �̸����� �����ϰ� �ʹ�. ������Ÿ�� �����̸� = ��;
		
		byte b1 =2; //b1�̶�� ���� ������ 2��� ���� �����ߴ�. (�޼ҵ� �ȿ� ���� �������� ) byte = 1byte = 8bit = 0,1(bit) *8
		
		System.out.println(b1);
		byte b2 =(byte)128;		//-128 ~ 127
		System.out.println(b2);
		int ai =100;
		System.out.println(ai);
		ai=300; //�����
		System.out.println(ai);
		
		long l = 100L;
		System.out.println(l);
		
		double d = 32.8D;
		System.out.println(d);
				
		float f = 92.8f;
		System.out.println(f);
		
		String str ="adcb";
		System.out.println(str);

	}
	public static void Exam04() {
		
	}
	
	public static void main(String[] args) {
		Exam01();
		
		Exam03();
	}

}
