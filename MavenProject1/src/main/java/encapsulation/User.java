package encapsulation;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Bank obj = new Bank();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Pin");
		int pinNo = sc.nextInt();
		obj.setPin(pinNo);
		obj.validatePin();

	}
}
