package com.test;
import com.mycom.*;

/**
 * @author Deok
 *  �迭�� ����
 *  -�ڹٿ��� �����ϴ� �޼��� 
 */
public class Array_Copy {
	public static void Prn() {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
                "Marocchino", "Ristretto" };
    
            String[] copyTo = new String[7]; // 0~ 6
            System.arraycopy(copyFrom,   2,       copyTo, 0, 7); // �ڹٿ��� end�� -1,   7-1= 6    arraycopy : 
            /*						     --
             * 						      ����(index)
             * public static void arraycopy(Object src, int srcPos,  Object dest, int destPos,int length);
             *								----------------------	 - ------------------------------------
             *										����								�纻 
   			 */
            for (String coffee : copyTo) {
                System.out.print(coffee + " ");           
            }
		
		
	
	}
	
	public static void Prn02() {
		String[] copyFrom = {
	            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
	            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
	            "Marocchino", "Ristretto" };
	        // static <T> T[] copyOfRange(T[] original, int from, int to)
	        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);        
	        for (String coffee : copyTo) {
	            System.out.print(coffee + " ");           
	        }            	
	}
	
	public static void Prn03() {
		Address []  ar_address = {new Address("111","111","111"),
				new Address("222","22","111"),
				new Address("333","33","111"),
				new Address("444","44","111")};  //�ʱ� ũ�Ⱑ 4�� ������ �� ����.
		
		Address[] copyTo = java.util.Arrays.copyOfRange(ar_address, 1, 2);
		for(Address a : copyTo) {
			System.out.println(a);
		}
		
		System.out.println(copyTo.length);
		
	}
	
	
	
	public static void main(String[] args) {
		Prn();
		System.out.println();
	//	Prn02();
	//	System.out.println();
		
	//	Prn03();
	}
}
