package exceptionHandling;

public class NullPointerExample {
	
	public static void main(String[] args)
	{
		
		String str=null;
		String str2="";
		try
		{
		 str2=str.concat("Hello");
		}
		catch(NullPointerException e)
		{
			
		}
		System.out.println(str2);
	}

}
