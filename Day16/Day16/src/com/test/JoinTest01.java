package com.test;



class JoinTest01 extends Thread {
	private int first, last;
	public int sum ;
	public JoinTest01(int first, int last) {
		 this.first = first;
		 this.last = last ;
	}
	
	public void run() {
		for(int i = first; i<= last; i++) {
			sum = sum + i ;
			System.out.printf("Current Thread :  %s i= %d sum = %d\n",
					currentThread().getName(),i , sum);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		JoinTest01 thread1 = new JoinTest01(1, 5); // 15
		JoinTest01 thread2 = new JoinTest01(6, 10); // 15
		
		thread1.start();
		thread2.start();
		
		//thread1.join();
		thread2.join(100); 
		System.out.println(thread1.getState() + ","+ thread2.getState());
		System.out.println("Thread1 sum : " + thread1.sum);
		System.out.println("Thread2 sum : " + thread2.sum);
		System.out.println("Thread1 sum : " + (thread1.sum + thread2.sum));
	}
	
}
