package com.test03;

class ThreadExam implements Runnable{
	int i; 
	
	public void run() {
		while(i<30) {
			i++;
			System.out.println(Thread.currentThread().getName() + " i : " + i);
		}//while
	}//run
}
public class Yield_Test {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadExam(),"具克捞"); //
		Thread t2 = new Thread(new ThreadExam(),"港港捞");
		Thread.yield();
		t1.start();
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getName() + "," + t1.getId() + "," + t1.getPriority());
		System.out.println(t2.getName() + "," + t2.getId()+ "," + t2.getPriority());
	}

}
