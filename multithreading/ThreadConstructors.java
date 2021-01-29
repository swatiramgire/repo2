package multithreading;

class ThreadChild implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread());
	}
}
public class ThreadConstructors 
{
	public static void main(String[] args)
	{
		ThreadChild tc=new ThreadChild();
		
		// This will not give any output because we have not extended thread class
		Thread td1=new Thread(); 
		td1.start();
		
		ThreadGroup tg=new ThreadGroup("CT-105");
		Thread td2=new Thread("Java Thread");
		td2.start();
		
		Thread td3=new Thread(tg,"ThirdConstructor");
		td3.start();
		
		Thread td4=new Thread(tc);
		td4.start();
		
		Thread td5=new Thread(tc,"FifthConstructor");
		td5.start();
		
		Thread td6=new Thread(tg,tc);
		td6.start();
		
		Thread td7=new Thread(tg, tc, "SeventhCostructor");
		td7.start();
	}
	

}
