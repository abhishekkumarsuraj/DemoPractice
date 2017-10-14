package multithreadingDemo;

import java.io.IOException;
import java.io.PrintWriter;

public class MultithreadingByExtendingTreadClass {
	static PrintWriter pw;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		pw = new PrintWriter("output.txt");	 
		MyThread.mt=Thread.currentThread();
		MyThread t=new MyThread();
		t.start();
		
		for(int i=0;i<=10;i++)
		{
			pw.println("That's Call.. Generous .");
		}
		pw.flush();
	}
	
}
   class MyThread extends Thread
{
	   
	   static Thread mt;
	   MultithreadingByExtendingTreadClass out1=new MultithreadingByExtendingTreadClass();
	   public void run() 
	   {
		for(int i=0;i<=10;i++)
		{
			out1.pw.println("I Love Programming .");
			try {
				mt.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			out1.pw.flush();
		}
	   }
	
	}