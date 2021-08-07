package com.test01;

//10, 20, 30, 40, 50 값을 관리하는 배열을 선언하고 호출하자
public class Test {
	public static void ArrayTest() {
		System.out.println("case 1 : datatype 변수명 [] = {요소,,,,}; ");
		int  ar[] = {10,20,30,40,50};
		
		System.out.println(ar);  // &ar[0] : [I@15db9742
		System.out.println("요소의 크기 : " + ar.length);
		for(int i = 0; i<ar.length; i++) {

		System.out.println(ar[i]);  //세로로 출력
//		System.out.printf("%5d ", ar[i]);  //가로로 출력
		}
		
		ar[4] = 200;
		
		System.out.println(ar[4]);
	}
	
	public static void ArrayTest01() {
		System.out.println("case 2 : datatype []변수명 = {요소,,,,};  ");
		int []ar = {10,20,30,40,50};
		
		System.out.println(ar);  // &ar[0] : [I@15db9742
		System.out.println("요소의 크기 : " + ar.length);
		ArrayPrn(ar);

	
	}
	public static void ArrayTest02() {
		System.out.println("case 3 : datatype [] 변수명 = new datatype[] {요소,,,,,};");
		int [] ar = new int[] {10, 20, 30, 40, 50};
		ArrayPrn(ar); 
		
	}
	public static void ArrayTest03() {
		System.out.println("case 4 : datatype [] 변수명 = new datatype[요소의 크기 ];");
		int [] ar = new int[5]; // 기본값으로 채운다. 
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		
		ArrayPrn(ar); 
		
	}
	
	public static void ArrayPrn(int[] res) { // res = ar
		for(int i = 0; i< res.length; i++) {
			System.out.printf("%5d", res[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayTest03();
	}

}
