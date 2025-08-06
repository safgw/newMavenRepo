package abstraction;

public class Contract extends Employee {

	@Override
	public void calculateSalary(int rate,int hours) {
		System.out.println("Contract Employee Salary is $"+rate*hours);
		
	}

}
