/*
 ➢ Program to find the total salary by hand of an Employee 
 
• Class 1 Get basic pay, deduction and bonus from console.
• Class 2 Calculate hra (5% of basic pay) and pf (20% of basic pay). 
• Class 3 Find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip 
• Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by hand.

 */

package inheritance;

import java.util.Scanner;

public class SalaryP 
{
	double basicpay,deduction,bonus;
	//double deduction;
	//double bonus;
	
	
	void basicDetails()
	{
		//basicpay = 16000;
		//deduction = 500;
		//bonus = 2000;	
	}
	
	void getInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Pay: ");
		basicpay = sc.nextDouble();
		System.out.println("Enter Deduction: ");
		deduction = sc.nextDouble();
		System.out.println("Enter Bonus: ");
		bonus = sc.nextDouble();
	}
	
}
