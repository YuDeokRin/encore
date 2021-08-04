package com.test02;

public class Test2{
	public static void Prn(String []args){
	//두수를 입력해서 합을 구하자.
	
	System.out.println(args.length);
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	System.out.printf("%5d + %5d = %5d", a,b,(a+b));	
	}
	
	// a.class -> JVM -> JVM ...Exception -> a.class catch 처리 한다. 
	public static void main(String[] args) {

		int a = 0;
		try {
//			a  = Integer.parseInt(args[0]);
			
		} catch (NumberFormatException ne) {
			//System.out.println("====>"+ ne);
			//System.out.println();
			//ne.printStackTrace();
			a= 90;
		}catch(IllegalArgumentException ia ) {
		
		}catch (RountimeException re ) {
		
		}catch(Exception e ) {
			
		}finally {
			System.out.println("반드시 처리해야 할 명령 datanase close, file closs등등");
		}
		
		System.out.println("a = "+ a); //10000000000 << 입력하면 오류 난다 .
		 
		//java.lang.NumberFormatException:
		//at java.lang.NumberFormatException.forInputString(Unknown Source)
	}
}
