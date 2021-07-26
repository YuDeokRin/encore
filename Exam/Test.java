
package com.test02;
import com.test.*; // 패키지.클래스;

public class Test {

	public static void main(String[] args) {
		
		
		My.Disp();
		My.Prn(); 
		System.out.println("=====위========아래==============비교==============");
		com.test.My.Disp();
		com.test.My.Prn();
	}

}
/*

	자바의 식별자 규칙 : 클래스이름, 인터페이스이름, 메소드이름, 변수이름, 상수이름, 배열이름을 구별할 수 있는 규칙
	
	1. 대소문자를 구별한다.  ABc ABC aBC abc aBc
	2. 132자는 넘지 않는다.
	3. 숫자로 시작하지 않는다.  4test.java 
	4. 공백추가하지 않는다.		class 	abc 	def{ }
	5. 키워드로 생성하지 않는다. for.java  while.java https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
	6. 특수문자 중 예약과 관련된 이름으로 시작하지 않는다. $, #, &, * 
*/