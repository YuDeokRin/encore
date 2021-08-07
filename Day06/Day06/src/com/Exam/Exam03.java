package com.Exam;

/**
 * exam03)
 * 1 ~ 25까지의 값을 5,5 배열에 대입시킨 후 
 * 아래와 같이 출력한다.
 * 		25 24 23 22 21
 * 		20 19 18 17 16
 * 		15 14 13 12 11
 * 		10  9  8  7  6
 * 		5   4  3  2  1
 *
 */
public class Exam03 {
	
	public static void Exam() {
		int arr[][] = new int[5][5];
		int num = 25;
		
		for(int i = 0; i< 5; i++) {
			for(int j= 0; j < 5; j++) {
				arr[i][j] = num;
				--num;
				
			}
		
		}
		for(int i = 0; i<5; i++ ) {
			for(int j = 0; j<5; j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
	}		
	public static void main(String[] args) {
		Exam();
	}
}
