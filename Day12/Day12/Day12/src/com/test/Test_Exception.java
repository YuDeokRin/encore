package com.test;

/**
 * @author Deok
 * checked Exception �� unchecked Exception ����
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
//			System.out.printf("%3c", '��');
//		}
//		
//	}

	
	
///////////////////////unchecked Exception ����
	public static void main(String[] args) {
		int i = 0;
		int su = 10;
		int res = 0;
		try {
			res = su/i;
			
		}catch(ArithmeticException ae) //ArithmeticException ae = new ArithmeticException();
									   //���� ������ �ִ� Exception :ArithmeticException
		{
			System.out.println(ae);  //1.����
			i = 2 ;
			 res = su/i;    
		}catch(RuntimeException re) {  //�� ������ �ִ� Exception : RuntimeException
			System.out.println(re); //ó��  
		}catch(Exception e) { // �״����� �ִ� Exception : Exception
			System.out.println(e); // ó�� 
		}finally { //�ݵ�� ������ ������ finally�� �ִ´�.  
			System.out.println("db,file,object close..."); //2. ����
		} 
		
		System.out.printf("%5d / %5d  = %5d \n", su, i , res);  //java.lang.ArithmeticException: / by zero
				//3. ���
	}
	
}
