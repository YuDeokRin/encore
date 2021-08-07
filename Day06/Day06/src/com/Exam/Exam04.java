package com.Exam;

/**
 * exam04) exam03의 출력 포맷에서  X형태의 값의 합을 각각 구하고  
 * 			두 개의 합을 출력 한다.
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
		System.out.println("왼쪽 대각선 합"+ sum1);
		System.out.println("오른쪽 대각선 합" + sum2);
		System.out.println("두 대각선의 합"+ hap);
	}	
	
	
	
	public static void main(String[] args) {
		Exam();
	}

}
