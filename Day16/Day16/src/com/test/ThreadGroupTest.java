package com.test;

public class ThreadGroupTest {

	public static void main(String[] args) {
		ThreadGroup tg1 = new ThreadGroup("MyTG1");
		ThreadGroup tg2 = new ThreadGroup(tg1, "MyTG2");
		Thread t1 = new Thread(tg1, "MyThread1");
		Thread t2 = new Thread(tg2, "MyThread1");
		System.out.println("t1 = " + t1.getThreadGroup() );
		System.out.println("t2 = " + t2.getThreadGroup());
		
	}

}
