package com.subh.thread;


class Myresource 
{
	
	
	public void getthread()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+""+Thread.currentThread().getName());
		}
	}
//	 synchronized void waitforsignale()  throws InterruptedException
//	{
//		 System.out.println(Thread.currentThread().getName() +"is waiting ");
//		  wait();
//	     System.out.println(Thread.currentThread().getName() +"is resumed ");
//		  
//	}
//	 
//	 synchronized void sendSignale()
//	 {
//		 System.out.println(Thread.currentThread().getName() +"signal sent  ");
//		 notify();
	 }
	

public class MyThread {

	public static void main(String[] args) {
		 Myresource myresource = new Myresource();
		 
		 Runnable rs = ()->
		 {for(int i=1;i<=5;i++)
			{
				System.out.println(i+""+Thread.currentThread().getName());
			}
		 };
		 rs.run();
//		  Thread t = new Thread(()->   
//		  {
//			  try {
//				  myresource.waitforsignale();
//			  }
//			  catch (Exception e) {
//				Thread.currentThread().interrupt();
//			}
//			  
//		  }
		 
		 Thread t = new Thread()  
		  {
			 public void run()
			 {
				 System.out.println("hello world ");
			 }
			  
		  };
		 t.run();
//          
//		  Thread t2 = new Thread(myresource::sendSignale);
//		  t.start();
//		  t2.start();
}

}
