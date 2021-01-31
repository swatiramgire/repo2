package exceptionHandling;

import java.util.InputMismatchException;

public class ExceptionChainingDemo {
	static void division(int a,int b)
	{	
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			throw new InputMismatchException("Main reason");
		}
	}
	public static void main(String[] args)
	{
		division(4,0);
	}

}
