package com.test;

public class ThreadEx1 {
	public static void main(String[] args) {

		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r); //������ Thread(Runnable target)
		//����  7,8���� �� �ٷ� ǥ���ϸ�, Thread t2 = new Thread(new ThreadEx1_2());
		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread{ 	// 1.ThreadŬ������ ����ؼ� ������ ����
	public void run() { //Thread�� ������ �۾� 
		for(int i = 0; i < 5; i++) {
			System.out.println(getName()); // ������ Thread�� getName()�� ȣ��
//			System.out.println(0);
		}
	}
}

class ThreadEx1_2 implements Runnable{	//2.Runnable �������̽��� �����ؼ� �����带 ���� 
	public void run() {//Thread�� ������ �۾� 
		for(int i = 0; i < 5; i++) {
			//Thread.currentThread() <- ���� ���� ���� Thread�� ��ȯ�Ѵ�.
			//System.out.print(1);
			System.out.println(Thread.currentThread().getName());
		}
	}
}
