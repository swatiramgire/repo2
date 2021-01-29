package multithreading;

public class Husband implements Runnable{

	Bank b;
	Husband(Bank b)
	{
		this.b=b;
		Thread t=new Thread(this);
		t.start();
	}
	public void run() 
	{
		//Bank b=new Bank();
		b.deposite();
	}
	

}
