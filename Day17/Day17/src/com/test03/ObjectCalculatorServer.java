package com.test03;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

public class ObjectCalculatorServer {
	public static void main(String[] args) {
		Socket socket  = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("클라이언트 대기중 ");
			socket = serverSocket.accept();
			
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			Object obj = null;
			
			//클라이언트 두개의 값과 연산자를 선택해서 서버에게 전달 하면 서버는 연산해서 리턴해준다.
			while((obj = ois.readObject()) != null) {
				SendData data = (SendData)obj;
				int num01 = data.getNum1();
				int num02 = data.getNum2();
				String op = data.getOperator();
				if(op.equals("+")) {
					oos.writeObject(num01 + "+" + num02 + "=" + (num01+num02));
				}else if(op.equals("-")) {
					oos.writeObject(num01 + "-" + num02 + "=" + (num01-num02));
				}else if(op.equals("*")) {
					oos.writeObject(num01 + "*" + num02 + "=" + (num01*num02));
				}else if(op.equals("/")) {
					oos.writeObject(num01 + "/" + num02 + "=" + (num01/num02));
				}else {
					System.out.println("없어 ");
				}
				oos.flush();
				System.out.println("클라이언트에게 결과값을 전송했어 ");
				
			}//while end 

		}catch (Exception e) {
			
		}finally {
			try {
				ois.close();
				oos.close();
				socket.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}//finally
	}//main
}//class
