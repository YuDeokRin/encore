package com.test;
//import com.mytest.*;
import static com.mytest.MyCalc.*;  //�޼ҵ���� �ø� �� �ִ�. 

public class Test06 {

	public static void main(String[] args) {
		int a = 200;
		int b = 100;
		
//		System.out.printf("%5d  + %5d = %5d \n", a,b,MyCalc.getHap(a, b));
//		System.out.printf("%5d  - %5d = %5d \n", a,b,MyCalc.getSub(a, b));
//		System.out.printf("%5d  * %5d = %5d \n", a,b,MyCalc.getMul(a, b));
//		System.out.printf("%5d  / %5d = %5d \n", a,b,MyCalc.getDiv(a, b));
		
		System.out.printf("%5d  + %5d = %5d \n", a,b,getHap(a, b));
		System.out.printf("%5d  - %5d = %5d \n", a,b,getSub(a, b));
		System.out.printf("%5d  * %5d = %5d \n", a,b,getMul(a, b));
		System.out.printf("%5d  / %5d = %5d \n", a,b,getDiv(a, b));
	}

}
