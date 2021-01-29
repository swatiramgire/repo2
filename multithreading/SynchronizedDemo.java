package multithreading;

import java.util.Scanner;

public class SynchronizedDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		Bank b=new Bank();
		// because we have to share common resource i.e. memory allocation
		do 
		{
		System.out.println("Enter your choice: ");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposite");
		System.out.println("3. Exit");
		ch=sc.nextInt();
		if(ch==1)
		{
		Wife w=new Wife(b);
		}
		else if(ch==2)
		{
		 Husband h=new Husband(b);
		}	
		}while(ch!=0);
	}
}
