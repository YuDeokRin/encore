package com.exam;

import java.util.Vector;

public class AppleTree extends Thread{
	
	private Vector<Integer> buffer = new Vector<>(400, 200);
	
	public AppleTree(String name) {
		super(name);
	}
	
	public int pop() {
		
		
		
		return 0;
	}
	public void push(int apple) {
		
	}

	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println(getName());
		}
	}
	
}
