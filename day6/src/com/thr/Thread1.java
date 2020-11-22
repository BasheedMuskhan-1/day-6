package com.thr;
//import java.io.*;


public class Thread1 extends Thread 
{
	public void run()
	{
	
	
	for(int i=50;i<60;i++)
	   {
		   System.out.println("thread1:"+i);
		   
	   }
}
}
 class Thread2 extends Thread{
	 
 public void run()
 {
	 for(int i=70;i<90;i++)
	   {
		   System.out.println("thread2:"+i);
		   try {
			Thread2.sleep(4000);
		} 
		   catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

 }
 }