package com.test;

import java.util.Scanner;

/**
 * @author Deok
 * java.util.Scanner�� Ȱ���� ���� / ���Խ� ������ �������� ���ڿ� ��ö, �Է°� ���(���ϸ�) �Ѵ�.
 * 
 * public final class Scanner
 * extends Object
 * implements Iterator<String>, Closeable
 * 
 * Iterator<String> <- String�� ��Ҹ� �ݺ��ؼ� ���� 
 * 
 * Interface Iterator<E>   <- E��  ���(Element)
 * 
 */
public class Test_Scanner {

	public static void Prn() {
		   //Class Scanner -> Constructors����  -> Scanner(String source) 
			String input = "1 fish 2 fish red fish blue fish";
		   
		   //���Խ����� :  s = space , * = 0 or more,  + = 1 or more
		     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*"); 
		     System.out.println(s.nextInt()); 
		     System.out.println(s.nextInt()); 
		     System.out.println(s.next());	
		     System.out.println(s.next().toString());	//public String next()
		     s.close();
	}
	
	public static void Prn01() {
	     Scanner sc = new Scanner(System.in); //Scanner(InputStream source);
	     System.out.print("Input su :");
	     int i = sc.nextInt();
	     
	     System.out.print("Input su :");
	     int j = sc.nextInt(); 
	     System.out.println("i = "+ i );
	     System.out.println("j = "+ j );
	}
	
	public static void main(String[] args) {
		Prn01();
	}

}
