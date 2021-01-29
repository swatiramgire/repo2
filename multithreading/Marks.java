package multithreading;

import java.util.Scanner;

public class Marks implements Runnable
{
	public static float  math,physics,chemistry,biology;
	public static String name;
	public void run() 
	{
		try {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name of student: ");
		name=sc.next();
		System.out.print("Enter the marks for Maths: ");
		math=sc.nextFloat();
		System.out.print("Enter the marks for Physics: ");
		physics=sc.nextFloat();
		System.out.print("Enter the marks for Chemistry: ");
		chemistry=sc.nextFloat();
		System.out.print("Enter the marks for Biology: ");
		biology=sc.nextFloat();
		
		Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	
	public Marks()
	{
		try {
		Thread t=new Thread(this);
		t.start();
		System.out.println(t.isAlive());
		t.join();
		System.out.println(t.isAlive());
		}
		catch(InterruptedException e)
		{
			
		}
	}

}
