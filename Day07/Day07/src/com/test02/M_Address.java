package com.test02;
import com.mycom.*;

public class M_Address {

	public static void main(String[] args) {
		Address a1 = new Address("홍길동1 ", "서울1", "02-001-0000");
		Address a2 = new Address("홍길동2 ", "서울2", "02-002-0000");
		Address a3 = new Address("홍길동3 ", "서울3", "02-003-0000");
		
		
		Prn(a1);
		Prn(a2);
		Prn(a3);
		
		System.out.println("==========================================================");
		System.out.println("exam 01 : 홍길동1의 이름을 정길동으로 변경 후 객체만 출력");	
		a1.setName("정길동");
		Prn(a1);
		
		System.out.println("===========================================================");
		System.out.println("exam 02 : 홍길동2의 주소를 부산으로 변경 후 출력");
		a2.setAddr("부산");
		Prn(a2);
		
		System.out.println("============================================================");
		System.out.println("exam 03 : 정길동의 전화번호를 \"031-000-000으로 변경\"으로 변경 후 출력");
		a3.setPhone("031-000-000");
		
		System.out.println("=============================================================");
		System.out.println("exam 04 : 홍길동3의 주소와 전화번호를 인천과  031-333-333으로 변경 후 출력 ");
		a3.setAddr("인천");
		a3.setPhone("031-333-333");
		System.out.println(a3);
		
		System.out.println("================================================================");
		System.out.println("exam 05 : a4라는 객체를 Address로 생성해서 이순신 제주도 00-0000으로 생성 후 출력 ");
		Address a4 = new Address("이순신 ", "제주도", "00-0000");
		Prn(a4);
		
		
		
	}
	
	public static void Prn(Address res) {
		System.out.println(res.toString()); //res
	}

}
