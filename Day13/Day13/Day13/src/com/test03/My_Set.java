package com.test03;
import java.util.*;
import com.mycom.*;

public class My_Set {
	public static void View() {
		Set<String> my_set  = new HashSet<>();
		my_set.add("abc");
		my_set.add("abc");//중복 데이터 허용안함 - 이유 : value로 관리하기 때문에 
		my_set.add("abc"); 
		
		my_set.add("1111");
		my_set.add("22222");
		System.out.println(my_set);
		
		for(String r : my_set) {
			System.out.println(r);
		}
	}
	public static void View01() {
		Set<Address> s1 = new HashSet<>();
		Address a1 = new Address("1111","1111","1111");
		s1.add(a1);
		s1.add(new Address("222","222","222"));
		Address ar01 = new Address("333","333","3333");
		Address ar02 = new Address("333","333","3333");
		Address ar03 = new Address("333","333","3333");
		
		s1.add(new Address("333","333","333"));
		s1.add(new Address("333","333","333"));
		s1.add(ar01);
		s1.add(ar02);
		s1.add(ar03);
		
		
		System.out.println(s1 + " \n, size = "+ s1.size());
		System.out.println();
		for(Address ar : s1) {
			if(ar.getName().equals("222")) {
				ar.setName("정길동");
			}
			System.out.println(ar);
		}
		
		s1.remove(ar01);
		System.out.println(s1 + " \n, size = "+ s1.size());
		
		s1.clear();
		System.out.println(s1 + " \n, size = "+ s1.size());
		
		
	}
	public static void main(String[] args) {
		View01();
	}
}
