package com.Exam;

/**
 * exam02) exam01의 조건 1로 만들어진 값을 메소드로 리턴받아 역순으로 출력한다.
 * 			출력 : 100 90 80 70 60 50 40 30 20 10
 *
 */
public class Exam02 {

	public static int[] Exam() {
		int arr[] = {10, 20, 30, 40, 50, 60, 70,80,90,100};
		return arr; 
		
	}
	
	public static void main(String[] args) {
		int res[] = Exam();
		for(int r = 9; r >= 0; r--) {
			System.out.println(res[r]);
		}
		
	}

}
