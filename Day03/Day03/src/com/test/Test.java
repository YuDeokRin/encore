package com.test;
// 선언부
// 1.package : 현재 클래스가 위치한 namespace
// 2.import  package : 현재 클래스에서 참조할 수 있는 클래스가 있는 namespace(package)
// 3.import static package : 현재 클래스에서 참조할 수  있는 static 메소드 참조할 때 사용 



public class Test { // .java 명과 동일해야 한다. 자바의 실행 단위는 class이다.
	public static void Prn() {
		
		System.out.println("Test's Prn()");
		
	}
	public static void Disp() {
		System.out.println("Test's Disp");
		System.out.println("11111111111111111");
		
	}
	public static void main(String[] args) { // main()진입점 = main ,method
		Prn();
		System.out.println("==============main============");
		Disp();
		
	}
}

