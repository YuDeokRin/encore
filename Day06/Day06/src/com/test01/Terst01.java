package com.test01;

public class Terst01 {
	public static int [] ArrayTest01() {
		int [] ar = new int[] {10,20,30,40,50};
		return ar;		//&ar[0]를 리턴하겠다.
	}
	public static void main(String[] args) {
		int []res = ArrayTest01();
		
		for(int r : res) { //제너릭for : for(값을 받을 변수 : 시작주소값을 가진 변수){}  
		System.out.printf("%5d", r);
		}
		
		System.out.println();
		char[] anArrayOfChars;
		anArrayOfChars = new char[] {'A', 'B', 'C'};
		
		for(char ch : anArrayOfChars ) {
			System.out.printf("%5c", ch);
		}
	}

}
