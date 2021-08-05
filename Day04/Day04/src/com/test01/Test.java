package com.test01;
//java.lang.Math
//java.lang.Integer

public class Test {

	public static void Exam01(int r) {
		//반지름 r를 입력받아 원의 둘레를 구해보자
		double res = r*2*Math.PI;
		System.out.println(res);
	}

	public static double Exam02(int r) {
		//반지름 r를 입력받아 원의 둘레를 리턴 받아 보기
		double res = r*2*Math.PI;
		return res;
	}
	
	public static void main(String[] args) {
		Exam01(10);
		double res = Exam02(7);
		System.out.println(res);
		//public static double sqrt(double a) -> dobule 숫자를 주면 double 값을 리턴하는 static 메소드
	
		
		double res02  = Math.sqrt(100); // double a = 100 ;  = 자동 형변환
		System.out.println(res02);
	
		res02  = Math.sqrt(90);
		System.out.println(res02);

		int res03  = (int)Math.sqrt(100); //int res03 =(int)double; = 강제 형변환
		System.out.println(res03);
	
	}

}


