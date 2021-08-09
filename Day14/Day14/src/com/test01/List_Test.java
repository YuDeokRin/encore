package com.test01;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.mycom.Address;

public class List_Test {
	public static void view_test() {
	List<Address> list_all = new ArrayList<>();
	Address a1 = new Address("1111","1111","1111");
	list_all.add(a1);
	list_all.add(new Address("2222","2222","2222"));
	list_all.add(new Address("3333","3333","3333"));
	
		Print_List01(list_all);
		Print_List02(list_all);
		Print_List03(list_all);
	}
	public static void Print_List01(List<Address> ar) {
		//출력메소드
		System.out.println("case 1 : ");
		for(int i = 0; i<ar.size(); i++) {
			Address res = ar.get(i);
			System.out.println(res);
			
		}
	}
	public static void Print_List02(List<Address> ar) {
		//출력 메소드
		System.out.println("case 2 : ");
		for(Address res : ar) {
			System.out.println(res);
		}
	}
	public static void Print_List03(List<Address> ar) {
		//출력메소드
		System.out.println("case 3 : ");
		Iterator<Address>	res = ar.iterator();
		while(res,hasNext()) {
			System.out.println(res.next());
		}
	}
	
	public static void main(String[] args) {
		view_test();
	}
}

