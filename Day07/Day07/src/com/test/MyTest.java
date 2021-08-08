package com.test;

public class MyTest {
	 private int a ; // 전역 변수는 초기화 하지 않는다   
	 private int b ; // 멤버 변수 은닉화
	
//	 //a setter & getter
//	 //객체 주소를 통해 값을 매개 변수 int a로 받아 멤버 변수 a에게 전달 및 변경 하는 메소드
//	 public void setA(int a) {
//		 this.a = a ;  //this = 현재 object(객체)를 지칭하는 연산자
//	 }
//	 //a getter
//	 //멤버변수 a의 값을 리턴하는 메소드 
//	 public int getA() {
//		 return this.a;
//	 }
//	 public void setB(int b) {
//		 this.b = b;
//	 }
//	 public int getB() {
//		 return b;
//	 }
	 
	 
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
//		System.out.println(a); 오류 : non-static 은 바로 호출이 불가하다 . 
//		1) 클래스이름 변수 = new 클래스이름();
//		2) 변수.맴버
		
		MyTest m1 = new MyTest();
		m1.a=100;
		m1.b=200;
		System.out.println(m1.a + ":" + m1.b);
		MyTest m2 = new MyTest();
		System.out.println(m2.a + ":" + m2.b);
		m2.a = 300;
		m2.b = 500;
		System.out.println(m2.a +":" + m2.b);

		m1 = null; //객체변수를 초기화 하는 키워드
//		System.out.println(m1.a + ":" + m1.b);   //오류 : NullPointerException
		
		m1 =new MyTest();
		System.out.println(m1.a + ":" + m1.b); // 0: 0
	}
	
	
}
















