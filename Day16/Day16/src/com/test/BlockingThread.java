package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlockingThread extends Thread {
	public void run() {
		String msg = null;
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(in);
			while((msg= input.readLine()) != null){
				System.out.println("Ű����κ��� �Էµ� ���� : " + msg);
				System.out.println("�����Ͻ÷��� ctrl + c �� �����ʽÿ� : " + getState());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ");
	}
	public static void main(String[] args) {
		BlockingThread bt =new BlockingThread();
		bt.start();
	}
}
