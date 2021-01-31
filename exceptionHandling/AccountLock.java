package exceptionHandling;

public class AccountLock extends RuntimeException{
	public AccountLock(String s)
	{
		System.out.println(s);
	
	}

}
