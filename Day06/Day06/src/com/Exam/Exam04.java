package com.Exam;

/**
 * exam04) exam03�� ��� ���˿���  X������ ���� ���� ���� ���ϰ�  
 * 			�� ���� ���� ��� �Ѵ�.
 *
 */
public class Exam04 {
	public static void Exam() {
		int arr[][] = new int[5][5];
		int num = 25;
		
		for(int i = 0; i< 5; i++) {
			for(int j= 0; j < 5; j++) {
				arr[i][j] = num;
				num--;
			}
		
		}
		int sum1 =0; 
		int sum2 =0;
		for(int i = 0; i<5; i++ ) {
			for(int j = 0; j<5; j++) {
				System.out.print(arr[i][j]+ "\t");
				
				if(i == j ) {
					sum1 += arr[i][j];
				}
				if(i+j == 4) {
					sum2 +=arr[i][j];
				}
			}
			System.out.println();
		}
	
		int hap = sum1 + sum2 ;
		System.out.println("���� �밢�� ��"+ sum1);
		System.out.println("������ �밢�� ��" + sum2);
		System.out.println("�� �밢���� ��"+ hap);
	}	
	
	
	
	public static void main(String[] args) {
		Exam();
	}

}
