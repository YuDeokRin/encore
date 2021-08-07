package com.test;

public class Test03 {

	public static void Prn() {
		for(int i = 0; i<3; i++) {
			for(int j =0; j<3; j++) {
				System.out.println("abc");
			}
			System.out.println();
		}
		
	}
	
	
	public static void Prn01() {
		for(int i = 0; i<=10; i++) {
			for(int j =1; j<=10; j++) {
				if(j % 5== 0 ) {
					System.out.printf("%5c", 'ก็');
				}else {
					System.out.printf("%5d", j);
				}
			}
			System.out.println();
	}
}
	public static void main(String[] args) {
		Prn();
		
		
	}

}
