package com.test01;

public class My_T {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//@SuppressWarnings("unchecked")
		Emp e1 = new Emp(7092,"Scott");
		
		//@SuppressWarnings("unchecked")
		Emp e2 = new Emp(new Integer(7093),"9000");
		System.out.println(e1);
		System.out.println(e2);
		
		
		//@SuppressWarnings("unchecked")
		Emp e3 = new Emp("7904E9090","9001");
		System.out.println(e3);
		e3.setEname("abcde");
		System.out.println(e3);
		
		Emp e4= new Emp(new Integer("90"), new java.util.Date());
		System.out.println(e4);
	}
}
