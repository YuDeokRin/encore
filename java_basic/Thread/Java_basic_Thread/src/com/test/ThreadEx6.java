package com.test;

import javax.swing.JOptionPane;

/**
 * @author Deok
 * ���� 6�� 
 * �ϳ��� ������� ������� �Է��� �޴� �۾��� ȭ�鿡 ���ڸ� ����ϴ� �۾��� ó���ϱ� ������ ����ڰ� 
 * �Է��� ��ġ�� �������� ȭ�鿡 ���ڰ� ��µ��� �ʴٰ� ����ڰ� �Է���  ��ġ�� ������ ȭ�鿡 ���ڰ� ���
 * 
 */
public class ThreadEx6 {

	public static void main(String[] args) throws Exception{
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		
		for(int i = 10; i >0 ; i--) {
			System.out.println(i);
		try {
			Thread.sleep(1000); //1�ʰ� �ð��� �����Ѵ�.
		}catch (Exception e) {}
		}
	}
}