package com.test01;

public class TestIF {
	
	public static void IF01() {
		int a = 10;
		if(a > 0){
		System.out.println("양수");
		}
	}
	public static void IF02() {

		int a = -10;
		if(a > 0){
		System.out.println("양수");
		}else {
			System.out.println("양수가 아님");
		}
	}
	public static void IF03() {
	/*	if() {
			System.out.println("1");
		}
	*/
		   int testscore = 76;
	        char grade;

	        if (testscore >= 90) {
	            grade = 'A';
	        } else if (testscore >= 80) {
	            grade = 'B';
	        } else if (testscore >= 70) {
	            grade = 'C';
	        } else if (testscore >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        System.out.println("Grade = " + grade);
		
	}
	public static void main(String[] args) {
		
		
		IF01();
		IF02();
		IF03();
		
	}
}
