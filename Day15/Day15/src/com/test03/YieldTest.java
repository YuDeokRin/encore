package com.test03;

public class YieldTest {
	
	Thread t1, t2; 
	Runnable r1, r2;
	
	public static void main(String[] args) {
		YieldTest y = new YieldTest();
		y.go();
	}
	public void go() {
		r1= new Yield1();
		r2= new Yield2();
		t1= new Thread(r1, "具克捞");
		t2= new Thread(r2, "港港捞");

		t1.start();
		t2.start();
		
	}
	
	class Yield1 implements Runnable{ //具克捞

		@Override
		public void run() {
			for(int i = 0; i < 20; i++) {
				if(i % 10 == 0 ) 
					Thread.yield();
			
				System.out.println("Yield => " +
				Thread.currentThread().getName()+ ","+ i);
			}//for end
		}//run end
	}//class 
	class Yield2 implements Runnable{

		@Override
		public void run() {
			for(int i = 0; i < 20; i++) {
				if(i % 5 == 0 ) {
					Thread.yield();
			
				}
				System.out.println("Yield2 => " +
				Thread.currentThread().getName()+ ","+ i);
			}//for end
			
		}
		
	}
	
}
