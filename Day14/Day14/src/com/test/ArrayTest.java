package com.test;

/**
 * @author Deok
 * 배열에 관련된 클래스를 살펴보자.
 * String = char[]
 * main args를 이용해서 사번을 입력받자.
 * 		111ABC		222DEF 사원의 값을 입력받아 첫글자만 숫자로 변환해서 합을 구해보자 .
 * 
 * String 클래스 
 */
public class ArrayTest {
public static void main(String[] args) {
	
		String str = "adcd"; // <- a[0] , b[1], c[2], d[3] ; 
		System.out.println("case 1: charAt()을 이용한 값추출"); // charAt() : 한 문자씩 추출해서 리턴해주는 것
		System.out.println(str.charAt(1));
		System.out.println(str);
		for(int i = 0 ; i< str.length(); i++){
			System.out.printf("%3c", str.charAt(i));
		}
		
		System.out.println("\n\n case2 : char[] toCharArray()을 이용한 값추출 "); //toCharArray() : String을 char배열로 바꿔서 리턴해주는 것
		char[] res = str.toCharArray(); // char[] res 배열 변수 -> str.toCharArray();  String str을 char[] 배열로 바꿔서 넣는다.
		for(char r : res) 				// char r=0부터   res까지  System.out.printf("%3c", r); 
		System.out.printf("%3c", r);
		
		System.out.println("\n\n case3  : byte[] getBytes()을 이용한 값추출 "); // getBytes() : String의 객체를 바이트 순서로 인코딩 하고 결과를 새바이트 배열에 저장 
		byte[] res01 = str.getBytes();
		System.out.println(res01);
		for(byte r0 : res01)
		System.out.printf("%3c", r0);
	}

}
	

