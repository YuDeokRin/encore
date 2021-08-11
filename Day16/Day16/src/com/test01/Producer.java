package com.test01;

public class Producer implements Runnable{
	private SyncStack theStack;
	public Producer (SyncStack s) {
		theStack = s;
	}
	
	public void run() {
		char c ;
		for(int i = 0; i<200; i++) {
			c=(char)(Math.random()*26 +'A');
			theStack.push(c);
			try {
				Thread.sleep((int)(Math.random()*300));
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
