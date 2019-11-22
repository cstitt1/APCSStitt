package proj3_1;

import junit.framework.TestCase;

public class BankAccountTest extends TestCase{
	private BankAccount harrysChecking;
	
	public void setUp() {
		harrysChecking = new BankAccount();
	    harrysChecking.setFee(50);
	}
	
	public void tearDown() {
		harrysChecking = null;
	}
	
	public void testgetBalance() {
		assertTrue(harrysChecking.getBalance()==0);
		harrysChecking.deposit(2000);
		assertTrue(harrysChecking.getBalance()==2000);
		harrysChecking.withdraw(500);
		assertTrue(harrysChecking.getBalance()==1500);
		harrysChecking.deductMonthlyCharge();
		assertTrue(harrysChecking.getBalance()==1400);
	}
}