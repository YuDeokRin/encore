package com.test;

/**
 * @author Deok
 *	main args�� �̿��ؼ� ����� �Է¹���.
 * 	111ABC		222DEF ����� ���� �Է¹޾� ù���ڸ� ���ڷ� ��ȯ�ؼ� ���� ���غ��� .
 */
public class ArrayTest01 {
	public static void main(String[] args) {
//		String res = args[0]; 	//111ABC
//		String res01 = args[1]; //222DEF
		
		
		//Run As -> Runcongiurations ->  argument -> variables -> String format
		String res = args[0]; //111ABC
		String res01 = args[1]; //222DEF
		
		
		char ch = args[0].charAt(0);  
		System.out.println(ch);
		char ch02 = args[1].charAt(0);
		System.out.println(ch02);
		
		int hap = ch + ch02; // �ƽ�Ű�ڵ尪 :  ch : 1(49) + ch02(50)  = 99 ���´�.
		System.out.println(hap);
		
		int sum = Character.digit(ch, 10)  + Character.digit(ch02, 10);		//Character.digit : ������ ������� ���� ch�� ���ڰ��� ��ȯ�Ѵ�. 
		System.out.println(sum);
		

	}
}
