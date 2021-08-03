package com.test;

import java.awt.Frame;
import java.awt.*;

/**
 * @author Deok
 * 10:35 ~ Interface ����
 */


public class Test {

	public static void main(String[] args) {
	//1. ���� ����ϰ� �ִ� ��ü ������ gui ȯ�� ���� ge��� ��ü�� ���Ϲ޴´�.
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	System.out.println(ge);
	
	//2. �����ȯ�漳�� ������ gs�� ���Ϲ޴´�. 
	GraphicsDevice[] gs = ge.getScreenDevices();
	
	//3. ������ ����̽� ȯ�� �������� res�� ����Ѵ�.
	System.out.println();
	for(GraphicsDevice res : gs) {
		/*
		System.out.println("======================================");
		System.out.println("Ȯ����:"+res + ":"
		+ res.getDisplayMode().getWidth() + ","
		+ res.getDisplayMode().getHeight());
	
		System.out.println("���� ���� �⺻ ����� �� : "
		+ res.getDefaultConfiguration().getBounds().width + "," 
		+ res.getDefaultConfiguration().getBounds().height);
		System.out.println("==================================================");
		*/
		
		
		GraphicsConfiguration gc = res.getDefaultConfiguration();
		 Frame f = new Frame(gc);
	      Rectangle bounds = gc.getBounds();
	      f.setLocation(10 + bounds.x, 10 + bounds.y);
	      f.setSize(bounds.width, bounds.height);
	      f.setVisible(true);
	}
	
	
		/* Frame f = new Frame(GraphicsConfiguration gc);
	      Rectangle bounds = gc.getBounds();
	      f.setLocation(10 + bounds.x, 10 + bounds.y);
	    */
	}

}
