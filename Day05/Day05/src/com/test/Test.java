package com.test;
import static com.mytest.MyCalc.*;


public class Test {

	public static void Switch_test01() {
		  int month = 3;
	        String monthString;
	        switch (month) {
	            case 1:  
	            	monthString = "January";
	            	System.out.println(monthString);
	            	break;
	            case 3:  
	            	monthString = "March";
	            	System.out.println(monthString);
	            	break;

	            case 5:  
	            	monthString = "May";
	            	System.out.println(monthString);
	            	break;
	            case 2:  
	            	monthString = "February";
	            	System.out.println(monthString);
	            	break;
	            case 4:  
	            	monthString = "April";
	            	System.out.println(monthString);
	            	break;
	            case 6:  
	            	monthString = "June";
	            	System.out.println(monthString);
	            	break;
	            default:
	            	monthString = "Invalid month";
	            	System.out.println(monthString);
	                     break;
	        }

	}

	public static void Switch_test02() {
		int month = 4;
        String monthString;
        switch (month) {
            case 1:  
            case 3:  
            case 5:  
            	monthString = "Ȧ��";
            	System.out.println(monthString);
            	break;
            case 2:  
            case 4:  
            case 6:  
            	monthString = "¦��";
            	System.out.println(monthString);
            	break;
            default:
            	monthString = "�̵����� �ƴϾ� ~~";
            	System.out.println(monthString);
                     break;
        }
	}
	
	public static void Switch_test03() {
		// ������ 1�̸� ����, 2�̸� ����, 3�̸� ���ϱ� ,4 �̸� �����⸦ ���ϴ� �޼ҵ带 ȣ������
		int su = 4;		int hap = 0;	int sub = 0;	int mul = 0;	
		int a = 200;	int b = 100;	int div = 0;
		
		switch(su) {
		case 1:	
			hap = getHap(a, b);
			System.out.printf("%d + %d = %d \n", a, b, hap );
		break;
	
		case 2: 
			sub = getSub(a, b);
			System.out.printf("%d - %d = %d \n", a, b, sub);
			break;
		
		case 3: 
			mul = getMul(a, b);
			System.out.printf("%d * %d = %d \n", a, b, mul);
			break;
		case 4: 
			div = getDiv(a, b);
			System.out.printf("%d / %d = %d \n", a, b, div);
			break;
		default :
			System.out.println("����");
//			break;  �������̱⶧���� break�� ���ص��ȴ�.
		}
	}
	public static void main(String[] args) {
		
		Switch_test03();
		
	}

}
