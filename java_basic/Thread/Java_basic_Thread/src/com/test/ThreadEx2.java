package com.test;

public class ThreadEx2 {
	public static void main(String[] args)  throws Exception{
		ThreadEx2_test t1 = new ThreadEx2_test();
		t1.start();
	}
}

class ThreadEx2_test extends Thread{
	public void run() {
		throwException();
	}

	private void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}