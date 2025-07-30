package inheritance;

public class SalaryC2 extends SalaryC1 
{
	public static void main(String[] args) 
	{
		SalaryC2 obj= new SalaryC2();
		obj.salary();
	}
	

	double totalSalary;	
	public void salary()
	{		
		//basicDetails();
		calculation();
		getInput();
		totalSalary= basicpay+hra-pf-deduction+bonus;
		salarySlip();
	}
	
	void salarySlip()
	{
		System.out.println("Basic Pay is "+basicpay);
		System.out.println("Deduction is "+deduction);
		System.out.println("Bonus is "+bonus);
		System.out.println("HRA is "+hra);
		System.out.println("PF is "+pf);
		System.out.println("Total Salary is "+totalSalary);
	}
}


