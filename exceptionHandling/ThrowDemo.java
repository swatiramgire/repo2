package exceptionHandling;

public class ThrowDemo {
	public static void main(String[] args) {
		
		String s=null;
		
		if(s!=null)
		{
			System.out.println(s.length());
		}
		else {
			throw new NullPointerException("String null value is not allowed"); // to print Error Message
		}
		
	}

}
