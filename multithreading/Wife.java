package multithreading;

public class Wife implements Runnable
{
	Bank b;
	Wife(Bank b)
	{
		this.b=b;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		//Bank b=new Bank();
		b.withdraw();	
	}

}
