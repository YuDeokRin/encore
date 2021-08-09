package com.test;

/**
 * @author Deok
 * �迭�� ���õ� Ŭ������ ���캸��.
 * String = char[]
 * main args�� �̿��ؼ� ����� �Է¹���.
 * 		111ABC		222DEF ����� ���� �Է¹޾� ù���ڸ� ���ڷ� ��ȯ�ؼ� ���� ���غ��� .
 * 
 * String Ŭ���� 
 */
public class ArrayTest {
public static void main(String[] args) {
	
		String str = "adcd"; // <- a[0] , b[1], c[2], d[3] ; 
		System.out.println("case 1: charAt()�� �̿��� ������"); // charAt() : �� ���ھ� �����ؼ� �������ִ� ��
		System.out.println(str.charAt(1));
		System.out.println(str);
		for(int i = 0 ; i< str.length(); i++){
			System.out.printf("%3c", str.charAt(i));
		}
		
		System.out.println("\n\n case2 : char[] toCharArray()�� �̿��� ������ "); //toCharArray() : String�� char�迭�� �ٲ㼭 �������ִ� ��
		char[] res = str.toCharArray(); // char[] res �迭 ���� -> str.toCharArray();  String str�� char[] �迭�� �ٲ㼭 �ִ´�.
		for(char r : res) 				// char r=0����   res����  System.out.printf("%3c", r); 
		System.out.printf("%3c", r);
		
		System.out.println("\n\n case3  : byte[] getBytes()�� �̿��� ������ "); // getBytes() : String�� ��ü�� ����Ʈ ������ ���ڵ� �ϰ� ����� ������Ʈ �迭�� ���� 
		byte[] res01 = str.getBytes();
		System.out.println(res01);
		for(byte r0 : res01)
		System.out.printf("%3c", r0);
	}

}
	

