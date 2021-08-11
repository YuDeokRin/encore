package com.test;

class My_Test extends Thread{
	public void run() {
		for(int i =0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println((i+1) + "초 경과");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//try end
		}//for end
	}//run end
}//class end

public class Join_Test {
	public static void main(String[] args) {
		My_Test tt = new My_Test();
		tt.start();
		System.out.println("ThreadTest 클래스 처리를 시작했습니다.");
		//My_Test 클래스의 처리가 끝날 때까지 Main Thread = Join_Test의 처리는 대기해라
		try {
			//
			//tt.join(3000);
			tt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Main = Join_Test 클래스 처리를 실행
		System.out.println("My_Test 클래스의 처리가 종료되었습니다.");
		System.out.println("Main 클래스 처리를 시작합니다.");
		for(int i = 0; i < 5 ; i++) {
			System.out.println((i+1)+ "번째의 처리입니다.");
		}
	}

}
