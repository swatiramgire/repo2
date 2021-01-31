package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExample {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		try 
		{
		System.out.println("Enter value: ");	
		a=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Integer value: ");
			a=sc1.nextInt();
		}
		finally
		{
			sc.close();
		}
	}

}
