package proj3_1;
/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
	private double balance, fee;
	private int ct;
	/**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
      fee=0;
      ct=0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
      fee=0;
      ct=0;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
	  double newBalance = balance + amount;
	  //double newBalance = balance + amount - fee;
      balance = newBalance;
      ct++;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
	  double newBalance = balance - amount;
	  //double newBalance = balance - amount - fee;
      balance = newBalance;
      ct++;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
   
   /**
    * Sets the fee on deposits and withdrawals.
    * @param cost The fee that will be set on deposits and withdrawals.
    */
   public void setFee(double cost) {
	   fee = cost;
   }
   
   /**
    * Deducts the monthly charge from the balance and resets the charge.
    */
   public void deductMonthlyCharge() {
	   balance -= (fee*ct);
	   ct=0;
   }
}