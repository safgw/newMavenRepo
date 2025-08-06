package abstraction;

public class FullTimeEmployee extends Employee {

	public static void main(String[] args) {
		Employee obj1 = new FullTimeEmployee();
		Employee obj2 = new Contract();
		obj1.calculateSalary(1500,5);
		obj2.calculateSalary(1000,8);
	}

	@Override
	public void calculateSalary(int rate, int hours) {
		System.out.println("Permanent Employee Salary is $"+rate*hours);
		
	}

}
