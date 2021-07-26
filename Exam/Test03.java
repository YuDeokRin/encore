package com.test02;

public class Test03 {
	public static void Prn01() {

		int decVal = 26;
		int hexVal = 0x1a;
		int binVal = 0b11010;
		System.out.println(decVal+ "\t"+ hexVal + "\t" + binVal);
	}
	
	public static void Prn02() {
		long creditCardNumber = 1234_5678_9012_3456L; // . << 이 안되기때문에 구분하기위해서 _(언더바)를 쓴다.
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15f;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(pi);
		System.out.println(hexBytes+ " : " + hexWords);
		System.out.println(maxLong + ": " + nybbles+": "+ bytes);

	}
	public static void Prn03() {
		System.out.println("printf를 사용해 보자 .");
		System.out.printf("정수 = %10d %5d %d \n", 100, 0x8, 0b11 );
		
		System.out.printf("정수 = %10d %5d %o \n", 100, 100, 100 );
		System.out.printf("실수 = %10.2f %.1f \n", 98.754, 98.754);
	}
	public static void main(String[] args) {
		Prn02();

	}

}
