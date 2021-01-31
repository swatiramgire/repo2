// to differentiate between exceptions

package exceptionHandling;

import java.util.Scanner;

public class TryWithMultipleCatchBlock {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a= {3,4,5,6,7};
		int index,b,c;
		try
		{
			
			System.out.println("Enter Index number: ");
			index=sc.nextInt();
			System.out.println(a[index]);
			System.out.println("Enter value 1: ");
			b=sc.nextInt();
			System.out.println("Enter value 2: ");
			c=sc.nextInt();
			
			int add=b+c;
			int div=b/c;
			System.out.println("Addition is: "+add);
			System.out.println("Division is: "+div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter value 1: ");
			b=sc.nextInt();
			System.out.println("Enter only integer Value in Denominator : ");
			c=sc.nextInt();
			
			int add=b+c;
			int div=b/c;
			System.out.println("Addition is: "+add);
			System.out.println("Division is: "+div);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please Enter Index number between 0 to 4: ");
			index=sc.nextInt();
			System.out.println(a[index]);
			
			System.out.println("Enter value 1: ");
			b=sc.nextInt();
			System.out.println("Enter value 2: ");
			c=sc.nextInt();
			
			int add=b+c;
			int div=b/c;
			System.out.println("Addition is: "+add);
			System.out.println("Division is: "+div);
		}
		finally {
			sc.close();
		}
	}

}
