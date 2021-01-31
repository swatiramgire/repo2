// one method throws the exception towards the caller 
package exceptionHandling;

public class ReverseExceptionPropagation {
	
	public int doIt(int a,int b) throws ArithmeticException
	{
		int div=a/b;
		System.out.println(div);
		return 0;
	}
	
	public void doMore(int a,int b) throws ArithmeticException
	{
		System.out.println(doIt(a,b));
	}
	public static void main(String[] args)
	{
		ReverseExceptionPropagation r=new ReverseExceptionPropagation();
		try 
		{
		r.doMore(6, 2);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}

}
