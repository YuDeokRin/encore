package com.test01;
//java.lang.Math
//java.lang.Integer

public class Test {

	public static void Exam01(int r) {
		//������ r�� �Է¹޾� ���� �ѷ��� ���غ���
		double res = r*2*Math.PI;
		System.out.println(res);
	}

	public static double Exam02(int r) {
		//������ r�� �Է¹޾� ���� �ѷ��� ���� �޾� ����
		double res = r*2*Math.PI;
		return res;
	}
	
	public static void main(String[] args) {
		Exam01(10);
		double res = Exam02(7);
		System.out.println(res);
		//public static double sqrt(double a) -> dobule ���ڸ� �ָ� double ���� �����ϴ� static �޼ҵ�
	
		
		double res02  = Math.sqrt(100); // double a = 100 ;  = �ڵ� ����ȯ
		System.out.println(res02);
	
		res02  = Math.sqrt(90);
		System.out.println(res02);

		int res03  = (int)Math.sqrt(100); //int res03 =(int)double; = ���� ����ȯ
		System.out.println(res03);
	
	}

}


