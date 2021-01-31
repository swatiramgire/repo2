package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String args[])
	{
		try
		{
		FileInputStream f=new FileInputStream("abc.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception handled");
		}
	}

}
