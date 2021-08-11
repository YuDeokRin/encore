package com.test;
/*
 * void setPriority(int newPriority) �������� �켱������ ������ ������ �����Ѵ�.
 * int getPriority()    �������� �켱������ ��ȯ�Ѵ�.
 * 
 * public static final int MAX_PRIORITY =10 //�ִ�켱����
 * public static final int MIN_PRIORITY =1 //�ּҿ켱����
 * public static final int NORM_PRIORITY =5 //����켱����
 */
class ThreadEx8_1 extends Thread{
	public void run() {
		for(int i = 0; i< 300; i++) {
			System.out.print("-");
			for(int x=0; x< 10000000; x++); //�ð� ������ for��
		}
	}
}

class ThreadEx8_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("|");
			for(int x = 0; x < 10000000; x++); //�ð� ������ for��
		}
	}
}


public class ThreadEx8 {
	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		
		//th1.setPriority(5); <-�����Ȱ� , �������� �켱������ 5�� �����ȴ�. 
		th2.setPriority(7); // �켱������ 7�� ����  5���� 7�� �켱������ �� ���� 
		
		System.out.println("Proiority of th1(-) : " + th1.getPriority());
		System.out.println("Proiority of th2(-) : " + th2.getPriority());
		th1.start();
		th2.start();
		
	}

}
