package com.test02;

public class Test02 {
	public static void Exam01() {
		System.out.println("값을 출력 해보자 + [+는 \" \"를 만나면 연결문자열이 된다.]");
		System.out.print(true + "\n");
		System.out.print(false+ "\n");
		System.out.print(92.9+ "\n"); //double
		System.out.print(100+ "\n"); //int 
		System.out.print('a' + "\n");
		System.out.print("a" + "\n");
	}
	public static void Exam03() {
		//2라는 숫자를 byte방에  b1이라는 이름으로 저장하고 싶다. 데이터타입 변수이름 = 값;
		
		byte b1 =2; //b1이라는 지역 변수에 2라는 값을 대입했다. (메소드 안에 변수 지역변수 ) byte = 1byte = 8bit = 0,1(bit) *8
		
		System.out.println(b1);
		byte b2 =(byte)128;		//-128 ~ 127
		System.out.println(b2);
		int ai =100;
		System.out.println(ai);
		ai=300; //재대입
		System.out.println(ai);
		
		long l = 100L;
		System.out.println(l);
		
		double d = 32.8D;
		System.out.println(d);
				
		float f = 92.8f;
		System.out.println(f);
		
		String str ="adcb";
		System.out.println(str);

	}
	public static void Exam04() {
		
	}
	
	public static void main(String[] args) {
		Exam01();
		
		Exam03();
	}

}
