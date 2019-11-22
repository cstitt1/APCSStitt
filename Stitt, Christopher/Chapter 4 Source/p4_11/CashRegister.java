package p4_11;

/**
A cash register totals up sales and computes change due.
*/
public class CashRegister
{
/**
   Constructs a cash register with no money in it.
*/
public CashRegister()
{
   purchase = 0;
   payment = 0;
}

/**
   Records the purchase price of an item.
   @param amount the price of the purchased item
*/
public void recordPurchase(double amount)
{
   purchase = purchase + amount;
}

/**
   Enters the payment received from the customer.
   @param dollars the number of dollars in the payment
   @param quarters the number of quarters in the payment
   @param dimes the number of dimes in the payment
   @param nickels the number of nickels in the payment
   @param pennies the number of pennies in the payment
*/
public void enterPayment(int dollars, int quarters, 
      int dimes, int nickels, int pennies)
{
   payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
         + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
}

/**
   Computes the change due and resets the machine for the next customer.
   @return the change due to the customer
*/
public double giveChange()
{
   change = payment - purchase;
   purchase = 0;
   payment = 0;
   return change;
}

/**
 * Returns the number of full dollars in the change
 * @return the number of full dollars in the change
 */
public int giveDollars() {
	return this.giveMoneyCount(1);
}

/**
 * Returns the number of quarters in the change
 * @return the number of quarters in the change
 */
public int giveQuarters() {
	return this.giveMoneyCount(QUARTER_VALUE);
}

/**
 * Returns the number of dimes in the change
 * @return the number of dimes in the change
 */
public int giveDimes() {
	return this.giveMoneyCount(DIME_VALUE);
}

/**
 * Returns the number of nickels in the change
 * @return the number of nickels in the change
 */
public int giveNickels() {
	return this.giveMoneyCount(NICKEL_VALUE);
}

/**
 * Returns the number of pennies in the change
 * @return the number of pennies in the change
 */
public int givePennies() {
	return this.giveMoneyCount(PENNY_VALUE);
}

private int giveMoneyCount(double value) {
	int cnt = 0;
	while (change >= value) {
		cnt++;
		change-=value;
	}
	return cnt;
}

public static final double QUARTER_VALUE = 0.25;
public static final double DIME_VALUE = 0.1;
public static final double NICKEL_VALUE = 0.05;
public static final double PENNY_VALUE = 0.01;

private double purchase;
private double payment;
private double change;
}