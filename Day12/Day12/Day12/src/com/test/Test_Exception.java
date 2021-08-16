package com.test;

/**
 * @author Deok
 * checked Exception 과 unchecked Exception 예제
 */

////////////checked Exception
public class Test_Exception {

//	public static void main(String[] args) {
//		
//		
//		for(int i = 0; i <= 20 ; i++ ) { //checked Exception cf.RuntimeException -> unchecked Exception
//			try {
//				Thread.sleep(500); 	//checked Exception
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.printf("%3c", '♠');
//		}
//		
//	}

	
	
///////////////////////unchecked Exception 예제
	public static void main(String[] args) {
		int i = 0;
		int su = 10;
		int res = 0;
		try {
			res = su/i;
			
		}catch(ArithmeticException ae) //ArithmeticException ae = new ArithmeticException();
									   //가장 하위에 있는 Exception :ArithmeticException
		{
			System.out.println(ae);  //1.실행
			i = 2 ;
			 res = su/i;    
		}catch(RuntimeException re) {  //그 다음에 있는 Exception : RuntimeException
			System.out.println(re); //처리  
		}catch(Exception e) { // 그다음에 있는 Exception : Exception
			System.out.println(e); // 처리 
		}finally { //반드시 수행할 문장을 finally에 넣는다.  
			System.out.println("db,file,object close..."); //2. 실행
		} 
		
		System.out.printf("%5d / %5d  = %5d \n", su, i , res);  //java.lang.ArithmeticException: / by zero
				//3. 출력
	}
	
}
