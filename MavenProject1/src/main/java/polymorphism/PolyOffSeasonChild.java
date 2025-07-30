package polymorphism;

import java.util.Scanner;

public class PolyOffSeasonChild extends PolyOnseasonParent{
	String season;
	double totalAmount;
	double disc;

	public static void main(String[] args) 
	{
		PolyOffSeasonChild obj = new PolyOffSeasonChild();
		obj.getPayable();	
	}
	
	
	double discount(double amount)
	{
		double discount = amount*.15;
		System.out.println("15 % Discounted; discount is "+discount);
		discount = amount-discount;
		return discount;		
	}
	
	void getPayable()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total amount: ");
		totalAmount = sc.nextDouble();
		System.out.println("Enter the season: ");
		season = sc.next();
		if(season.equalsIgnoreCase("On"))
		{
			disc=super.discount(totalAmount);
			System.out.println("Payable amount is "+disc);			
		}			
		else if(season.equalsIgnoreCase("Off"))
		{
			disc=this.discount(totalAmount);
			System.out.println("Payable amount is "+disc);
		}		
	}
}
