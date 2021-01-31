//unchecked

package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
import userDefinedException.InsufficientAmountException;

public class ATM 
{
	float balance=1000;
	float current=0;
	float wAmount=0;
	float dAmount;
	
	public void deposite()
	{
		System.out.print("Enter amount to Deposite: ");
		try 
		{
			Scanner sc=new Scanner(System.in);
			dAmount=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			Scanner sc1=new Scanner(System.in);
			System.out.print("Enter amount in integer: ");
			dAmount=sc1.nextInt();
		}
		current=balance+dAmount;
		System.out.println("your current balance is: " + current);
	}
	
	public void withdraw() throws InsufficientAmountException
	{
		System.out.print("Enter amount to Withdraw: ");
		try 
		{
		Scanner sc2=new Scanner(System.in);
		wAmount=sc2.nextInt();
		}
		catch(InputMismatchException e)
		{
			Scanner sc3=new Scanner(System.in);
			System.out.print("Enter amount in integer: ");
			wAmount=sc3.nextInt();
		}
		if(wAmount < current)
		{
			current=current-wAmount;
			System.out.print("your current balance after Withdraw is: " +current);
			
		}
		else
		{
			throw new InsufficientAmountException("Amount in your Account is Insufficient");
		}
	}
	
	public static void main(String args[]) 
	{
		//ATM b=new ATM();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			if(i==3)
			{
				throw new AccountLock("Account Locked");
			}
			System.out.println("Enter pin: ");
			int pin=sc.nextInt();
			if(pin==1234)
			{
				ATM b=new ATM();
				b.deposite();
				try {
					b.withdraw();
					}
					catch(InsufficientAmountException e)
					{
						e.printStackTrace();
					}
			}
		}
	}

}
