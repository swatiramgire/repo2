// one method can throw 1 or more exception
package exceptionHandling;

public class ThrowsKeywordExample {
	
	public int doIt(int a,int b) throws ArithmeticException, ArrayIndexOutOfBoundsException
	{
		int div=a/b;
		System.out.println(div);
		int c[]=new int[5];
		System.out.println(c[a]);
		return 0;
	}
	public static void main(String[] args) 
	{
		ThrowsKeywordExample t=new ThrowsKeywordExample();
		t.doIt(4, 2);
		
	}

}
