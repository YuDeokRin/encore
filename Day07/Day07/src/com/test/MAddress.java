package com.test;

public class MAddress {
	public static void main(String[] args) {
		Address a1 = new Address();// ��ü�� ���� 
		Address a2 = new Address();// ��ü�� ���� 
		Address a3 = new Address();// ��ü�� ���� 
		
		
		 a1.setName("ȫ�浿"); 
		 a1.setAddr("����"); 
		 a1.setPhone("02-000-000");
		 
		 System.out.printf("\n %10s %10s %15s \n", a1.getName(), a1.getAddr(), a1.getPhone());
		 
		
		 a2.setName("���浿"); 
		 a2.setAddr("��õ");  
		 a2.setPhone("031-000-000");
		 
		 System.out.printf("\n %10s %10s %15s \n", a2.getName(), a2.getAddr(), a2.getPhone());
		 
		
		 a3.setName("�ֱ浿"); 
		 a3.setAddr("�λ�"); 
		 a3.setPhone("051-000-000");
		 
		 System.out.printf("\n %10s %10s %15s \n", a3.getName(), a3.getAddr(), a3.getPhone());
		 

	}

}
