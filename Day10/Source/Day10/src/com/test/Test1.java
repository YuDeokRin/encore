package com.test;

import java.awt.*;

/**
 * @author Deok
 * 10:35 ~ Interface ����
 */
public class Test1 extends Frame{
	public Test1() {
		super("ù ��° ������");
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
//		System.out.println("Panel�� Layout :"+p.getLayout());
		
		setSize(new Dimension(400, 400));
		setFont(new Font("�ü�", Font.BOLD,40));
		setVisible(true);
	}

	
	public static void main(String[] args) {
	Test1 tm = new Test1();
	tm.go();
	System.out.println(tm.getLayout());

	}

}
