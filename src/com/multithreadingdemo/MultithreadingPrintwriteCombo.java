package com.multithreadingdemo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class  GetPrintwriter{
	static PrintWriter pw;
	
	public void getwriter() throws IOException {
		pw = new PrintWriter(new FileWriter("output.txt"));
     
	}
}



public class MultithreadingPrintwriteCombo {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		Mythread.mt=Thread.currentThread();
		Mythread t=new Mythread();
		t.start();
		
		
		for(int i=0;i<=10;i++)
		{
			GetPrintwriter.pw.println("That's Call.. Generous .");
		}
		
		GetPrintwriter.pw.flush();
		GetPrintwriter.pw.close();
		
	}
	
}



   class Mythread extends Thread
{
	   
	   static Thread mt;
	   
	   
	   public void run()
	   {
		   for(int i=0;i<=10;i++)
		{
			GetPrintwriter.pw.println("I Love Programming .");	
		}
		GetPrintwriter.pw.flush();
		   
	
	}
}