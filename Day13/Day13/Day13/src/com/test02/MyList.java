package com.test02;
import java.util.*;

import com.mycom.Address;


// ���� �ִ� ����� List ��ü�� Ȯ�� �غ���.
public class MyList {
	
	
	public static void View() {
		Vector v = new Vector(10, 2);
		System.out.println(v.capacity() + ": ������- " + v.size());
	
		for(int i = 0; i <=10; i++) {
			v.add(i);
		}
		v.add("abc");
		v.add(92.8);
		
		System.out.println(v);
		System.out.println(v.capacity() + ": ������ - " + v.size());
	}
	
	public static void View02() {
		List<Integer> v = new ArrayList<Integer>(); // �������ε�	
//		Vector<Integer> v = new Vector<Integer>();	
		for(int i = 0; i <=10; i++) {
			v.add(i); //new Integer(i);
		}
		
		System.out.println(v);
//		System.out.println(v.capacity() + ": ������ - " + v.size());
	}
	public static void View03() {
		//Address�� �����ϴ� ArrayList ��ü�� ��������.
		List<Address> list = new ArrayList<>();
		Address a1 = new Address("1111","1111","1111");
		list.add(a1);
		list.add(new Address("2222","2222","2222"));
		list.add(new Address("3333","3333","3333"));
		System.out.println(list);// ��ü ���
		
		// 1111�̸��� ȫ�浿 ��ȯ����. 
		list.get(0).setName("ȫ�浿");
		for(Address ar : list) {
			System.out.println(ar);
		}
		System.out.println("\n 222�� �ּҸ� �λ����� ��������.");
		
	
		for(Address ar : list) {
			if(ar.getName().equals("222")) {
				ar.setAddr("�λ�");
			}
			System.out.println(ar);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		View03();
	}

}
