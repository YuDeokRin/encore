package com.Exam;

/**
 * exam05) 10,10의 배열을 만들어서 공백으로 채우고 아스키코드 :(32) 
 * 		    영문자 E를 출력한다.			
 *		char ch04 = 32;
 *  	System.out.printf("%c", ch04);
 */
public class Exam05 {
	
	public static void Exam() {
		char arr[][] = new char[10][10];
		for(int i = 0 ; i <10; i++) {
			for(int j= 0; j<10; j++) {
				if (i == 0 || i == 1 || i == 4 || i == 5 || i == 8 || i == 9 || j == 0 || j == 1){
					   arr[i][j] = 'E';
					} else {
					   arr[i][j] = (char) 32;
					}
			
				System.out.print(arr[i][j]);
			
			}
			System.out.println();
		}

}
	public static void main(String[] args) {
		Exam();
		
	}
}



