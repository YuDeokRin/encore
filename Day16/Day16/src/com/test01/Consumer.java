package com.test01;

public class Consumer implements Runnable{
	private SyncStack theStack;
	
	public Consumer(SyncStack s) {
		theStack = s;
	}
	
	@Override
	public void run(){
		char c ;
		for(int i = 0 ; i <200; i++) {
			c = theStack.pop();
			try {
				Thread.sleep((int)(Math.random()*300));
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
