package com.test03;

class ThreadExample2 extends Thread{
	int i; 
	
	
	public ThreadExample2(String name) {
		super(name); //getName();
	}
	public void run() {
		while(i<30) {
			i++;
			System.out.println(Thread.currentThread().getName() + " i : " + i);
		}//while
	}//run
}// class



public class ThreadTest2 {
	public static void main(String[] args) {
		Tread t  = new ThreadExam(); // ThreadExample2 t = new ThreadExample2();
		t.start();
		
		Tread t02  = new ThreadExam(); 
		t02.start();
	}

}
