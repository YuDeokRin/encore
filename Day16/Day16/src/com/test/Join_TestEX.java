package com.test;

class My_Test02 extends Thread{
	public My_Test02(String name) { 
		super(name);
		}
	public void run() {
		for(int i =0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println((i+1) + "초 경과 \t:" + getName() );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//try end
		}//for end
	}//run end
}//class end

public class Join_TestEX {
	public static void main(String[] args) {
		My_Test02 tt = new My_Test02("야옹이");	tt.start();
		My_Test02 tt02 = new My_Test02("멍멍이");  tt02.start();
		System.out.println("ThreadTest 클래스 처리를 시작했습니다.");

		try {
			tt.join(); // tt.join(3000); //tt02.join() 
			tt02.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println("My_Test 클래스의 처리가 종료되었습니다.");
		System.out.println("Main 클래스 처리를 시작합니다.");
		for(int i = 0; i < 5 ; i++) {
			System.out.println((i+1)+ "번째의 처리입니다.");
		}
	}

}
