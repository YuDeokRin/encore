package com.test01;
//java.lang.Integer : ������ �����ϴ� Ŭ���� 
//import static java.lang.Math.*;
public class Test01 {

	public static void main(String[] args) {
		
		//���� 100��  2��,8����, ���ڿ��� �������� 
		
		int su = 100;
		System.out.println("2��ȭ : " + Integer.toBinaryString(su));
		System.out.println("16��ȭ : "+ Integer.toHexString(su));
		System.out.println("8��ȭ : "+ Integer.toOctalString(su));
		System.out.println("���ڿ��� ��ȯ " + Integer.toString(su));
		
		String binary = Integer.toBinaryString(su);
		System.out.println(binary);
		

	}

}
