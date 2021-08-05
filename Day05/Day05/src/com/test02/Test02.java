package com.test02;

public class Test02 {
	
	public static void for_test01() {
		//1~ 10까지 출력해 보자 
		for(int i = 1; i<=10; i++) {
			System.out.printf("%5d", i);
		}
	}
	public static void for_test02() {
		//1~ 10까지 출력해 보자 
		int i = 1;
		for(; i<=10;) {
			System.out.printf("%5d", i);
			i++;
		}		
	}
	public static void for_test03() {
	 //10 ~ 1 까지 출력해보자. i,j,k,l,m,n
		for(int i= 10; i >= 1; i-- ) {
		 System.out.printf("%5d",i);
		}
	}
	
	public static void for_test04() {
		// 1~ 100까지 출력 하되 5의 배수만 출력해 보자 for
		for(int i=1; i<=100; i++) {
			if(i%5 ==0) {
				System.out.println(i);
			}
		}
	}
	public static void for_test05(int start, int end ) {
		for(int i = start ; i <= end ; i ++) {
			System.out.printf("%5d", i);
		}
		System.out.println("\n=================================");
	}
	public static void for_test06() {
		
		for(int i=1; i<=100; i++) {
			if(i%10 ==0) {
				// 	return ; //현재 메소드를 종료   
				// continue; // 반복의 흐름을 진행 시킨다.
				break;  //반복 구문을 종료 
				
			}
			System.out.printf("%5d",i);
		}
		System.out.println(" ======>  for test06 end line ");
		System.out.println(" ======>  for test06 end line ");
		System.out.println(" ======>  for test06 end line ");
		
	}
	public static void main(String[] args) {
//		for_test04();
//		for_test05(1,10); // 1~10	start , end 
//		for_test05(1,100); // 1~100  start end
//		for_test05(10,20); // 10 ~ 20 start end
//		for_test05(40,100); // 40 ~ 100 start end
//		

		for_test02();
	}
}
