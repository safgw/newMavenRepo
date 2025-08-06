package exceptionHandling;

public class Example2 {

	public static void main(String[] args) 
	{
	
		/*
		try
		{
		divide(10,0);
		}
		catch(ArithmeticException e)
		{
			
		}
		*/
	
		divide(10,0);

	}
	
	public static void divide(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			//int c = a/b;
			//System.out.println(c);
			//System.out.println("Invalid; Division by 0 not valid");
			throw new ArithmeticException("Division by 0 not allowed");
		}
		
		else
		{
	//		int c = a/b;
			int d=a+b;
			//System.out.println(c);
			System.out.println(d);
		}
	}

}
