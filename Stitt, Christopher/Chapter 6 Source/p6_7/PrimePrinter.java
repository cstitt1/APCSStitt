package p6_7;
import java.util.Scanner;

public class PrimePrinter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input number:");
		int upBound = in.nextInt();
		in.close();
		PrimeGenerator pg = new PrimeGenerator();
		for (int i=2; i<upBound; i++) {
			if (pg.nextPrime()) {
				System.out.println(i);
			}
		}
	}
}
