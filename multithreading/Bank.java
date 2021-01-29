package multithreading;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank 
{

	static float balance=1000;
	//float current=0;
	float wAmount=0;
	float dAmount;
	
	public synchronized void deposite()
	{
		System.out.print("Enter amount to Deposite: ");
		try 
		{
			Scanner sc=new Scanner(System.in);
			dAmount=sc.nextInt();
			Thread.sleep(1000);
		}
		catch(InputMismatchException | InterruptedException e)
		{
			Scanner sc1=new Scanner(System.in);
			System.out.print("Enter amount in integer: ");
			dAmount=sc1.nextInt();
		}
		balance=balance+dAmount;
		System.out.println("your current balance is: " + balance);
	}
	
	public synchronized void withdraw() 
	{
		System.out.print("Enter amount to Withdraw: ");
		try 
		{
		Scanner sc2=new Scanner(System.in);
		wAmount=sc2.nextInt();
		Thread.sleep(500);
		}
		catch(InputMismatchException | InterruptedException e)
		{
			Scanner sc3=new Scanner(System.in);
			System.out.print("Enter amount in integer: ");
			wAmount=sc3.nextInt();
		}
		
		if(wAmount < balance)
		{
			balance=balance-wAmount;
			System.out.println("your current balance after Withdraw is: " +balance);
		}
		else
		{
			System.out.println("Your balance is Low.....:(");
			System.out.println("You require " + balance +" Amount");
		}
	}	
}


