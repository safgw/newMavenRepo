package superKeyword;

public class SuperKeywordC extends SuperKeywordP{	
	
	public static void main(String[] args) 
	{
		new SuperKeywordC().isDivisible();		
	}	
	void isDivisible()
	{
		
		int x=super.sum(4,7);
		System.out.println("The sum is "+x);
		if(x%10==0)
		{
			System.out.println("The sum is divisible by 10");
		}
		else
		{
			System.out.println("The sum is not divisible by 10");
		}
	}
}
