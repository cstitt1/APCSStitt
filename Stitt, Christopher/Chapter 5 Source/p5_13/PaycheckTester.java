package p5_13;

public class PaycheckTester {

	public static void main(String[] args) {
		Paycheck mikePay = new Paycheck(12,35);
		Paycheck davePay = new Paycheck(12,40);
		Paycheck jackPay = new Paycheck(12,45);
		Paycheck lazyPay = new Paycheck(12,0);
		System.out.println("The amount paid to Mike is $"+mikePay.Pay()+"0");
		System.out.println("The amount paid to Dave is $"+davePay.Pay()+"0");
		System.out.println("The amount paid to Jack is $"+jackPay.Pay()+"0");
		System.out.println("The amount paid to Lazy is $"+lazyPay.Pay()+"0");
	}

}
