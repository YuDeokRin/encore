package com.test;

public class ThreadEx3 {

	public static void main(String[] args) throws Exception {
		ThreadEx3_test t1 = new ThreadEx3_test();
		t1.run();
	}
}


class ThreadEx3_test extends Thread {
	public void run() {
		throwException();
		
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}