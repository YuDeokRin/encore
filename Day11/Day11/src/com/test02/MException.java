package com.test02;

public class MException {

	   public static void main(String[] args) {
	      int jumsu = -90;
	      try {
	         if (jumsu < 0) {
	            throw new MyException();
	         }
	      } catch (MyException me) {
	         System.out.println(me.toString());
	         System.out.println(me.getMessage());
	         me.printStackTrace();
	      } catch(Exception e) {
	         System.out.println(e);
	      }
	   }
	}