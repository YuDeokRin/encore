package com.test01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame extends Frame{
	public MyFrame() {
		super("MyFrame");
	}
	
	public void go() {
		addWindowListener(new MyEvent()); //MyEvent()칸에는 원래  WindowListener 자리이다. 
		setSize(new Dimension(400, 400));
		setFont(new Font("궁서", Font.BOLD,40));
		setVisible(true);
	}
	
	
	class MyEvent extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
	new MyFrame().go();


	}

}
