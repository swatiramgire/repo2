package exceptionHandling;

public class ArithmaticExcExample {
	public static void main(String args[])
	{
		double c=0;
		try 
		{
		c=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			//e.printStackTrace();
			//e.getMessage();
		}
		System.out.println(c);
	}

}
