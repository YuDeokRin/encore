package com.test01;

/**
 * @author Deok
 *�������ε�
 */
public class SbindMain2 {
	public static void main(String[] args) {
		int no = 2 ;
		Base b1 = null;
		switch (no) {
		case 1 : 
			b1 = new Cat();
			break;
		case 2 :
			b1 = new Duck();
			break;
		case 3 :
			b1 = new Puppy();
			break;
		
		}
		b1.Start();
		b1.Stop();
	}

}
