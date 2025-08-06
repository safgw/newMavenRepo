package interfaceExample;

public class HDFC implements RBI {

	public static void main(String[] args) {
		RBI obj = new HDFC();
		System.out.println("Maturity amount is "+obj.recurringDeposit(20000, 12));

	}

	@Override
	public double recurringDeposit(double P, int n) {
		 // Formula: maturityAmount = P * n + P * n(n+1)/2 * r/(12*100)
		return P*n+P*n*n/2+n/2*rate/(12*100);	
	}
}


