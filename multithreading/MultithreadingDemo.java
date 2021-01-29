package multithreading;

class ChildThread3 extends Thread
{
	public void run()
	{
		System.out.println("Child Thread: "+ currentThread().getName());
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
public class MultithreadingDemo 
{
	public static void main(String[] args)
	{
		ChildThread3 ct=new ChildThread3();
		ct.start();
		ChildThread3 ct1=new ChildThread3();
		ct1.start();
		ChildThread3 ct2=new ChildThread3();
		ct2.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Main thread: "+ i);
			try
			{
			Thread.sleep(500);
			}
			
			catch(InterruptedException e)
			{
				
			}
			
		}
	}
	

}
