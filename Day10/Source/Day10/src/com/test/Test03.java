package com.test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.net.ssl.SSLEngineResult.Status;

/**
 * @author Deok
 * 10:35 ~ Interface 연습
 */
public class Test03 extends Frame{
	public Test03() {
		super("첫 번째 프레임");
	}
	
	
	public void go() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
		});
		setSize(new Dimension(400, 400));
		setFont(new Font("궁서", Font.BOLD,40));
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new Test03().go();

	}

}
