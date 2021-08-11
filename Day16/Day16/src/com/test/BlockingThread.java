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
				System.out.println("키보드로부터 입력된 문자 : " + msg);
				System.out.println("종료하시려면 ctrl + c 를 누르십시오 : " + getState());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료 ");
	}
	public static void main(String[] args) {
		BlockingThread bt =new BlockingThread();
		bt.start();
	}
}
