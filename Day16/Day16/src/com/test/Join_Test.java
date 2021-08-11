package com.test;

class My_Test extends Thread{
	public void run() {
		for(int i =0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println((i+1) + "�� ���");
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
		System.out.println("ThreadTest Ŭ���� ó���� �����߽��ϴ�.");
		//My_Test Ŭ������ ó���� ���� ������ Main Thread = Join_Test�� ó���� ����ض�
		try {
			//
			//tt.join(3000);
			tt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Main = Join_Test Ŭ���� ó���� ����
		System.out.println("My_Test Ŭ������ ó���� ����Ǿ����ϴ�.");
		System.out.println("Main Ŭ���� ó���� �����մϴ�.");
		for(int i = 0; i < 5 ; i++) {
			System.out.println((i+1)+ "��°�� ó���Դϴ�.");
		}
	}

}
