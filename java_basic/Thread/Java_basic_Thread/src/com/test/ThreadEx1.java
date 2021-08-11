package com.test;

public class ThreadEx1 {
	public static void main(String[] args) {

		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r); //생성자 Thread(Runnable target)
		//위에  7,8줄을 한 줄로 표현하면, Thread t2 = new Thread(new ThreadEx1_2());
		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread{ 	// 1.Thread클래스를 상속해서 쓰레드 구현
	public void run() { //Thread가 수행할 작업 
		for(int i = 0; i < 5; i++) {
			System.out.println(getName()); // 조상인 Thread의 getName()을 호출
//			System.out.println(0);
		}
	}
}

class ThreadEx1_2 implements Runnable{	//2.Runnable 인터페이스를 구현해서 쓰레드를 구현 
	public void run() {//Thread가 수행할 작업 
		for(int i = 0; i < 5; i++) {
			//Thread.currentThread() <- 현재 실행 중인 Thread를 반환한다.
			//System.out.print(1);
			System.out.println(Thread.currentThread().getName());
		}
	}
}
