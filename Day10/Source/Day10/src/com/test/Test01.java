package com.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author Deok
 * 10:35 ~ Interface ����
 */
public class Test01 extends Frame implements WindowListener, ActionListener,MouseMotionListener{
	Button btok;
	public Test01() {
		super("ù ��° ������");
		btok = new Button("click ");
	}
	
	public void go() {
		//addWindowListener(WindowListener l)
		addWindowListener(this); //this Test01 ����Ų��
		add(btok);
		//Button add event
		btok.addActionListener(this); // this => Test01
		btok.addMouseMotionListener(this);
		
		setSize(new Dimension(400, 400));
		setFont(new Font("�ü�", Font.BOLD,40));
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new Test01().go();;
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated"+ e.toString());		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");	
	}
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");	
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");	
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");	
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��ư Ŭ��");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		// TODO Auto-generated method stub
		System.out.println("X = " + me.getX() + ", Y =" + me.getY());
	}

}
