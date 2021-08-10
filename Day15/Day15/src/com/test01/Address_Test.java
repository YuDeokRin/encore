package com.test01;
import java.util.*;

public class Address_Test {
	public static void main(String[] args) {
		List<Address> list_all = new ArrayList<>();
	
		list_all.add(new Address("111","111"));
		list_all.add(new Address("444","444"));
		list_all.add(new Address("333","333"));
		
		System.out.println("전체 출력");
		for(Address ar : list_all) {
			System.out.println(ar);
		}
		System.out.println();
		System.out.println("정렬 후 출력 ");
		Collections.sort(list_all); // list_all이 가진 E 요소의 형식에 따라 정렬을 하겠다.
		
		for(Address ar : list_all) {
			System.out.println(ar);
		}
		
	}
}
