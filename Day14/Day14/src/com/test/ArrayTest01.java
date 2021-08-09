package com.test;

/**
 * @author Deok
 *	main args를 이용해서 사번을 입력받자.
 * 	111ABC		222DEF 사원의 값을 입력받아 첫글자만 숫자로 변환해서 합을 구해보자 .
 */
public class ArrayTest01 {
	public static void main(String[] args) {
//		String res = args[0]; 	//111ABC
//		String res01 = args[1]; //222DEF
		
		
		//Run As -> Runcongiurations ->  argument -> variables -> String format
		String res = args[0]; //111ABC
		String res01 = args[1]; //222DEF
		
		
		char ch = args[0].charAt(0);  
		System.out.println(ch);
		char ch02 = args[1].charAt(0);
		System.out.println(ch02);
		
		int hap = ch + ch02; // 아스키코드값 :  ch : 1(49) + ch02(50)  = 99 나온다.
		System.out.println(hap);
		
		int sum = Character.digit(ch, 10)  + Character.digit(ch02, 10);		//Character.digit : 지정한 기수에서 문자 ch의 숫자값을 반환한다. 
		System.out.println(sum);
		

	}
}
