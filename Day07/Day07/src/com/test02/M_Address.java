package com.test02;
import com.mycom.*;

public class M_Address {

	public static void main(String[] args) {
		Address a1 = new Address("ȫ�浿1 ", "����1", "02-001-0000");
		Address a2 = new Address("ȫ�浿2 ", "����2", "02-002-0000");
		Address a3 = new Address("ȫ�浿3 ", "����3", "02-003-0000");
		
		
		Prn(a1);
		Prn(a2);
		Prn(a3);
		
		System.out.println("==========================================================");
		System.out.println("exam 01 : ȫ�浿1�� �̸��� ���浿���� ���� �� ��ü�� ���");	
		a1.setName("���浿");
		Prn(a1);
		
		System.out.println("===========================================================");
		System.out.println("exam 02 : ȫ�浿2�� �ּҸ� �λ����� ���� �� ���");
		a2.setAddr("�λ�");
		Prn(a2);
		
		System.out.println("============================================================");
		System.out.println("exam 03 : ���浿�� ��ȭ��ȣ�� \"031-000-000���� ����\"���� ���� �� ���");
		a3.setPhone("031-000-000");
		
		System.out.println("=============================================================");
		System.out.println("exam 04 : ȫ�浿3�� �ּҿ� ��ȭ��ȣ�� ��õ��  031-333-333���� ���� �� ��� ");
		a3.setAddr("��õ");
		a3.setPhone("031-333-333");
		System.out.println(a3);
		
		System.out.println("================================================================");
		System.out.println("exam 05 : a4��� ��ü�� Address�� �����ؼ� �̼��� ���ֵ� 00-0000���� ���� �� ��� ");
		Address a4 = new Address("�̼��� ", "���ֵ�", "00-0000");
		Prn(a4);
		
		
		
	}
	
	public static void Prn(Address res) {
		System.out.println(res.toString()); //res
	}

}
