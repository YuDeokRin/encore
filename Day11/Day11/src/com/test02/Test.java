package com.test02;

public class Test{
	public static void Prn(String []args){
	//두수를 입력해서 합을 구하자.
	
	System.out.println(args.length);
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	System.out.printf("%5d + %5d = %5d", a,b,(a+b));	
	}
	
	// a.class -> JVM -> JVM ...Exception -> a.class catch 처리 한다. 
	public static void main(String[] args) {

		int a = 0;
		try {
			a  = Integer.parseInt(args[0]); //1.프로그램 실행시 오류가 발생해서 프로그램이 중단되면 그 해당 오류에 대한
											// 클래스를 JVM에서 객체를 생성 후(실행 시점으로 ) console에 생성된 객체를 리턴한다.
											// new NumberFormatException();
											//2. catch가 JVM에서 생성되서 리턴한 객체를 받아서 대입 받아 처리한다.
											// NumberFormatException ne
											//  = new NumberFormatException();
		} catch (NumberFormatException ne) {
//			System.out.println("====>"+ ne);
			a= 90;
		}finally {
			System.out.println("반드시 처리해야 할 명령 datanase close, file closs등등");
		}
		
		System.out.println("a = "+ a); //10000000000 << 입력하면 오류 난다 .
		 
		//java.lang.NumberFormatException:
		//at java.lang.NumberFormatException.forInputString(Unknown Source)
	}
}
