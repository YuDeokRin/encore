package com.test03;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ObjectCalculatorClinet {

	public static void main(String[] args) {
		Socket socket = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		int num01 = 0;
		int num02 = 0;
		String op = null;
		try {
			socket = new Socket("localhost", 8888);

			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());

			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Input num01 : ");
				num01 = sc.nextInt();
				System.out.println("\n Input num02 : ");
				num02 = sc.nextInt();

				System.out.println("\n Input op:+, -, *, / �� �ϳ��� �Է� ");
				op = sc.next();

				SendData sd = new SendData(num01, num02, op);
				oos.writeObject(sd);
				oos.flush();

				String res = (String) ois.readObject();
				System.out.println("������ :" + res);
				System.out.println("����Ҳ���? Y/N");
				String message = sc.next();
				if (message.equals("no"))
					break;
				System.out.println("�ٽ� ����ҰԿ� ");

			}
		} catch (Exception e) {

		} // try
	}// main

}// class
