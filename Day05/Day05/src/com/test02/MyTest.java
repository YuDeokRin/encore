package com.test02;

public class MyTest {

	public static void main(String[] args) {
			
		System.out.println(Test.test_a); //클래스명.맴버명으로 static 멤버를 호출할 수 있다.
		Test.test_a= 100;//값 전달
		
		System.out.println(Test.test_a); //호출
	}

}
