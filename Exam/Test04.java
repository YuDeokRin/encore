package com.test02;

public class Test04 {

	public static void op() {
		int a = 10 ;
		System.out.println(a++); // 10 (11)
		System.out.println(a); // 11
		System.out.println(++a); // 12
	}
	public static void op02() {
		int a = 10 ;
		System.out.println(a--); //10(9)
		System.out.println(a); //9
		System.out.println(--a); //8
		System.out.println(a);
	}
	
	
	public static void op03() {
		//지역변수는 반드시 초기화를 하자 !!
		int a = 10 ; 
		int b = 5 ;
		int res = 0;
		res = a++ + b++ + --b + --b + ++a;
		System.out.printf("a = %5d  b= %5d res = %5d \n", a,b,res);
		 
	}
	
	public static void op04() {
        int value1 = 1;
        int value2 = 2;
        //if((++value1 == 1) && (value2++ == 2)) // false 	
        //    System.out.println("value2");
        
        if((value1 == 1) || (++value2 == 1)) //(value1 == 1)의 결과가 true이면 ||연산자는 (++value2==1) 뒤의 식을 수행하지 않고 true를 리턴 
        	
            System.out.println(value2);
		
	}
	
	public static void op05() {
		
	}
	
	public static void main(String[] args) {
/*
		int a = 10;
		int b = 2;
		System.out.println(a& b);
		System.out.println(a | b);
*/	

		op04();
		
		
	}

}
