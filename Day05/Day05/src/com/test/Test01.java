package com.test;

public class Test01 {

	public static void while_Test() {
//			System.out.println("�ݺ��� ��������.");
//			while(true) {
//				System.out.println("�ݺ�?");
//			}
//		
	}
	
	
	public static void main(String[] args) {
		while_Test02();
	}

	public static void while_Test01() {
		//���ڸ� �����ؼ� ��� �غ���. 1.2.3.4.5.
		
		int su = 1 ;
		
		while(true) {
			System.out.printf("%5d",su++); //1(2) 2(3)  2 >= 6	
			if(su >= 6 ) {
				break;
			}
		}
		
	}
	
	public static void while_Test02() {
		//1 ~ 5 ���� ���
		int su = 1;
		while(su <= 5) { // 1 >= 6 -> false
			System.out.printf("%5d", su++);
		}
	}
		
	public static void while_Test03() {
        int count = 1;
        int sum = 0 ;
        while (count < 11) { // 1<11, 2<11
            System.out.println("Count is: " + count); // 1
            sum = sum + count; //sum(1) = 0 + 1
            count++;//2
        }
        System.out.println("sum = "+ sum);
	}

	public static void while_Test04() {
        int count = 1;
        int sum = 0 ;
        while (count < 11) {
            if(count == 10 ) {
            	System.out.printf("%3d = ", count); 
            }else {
            	System.out.printf("%3d  + ", count); 
            }
            sum = sum + count; 
            count++;

        }
        System.out.printf("%3d", sum);
	}
	public static void while_Test05() {
		// 1 ~ 20���� ������ ����ϵ� ¦���� ����غ���. su % 2 == 0  , �� ������ �������  -> ������ö
 		int count = 1; int cnt = 0;
		

        while (count <= 20) {  // 1~ 20������ ����
        	if(count%2 ==0) { // ���࿡ 2�� ���� �������� 0�� ���ٸ� �������
        		System.out.printf("%3d ", count); 
        		cnt++;
        	}
            count++;
        }
    System.out.println("\n\n cnt = " + cnt);
	}
	
	
}
