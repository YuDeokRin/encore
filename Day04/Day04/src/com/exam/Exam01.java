package com.exam;

import com.my.Score;


public class Exam01 {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		int kor = 80, eng=70, mat= 60;
		int tot = Score.getHap(kor, mat, eng);
		int avg = Score.getAvg(tot);
		String grad = Score.getGrad(avg);
		
		System.out.println("�̸� ="+ name);
		System.out.println("���� ���� = "+ kor);
		System.out.println("���� ���� = "+ eng);
		System.out.println("���� ���� = "+ mat);
		System.out.println("�� ���� = " + tot);
		System.out.println("��� = " + avg);
		System.out.println("���� = " + grad);
		
	}
}
