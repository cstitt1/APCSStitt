package dynamicProgramming;

public class FibTester {

	public static void main(String[] args) {
		Fibonacci test = new Fibonacci();
		for (int i=0; i<=7; i++) {
			System.out.println(test.fib(i));
		}
		
		System.out.println(test.fib(32));
	}

}
