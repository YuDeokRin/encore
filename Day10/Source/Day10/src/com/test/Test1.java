package com.test;

import java.awt.*;

/**
 * @author Deok
 * 10:35 ~ Interface 연습
 */
public class Test1 extends Frame{
	public Test1() {
		super("첫 번째 프레임");
	}
	
	public void go() {
//		add(new Button("North"), BorderLayout.NORTH);
//		add(new Button("South"), BorderLayout.SOUTH);
//		add(new Button("East"), BorderLayout.EAST);
//		add(new Button("West"), BorderLayout.WEST);
//		
//		Panel p = new Panel();
//		p.setLayout(new BorderLayout()); // setLayout(LayoutManager >= * )
//		p.add(new Button("Center"), BorderLayout.NORTH);
//		p.add(new Button("Center01"));
//
//		add(p, BorderLayout.CENTER);
//		
//		
//		System.out.println("Panel의 Layout :"+p.getLayout());
		
		setSize(new Dimension(400, 400));
		setFont(new Font("궁서", Font.BOLD,40));
		setVisible(true);
	}

	
	public static void main(String[] args) {
	Test1 tm = new Test1();
	tm.go();
	System.out.println(tm.getLayout());

	}

}
