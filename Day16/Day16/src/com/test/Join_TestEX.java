package com.test;

class My_Test02 extends Thread{
	public My_Test02(String name) { 
		super(name);
		}
	public void run() {
		for(int i =0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println((i+1) + "�� ��� \t:" + getName() );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//try end
		}//for end
	}//run end
}//class end

public class Join_TestEX {
	public static void main(String[] args) {
		My_Test02 tt = new My_Test02("�߿���");	tt.start();
		My_Test02 tt02 = new My_Test02("�۸���");  tt02.start();
		System.out.println("ThreadTest Ŭ���� ó���� �����߽��ϴ�.");

		try {
			tt.join(); // tt.join(3000); //tt02.join() 
			tt02.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println("My_Test Ŭ������ ó���� ����Ǿ����ϴ�.");
		System.out.println("Main Ŭ���� ó���� �����մϴ�.");
		for(int i = 0; i < 5 ; i++) {
			System.out.println((i+1)+ "��°�� ó���Դϴ�.");
		}
	}

}
