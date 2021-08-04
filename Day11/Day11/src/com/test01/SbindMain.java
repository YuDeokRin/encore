package com.test01;
/**
 * @author Deok
 * 정적바인딩
 */
public class SbindMain {
	public static void main(String[] args) {
		int no = 1 ;
		
		switch (no) {
		case 1 : 
			Cat c1 = new Cat();
			c1.Start();
			c1.Stop();
			break;
		
		case 2 :
			Duck d1 = new Duck();
			d1.Start();
			d1.Stop();
			break;
		case 3 :
			Puppy p1 = new Puppy();
			p1.Start();
			p1.Stop();
			break;
		
		}
		
	}

}
