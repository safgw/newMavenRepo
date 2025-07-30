package encapsulation;

import java.util.Scanner;

public class BankChild {

	public static void main(String[] args) {
		BankParent obj = new BankParent();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Pin");
		int pinNo = sc.nextInt();
		obj.setPin(pinNo);
		obj.validatePin();
	}

}
