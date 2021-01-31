package exceptionHandling;

import java.util.Scanner;

public class MultipleExceptionInCatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			//int[] a=new int[5];
			int[] a= {3,4,5,6,7};
			System.out.println("Enter Index number: ");
			int index=sc.nextInt();
			System.out.println(a[index]);
			System.out.println("Enter value 1: ");
			int b=sc.nextInt();
			System.out.println("Enter value 2: ");
			int c=sc.nextInt();
			
			int add=b+c;
			int div=b/c;
			System.out.println("Addition is: "+add);
			System.out.println("Division is: "+div);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			
		}
		finally {
			sc.close();
		}
	}
	

}
