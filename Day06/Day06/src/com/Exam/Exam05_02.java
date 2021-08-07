package com.Exam;

public class Exam05_02 {
	public static void Exam05()
	{
		System.out.println("Exam 05¹ø");
		char arr[][] = new char[10][10];
		for(int i=0; i<10;i++)
			for(int j=0; j<10;j++)
				arr[i][j]=32;
		for(int i=0; i<10;i++)
		{
			for(int j=0;j<10;j++)
			{	
				if(i==0||j==0||i==4||i==9)
					arr[i][j]='*';
				System.out.printf("%2c",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Exam05();
	}
}