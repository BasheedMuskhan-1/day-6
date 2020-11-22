package com.thr;
import java.util.Scanner;
public class ThrowableEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]= {9,8,7,6,5,4};
		int b=6;
		int c=0;
		Exception ex=new Exception();
		try
		{
			int d=b/c;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.toString());
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		try
		{
			System.out.println(8/2);
		}
		catch(ArithmeticException e)
		{
			ex.addSuppressed(new ArithmeticException());
			System.out.println(ex.getSuppressed());
		}
		
	}

}