package com.test;

import java.awt.*;
import java.awt.event.*;

/**
 * @author Deok
 * 10:35 ~ Interface ����
 */
public class Test04 extends Frame{
	Button btok;
	
	public Test04() {
		super("ù ��° ������");
		btok = new Button("Click");
	}
	
	public void go() {
		add(btok);
		btok.addActionListener(new MyEvent());
		addWindowListener(new MyEvent()); //MyEvent()ĭ���� ����  WindowListener �ڸ��̴�. 
		setSize(new Dimension(400, 400));
		setFont(new Font("�ü�", Font.BOLD,40));
		setVisible(true);
	}
	
	
	class MyEvent extends WindowAdapter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Ŭ������" + e.getSource()); //e  -> toString 
			Button res = (Button)e.getSource();
			System.out.println(res);
			System.out.println(res.getX() + ":" + res.getY());
			System.out.println(e.getID());
			System.out.println(e.paramString());
			
		}
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		
	}
	
	public static void main(String[] args) {
	new Test04().go();


	}

}
