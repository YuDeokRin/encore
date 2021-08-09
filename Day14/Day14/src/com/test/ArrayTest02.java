package com.test;

import java.io.IOException;

public class ArrayTest02 {
	public static String ConString(String str) {
		// 입력받은 문자열을 역순으로 리턴한다.
		//1)char[]배열로 리턴받는다.
		char[]res = str.toCharArray();//배열로 리턴 받을 변수
		char[]cv_str = new char[res.length]; //역순으로 받을 변수
		
		//2) 역순 for를 이용해서 char[]로 담아 String 생성자로 객체 생성 후 리턴
			for(int i = res.length-1 ; i>= 0 ; i--) {
				cv_str[res.length-i-1] =res[i];  // length(1부터)와 index(0부터 )는 항상 1차이가 난다. 
				
			}
			return new String(cv_str);		
	}

	
	public static void View_Res(String str) {
		
		int upper_cnt = 0 ; //대문자 개수
		int lower_cnt = 0 ; // 소문자 개수
		int space_cnt = 0; // 공백에 개수
		for(char r : str.toCharArray()) {
			if(Character.isUpperCase(r)) { //Character.isUpperCase(r)의 변수가 r(0~str.toCharArray 끝 까지 검사하면 대문자이면 upper_cnt를 올린다.) 
				upper_cnt++; 			// 대문자 개수 상승
				//Character.toLowerCase(r); 대문자이면 소문자로 바꾼다.
				//Character.toUpperCase(r); 소문자이면 대문자로 바꾼다.
			}
			if(Character.isLowerCase(r)) { // Character.isLowerCase(r)의 r이 소문이면 lower_cnt에 카운터가 올라간다.
				lower_cnt++;			// 소문자 개수 상승 
			}
			
			if(Character.isSpaceChar(r)) {
				space_cnt++;
			}
		}//for end
		System.out.println("대문자 개수 : " + upper_cnt+", 소문자 : " + lower_cnt+ ", 공백 개수 : " + space_cnt);
		
	}
	
	
	public static void View_Res02(String str) {
		
		int upper_cnt = 0 ; //대문자 개수
		int lower_cnt = 0 ; // 소문자 개수
		int space_cnt = 0; // 공백에 개수
		//case을 쓰는 이유는 if의 조건문이 많을 때 case문을 쓴다 .
		for(char r : str.toCharArray()) {
			int res = Character.getType(r); // 판별을 할 수 있게 해주는 변수 res , 내가 입력받은 한글자씩 분철한 r을 넣는다.
			switch(res) {
			case Character.SPACE_SEPARATOR: //공백을 구분
				space_cnt++;
				break;
			case Character.LOWERCASE_LETTER:
				lower_cnt++;
				break;
			case Character.UPPERCASE_LETTER:
				upper_cnt++;
				break;
			}
		}//for end
		System.out.println("대문자 개수 : " + upper_cnt+", 소문자 : " + lower_cnt + ", 공백 개수 : "+ space_cnt);
		
	}
	public static void main(String[] args) {
	//아래 문장을 View_Res로 전달해서 소문자의 개수와 대문자의 개수를 출력해보자.
	//1. 지정된 문장을 ConString로 전달해서 역순으로 리턴받는다.
	//2. 1번의 결과를 View_Res로 전달한다.
		String str  = "The String class represents character strings.";
		System.out.println("원본 str: " + str);
		System.out.println("str의 역순 : " + ConString(str));
		View_Res(ConString(str)); // 대문자 , 소문자 개수 
		View_Res02(ConString(str));
			}

}
