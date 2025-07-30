//4. Find the highest number in an array.
package sample;

public class HighestNumber {

	public static void main(String[] args) 
	{
		int Arr[] = {1,5,10,4,2,6};
		int max=0;
		
		for(int i:Arr)
		{System.out.println("i is "+i);
			if(max<i)
			{
				max=i;
			}
		
	/*	else
			{
				i++;
			}
			
	*/	
		}
		
		System.out.println("Highest Number is "+max);

	}

}
