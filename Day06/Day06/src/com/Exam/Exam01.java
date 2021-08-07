package com.Exam;

/**
 * exam01) 10 20 30 40 50 60 70 80 90 100
 * 조건 1 : 단일 for로 출력
 * 조건 2 : 1차원 배열로 출력
 *
 */
public class Exam01 {
	public static void Exam() {
		int arr[] = {10, 20, 30, 40, 50, 60, 70,80,90,100};
		
		
		for(int i = 0; i <arr.length; i++) {
			System.out.printf("%5d",arr[i]);
		}
	}
	public static void main(String[] args) {
		Exam();
		
	}

}
