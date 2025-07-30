package polymorphism;

public class PolyOnseasonParent {

	double discount(double amount)
	{
		double discount = amount*.4;
		System.out.println("40 % Discounted; discount is "+discount);
		discount = amount-discount;
		return discount;
		
	}
}
