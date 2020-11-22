package com.thr;

public class Mainthr {
	
	
		public static void main(String args[]) 
		  {
			ThrowableEx tex=new ThrowableEx();
			System.out.println(tex.exists("Example4.java"));
			System.out.println(ThrowableEx.isInt("muss"));
			System.out.println(tex.isDouble("42"));
			
		  }
		     
	}
