package multithreading;

class ChildThread extends Thread
{
	public void run()
	{
		System.out.println(currentThread());
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Child: "+i);
			try
			{
			Thread.sleep(100); // use to pause the program as per time given by the programmer
			}
			
			catch(InterruptedException e)
			{
				
			}
		}
	}
	
	ChildThread() 
	{
		super("Child_Thread"); // calling constructor of super class i.e. Thread class
		start(); // Start thread within a same class
	}
}
public class ThreadDemo {
	public static void main(String[] args) 
	{
		ChildThread c=new ChildThread();
		//c.start(); // start a thread by calling its run method
		//c.run(); // run as normal methods
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Main thread: "+ i);
			try
			{
			Thread.sleep(500); // use to pause the program as per time given by the programmer
			}
			
			catch(InterruptedException e)
			{
				
			}
			
		}
	}

}
