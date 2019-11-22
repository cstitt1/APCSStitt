package bankAccount;

public class TimeDepositAccount extends SavingsAccount{
	private double months;
	private final double penalty = .05;
	
	public TimeDepositAccount(double rate, double maturity) {
		super(rate);
		months = maturity;
	}
	
	public void addInterest() {
		super.addInterest();
		months--;
	}
	
	public void withdraw(double amount) {
		super.withdraw(amount);
		if (months > 0)
			super.withdraw(penalty*getBalance());
	}
}