package com.test;

import java.awt.Frame;
import java.awt.*;

/**
 * @author Deok
 * 10:35 ~ Interface 연습
 */


public class Test {

	public static void main(String[] args) {
	//1. 현재 사용하고 있는 전체 영역의 gui 환경 값을 ge라는 객체로 리턴받는다.
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	System.out.println(ge);
	
	//2. 모니터환경설정 값들을 gs로 리턴받는다. 
	GraphicsDevice[] gs = ge.getScreenDevices();
	
	//3. 각각의 디바이스 환경 설정값을 res로 출력한다.
	System.out.println();
	for(GraphicsDevice res : gs) {
		/*
		System.out.println("======================================");
		System.out.println("확장형:"+res + ":"
		+ res.getDisplayMode().getWidth() + ","
		+ res.getDisplayMode().getHeight());
	
		System.out.println("원본 각각 기본 모니터 값 : "
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
