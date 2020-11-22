package com.thr;
import java.io.*;

public class ThrowableEx {
	public boolean isDouble(String value)
	   {
		    try {
		      Double  j=Double.parseDouble(value);
		    }
		    catch (NumberFormatException e)
		    {
		        return false;
		    }
		    return true;
	    } 
		
	   public static boolean isInt(String a)
	   {
		   try {
		        int c=Integer.parseInt(a);
		       int i=c/10;
		    } 
		    catch (NumberFormatException ne)
		    {
		        return false;
		    } 
		   return true;
	   }
	   public boolean exists(String b)
	   {
		   try {
		       
		      File f=new File(b);
		        
		    } 
		    catch (Exception e)
		    {
		        return false;
		    } 
		   return true;
	   }

}