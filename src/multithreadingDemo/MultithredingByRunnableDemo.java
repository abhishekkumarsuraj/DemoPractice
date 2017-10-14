package multithreadingDemo;

public class MultithredingByRunnableDemo {

	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
        t.setPriority(10);
        System.out.println("I am Main Method .");
	}

}
  class MyRunnable implements Runnable
  {
	  public void run()
	  {
		  System.out.println("I am RUN method from Runnable .");
	  }
  }