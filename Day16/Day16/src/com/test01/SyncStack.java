package com.test01;

import java.util.Vector;

public class SyncStack {
	private Vector<Character> buffer = new Vector<>(400, 200);
	

	public char pop() {
	char c;
	synchronized (this) {
		
	while(buffer.size()== 0) {
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//try
	}//while
	}
	c = buffer.remove(buffer.size()-1).charValue();
	System.out.println("Consumer" + ":"  + c);
	return c;
	}//pop end
	
	public synchronized void push(char c) {
		this.notify();
		Character charObj = new Character(c);
		buffer.addElement(charObj);
		System.out.println("Producer" + ":" + c);
	}
	
	
}
