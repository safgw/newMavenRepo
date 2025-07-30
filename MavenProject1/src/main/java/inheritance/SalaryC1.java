package inheritance;

public class SalaryC1 extends SalaryP {
	double hra;
	double pf;
	
	void calculation()
	{	
		hra = (basicpay*.05);
		pf = basicpay*.2;
		
	}
}
