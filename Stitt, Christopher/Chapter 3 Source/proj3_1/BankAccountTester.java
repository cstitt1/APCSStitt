package proj3_1;

/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      BankAccount harrysChecking = new BankAccount();
      harrysChecking.setFee(50);
      harrysChecking.deposit(2000);
      harrysChecking.withdraw(500);
      harrysChecking.deductMonthlyCharge();
      System.out.println(harrysChecking.getBalance());
   }
}