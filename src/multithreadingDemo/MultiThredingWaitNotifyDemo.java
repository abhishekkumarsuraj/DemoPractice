package multithreadingDemo;

public class MultiThredingWaitNotifyDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b=new ThreadB();
		b.start();
		synchronized(b)
		{
			System.out.println("Main Thread Calling Wait()."); //(1..)
			b.wait(1000);
			System.out.println("Main Thread Got Notification .");  //(4..)
			System.out.println(b.total); //(5..)
		}

	}

}
class ThreadB extends Thread 
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child Thread starts Calculation."); //(2..)
			for(int i=0;i<=100;i++)
			{
				
				total=total+i;
			}
			System.out.println("Child thread is trying to Notify Main Thread That Updation Completed.");  //(3..)
			this.notify();
		}
	}
	}