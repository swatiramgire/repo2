package multithreading;

class ChildThread4 implements Runnable
{
	public void run()
	{
		System.out.println("Child Thread: "+ Thread.currentThread().getName());
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
//	ChildThread4()
//	{
//		Thread d=new Thread(this,"Child1");
//		d.start();
//		Thread d1=new Thread(this,"Child2");
//		d1.start();
//		Thread d2=new Thread(this,"Child3");
//		d2.start();
//	}
	
}

public class MultithreadByImplementingRunnable
{
	public static void main(String[] args) 
	{
		
		ChildThread4 ct=new ChildThread4();
		Thread t=new Thread(ct);
		t.start();
		Thread t1=new Thread(ct);
		t1.start();
		Thread t2=new Thread(ct);
		t2.start();
		
	}

}
