package com.test01;

//10, 20, 30, 40, 50 ���� �����ϴ� �迭�� �����ϰ� ȣ������
public class Test {
	public static void ArrayTest() {
		System.out.println("case 1 : datatype ������ [] = {���,,,,}; ");
		int  ar[] = {10,20,30,40,50};
		
		System.out.println(ar);  // &ar[0] : [I@15db9742
		System.out.println("����� ũ�� : " + ar.length);
		for(int i = 0; i<ar.length; i++) {

		System.out.println(ar[i]);  //���η� ���
//		System.out.printf("%5d ", ar[i]);  //���η� ���
		}
		
		ar[4] = 200;
		
		System.out.println(ar[4]);
	}
	
	public static void ArrayTest01() {
		System.out.println("case 2 : datatype []������ = {���,,,,};  ");
		int []ar = {10,20,30,40,50};
		
		System.out.println(ar);  // &ar[0] : [I@15db9742
		System.out.println("����� ũ�� : " + ar.length);
		ArrayPrn(ar);

	
	}
	public static void ArrayTest02() {
		System.out.println("case 3 : datatype [] ������ = new datatype[] {���,,,,,};");
		int [] ar = new int[] {10, 20, 30, 40, 50};
		ArrayPrn(ar); 
		
	}
	public static void ArrayTest03() {
		System.out.println("case 4 : datatype [] ������ = new datatype[����� ũ�� ];");
		int [] ar = new int[5]; // �⺻������ ä���. 
		
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
