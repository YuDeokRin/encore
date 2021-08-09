package com.test;
import com.mycom.*;

/**
 * @author Deok
 *  배열을 복사
 *  -자바에서 제공하는 메서드 
 */
public class Array_Copy {
	public static void Prn() {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
                "Marocchino", "Ristretto" };
    
            String[] copyTo = new String[7]; // 0~ 6
            System.arraycopy(copyFrom,   2,       copyTo, 0, 7); // 자바에서 end는 -1,   7-1= 6    arraycopy : 
            /*						     --
             * 						      시작(index)
             * public static void arraycopy(Object src, int srcPos,  Object dest, int destPos,int length);
             *								----------------------	 - ------------------------------------
             *										원본								사본 
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
				new Address("444","44","111")};  //초기 크기가 4를 변경할 수 없다.
		
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
