package com.test01;
import java.util.*;

public class Address_Test {
	public static void main(String[] args) {
		List<Address> list_all = new ArrayList<>();
	
		list_all.add(new Address("111","111"));
		list_all.add(new Address("444","444"));
		list_all.add(new Address("333","333"));
		
		System.out.println("��ü ���");
		for(Address ar : list_all) {
			System.out.println(ar);
		}
		System.out.println();
		System.out.println("���� �� ��� ");
		Collections.sort(list_all); // list_all�� ���� E ����� ���Ŀ� ���� ������ �ϰڴ�.
		
		for(Address ar : list_all) {
			System.out.println(ar);
		}
		
	}
}
