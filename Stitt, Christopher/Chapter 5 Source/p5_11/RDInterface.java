package p5_11;

import java.util.Scanner;

public class RDInterface {
	public static void main(String[] args) {
		System.out.println("Please enter two doubles");
		Scanner input = new Scanner (System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		RoundDiffer rdtst = new RoundDiffer(num1, num2);
		input.close();
		System.out.println(rdtst.RoundTest());
		System.out.println(rdtst.DifferTest());
	}
}
