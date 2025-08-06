//try, catch, finally

package exceptionHandling;

public class Example1 {


	public static void main(String[] args) {

		
		try
		{	
			int a =10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			// Not mandatory to have code in this block
			System.out.println("catch block for Arithmetic Exception. 10 cannot be divided by 0");
			
		}
		
		finally
		{
			int a=10;
			int b=5;
			int c=a+b;
			System.out.println(c);
		}
		
	

	}

}
