package com.exam;

import com.my.Score;


public class Exam01 {
	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 80, eng=70, mat= 60;
		int tot = Score.getHap(kor, mat, eng);
		int avg = Score.getAvg(tot);
		String grad = Score.getGrad(avg);
		
		System.out.println("이름 ="+ name);
		System.out.println("국어 점수 = "+ kor);
		System.out.println("영어 점수 = "+ eng);
		System.out.println("수학 점수 = "+ mat);
		System.out.println("총 점수 = " + tot);
		System.out.println("평균 = " + avg);
		System.out.println("학점 = " + grad);
		
	}
}
