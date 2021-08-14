package com.test02;
import java.util.*;

import com.mycom.Address;


// 순서 있는 목록을 List 객체로 확인 해보자.
public class MyList {
	
	
	public static void View() {
		Vector v = new Vector(10, 2);
		System.out.println(v.capacity() + ": 사이즈- " + v.size());
	
		for(int i = 0; i <=10; i++) {
			v.add(i);
		}
		v.add("abc");
		v.add(92.8);
		
		System.out.println(v);
		System.out.println(v.capacity() + ": 사이즈 - " + v.size());
	}
	
	public static void View02() {
		List<Integer> v = new ArrayList<Integer>(); // 동적바인딩	
//		Vector<Integer> v = new Vector<Integer>();	
		for(int i = 0; i <=10; i++) {
			v.add(i); //new Integer(i);
		}
		
		System.out.println(v);
//		System.out.println(v.capacity() + ": 사이즈 - " + v.size());
	}
	public static void View03() {
		//Address를 관리하는 ArrayList 객체를 생성하자.
		List<Address> list = new ArrayList<>();
		Address a1 = new Address("1111","1111","1111");
		list.add(a1);
		list.add(new Address("2222","2222","2222"));
		list.add(new Address("3333","3333","3333"));
		System.out.println(list);// 객체 출력
		
		// 1111이름을 홍길동 변환하자. 
		list.get(0).setName("홍길동");
		for(Address ar : list) {
			System.out.println(ar);
		}
		System.out.println("\n 222의 주소를 부산으로 변경하자.");
		
	
		for(Address ar : list) {
			if(ar.getName().equals("222")) {
				ar.setAddr("부산");
			}
			System.out.println(ar);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		View03();
	}

}
