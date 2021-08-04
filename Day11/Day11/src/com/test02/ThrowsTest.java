package com.test02;

//throw :  
//throws : ÇØ´ç 
public class ThrowsTest {
	public static void Prn01() throws Exception {
		System.out.println("Prn01");
		throw new Exception();
	}
	public static void Prn02() throws Exception {
		Prn01();
	}
	public static void Prn03() throws Exception {
		Prn02();
	}
	public static void Prn04() throws Exception {
		Prn03(); 
	}
	
	public static void main(String[] args) {
		try {
			Prn04();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
