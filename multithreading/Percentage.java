package multithreading;

class Percentage implements Runnable
{
	public static double percentage,total;
	public void run()
	{
		try
		{
		System.out.println("Calculating Percentage......");
		Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{}
		total=Marks.math+Marks.physics+Marks.chemistry+Marks.biology;
		percentage=(total/400)*100;
		
		System.out.println(" Percentage of "+ Marks.name + " are: " + percentage + "%");
		
		if(percentage<=35)
		{
			System.out.println("You are Failed....:(");
		}
		else
		{
			System.out.println("You are Passed...!!!!!");
		}
		
	}
	
	public Percentage()
	{
		Thread t1=new Thread(this);
		t1.start();
		
	}
	
}


