package exceptionHandling;

class Parent
{
	void showDetails()
	{
		System.out.println("Parent");
	}
}
public class ClassCastExample extends Parent
{
	void showDetails()
	{
		System.out.println("Child");
	}
	
	public static void main(String args[])
	{
		//try {
		ClassCastExample a=(ClassCastExample)new Parent(); 
		a.showDetails();
		//}
		//catch(ClassCastException e)
		//{
			
		//}
		
	}
}
