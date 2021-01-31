//Checked
package exceptionHandling;

import userDefinedException.IncorrectPasswordException;

public class LoginForm {
	public static void main(String[] args) throws IncorrectPasswordException
	{
		String userName="Swati";
		int password=12345;
		
		if(password==55555)
		{
			System.out.println("Login Successfully");
		}
		else {
			throw new IncorrectPasswordException("try Again");
		}
	}

}
