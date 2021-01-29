package multithreading;

class ChildThread2 implements Runnable
{
	public void run()
	{
		System.out.println("Current Thread name: " + Thread.currentThread().getName());
		for(int i=0;i<=5;i++)
		{
			System.out.println("Child: "+i);
			try
			{
			Thread.sleep(500); // use to pause the program as per time given by the programmer
			}
			
			catch(InterruptedException e)
			{
				
			}
		}
	}
	
	public ChildThread2() 
	{
		Thread d=new Thread(this,"Child");
		d.start();
	
	}
}

public class RunnableDemo {
	public static void main(String[] args)
	{
		//Runnable r=new ChildThread2();
		ChildThread2 c=new ChildThread2();
		//c.start(); // not possible because Runnable class doesn't have start() , it present in Thread class 
		//Thread d=new Thread(c,"Child");
	    //d.start();
	}

}
