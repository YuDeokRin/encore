package com.test01;

public class Test02 {
	public static void Ar2D() {
		int [][] ar = {{10,20,30},
						{40,50,60}};
		
		System.out.println(ar.length);  //
		System.out.println(ar[0].length); //
		System.out.println(ar[1].length); // 
		Prn(ar);
		System.out.println();
		Prn02(ar);
	}
	
	//동적
	public static void Ar2D_01() {
		int [][] ar = new int[][] {{10,20,30},
								{40,50,60}};
		
		System.out.println(ar.length);  //
		System.out.println(ar[0].length); //
		System.out.println(ar[1].length); // 
		Prn(ar);
		System.out.println();
		Prn02(ar);
	}
	//동적2
	public static void Ar2D_02() {
		int [][] ar = new int[3][];
		
		ar[0] = new int[] {10,20,30} ;
		ar[1] = new int[] {10,20};
		ar[2] = new int[5];
		
		System.out.println(ar.length);  //
		System.out.println(ar[0].length); //
		System.out.println(ar[1].length); // 
		Prn(ar);
		System.out.println();
		Prn02(ar);
	}
	
	public static void Prn(int [][]res) {
		System.out.println("case 1 : 다중 for");
		for(int i = 0; i<res.length; i++) {
			for(int j = 0; j < res[i].length ; j++) {
				System.out.printf("%5d", res[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void Prn02(int [][] res) {
		System.out.println("case 2 : 제너릭스 for");
		for(int [] r : res) { //res  = &res[0][0]
			for(int d: r) {
				System.out.printf("%5d", d);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Ar2D_02();
	}
}
