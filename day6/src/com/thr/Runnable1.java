package com.thr;

public class Runnable1 implements Runnable{
	
	public void run()
	{
	   for(int i=0;i<20;i++)
	   {
		   System.out.println("thread3:"+i);
		   try {
				Thread2.sleep(5000);
			} 
			   catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	}
	

}
 class Runnable2 implements Runnable{
	
	public void run()
	{
	   for(int i=21;i<40;i++)
	   {
		   System.out.println("thread4:"+i);
		   try {
				Thread2.sleep(6000);
			} 
			   catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	}
	

}