package com.test;
/*
 * void setPriority(int newPriority) 쓰레드의 우선순위를 지정한 값으로 변경한다.
 * int getPriority()    쓰레드의 우선순위를 반환한다.
 * 
 * public static final int MAX_PRIORITY =10 //최대우선순위
 * public static final int MIN_PRIORITY =1 //최소우선순위
 * public static final int NORM_PRIORITY =5 //보통우선순위
 */
class ThreadEx8_1 extends Thread{
	public void run() {
		for(int i = 0; i< 300; i++) {
			System.out.print("-");
			for(int x=0; x< 10000000; x++); //시간 지연용 for문
		}
	}
}

class ThreadEx8_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("|");
			for(int x = 0; x < 10000000; x++); //시간 지연용 for문
		}
	}
}


public class ThreadEx8 {
	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		
		//th1.setPriority(5); <-생략된것 , 쓰레드의 우선순위가 5로 지정된다. 
		th2.setPriority(7); // 우선순위가 7로 지정  5보다 7이 우선순위가 더 높음 
		
		System.out.println("Proiority of th1(-) : " + th1.getPriority());
		System.out.println("Proiority of th2(-) : " + th2.getPriority());
		th1.start();
		th2.start();
		
	}

}
