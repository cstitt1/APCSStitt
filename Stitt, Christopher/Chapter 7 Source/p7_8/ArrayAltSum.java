package p7_8;
import java.util.Scanner;
public class ArrayAltSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean repeat = true;
		int i=0;
		System.out.println("What is the count of numbers?");
		int[] a = new int[in.nextInt()];
		while (repeat) {
			System.out.println("Input a number or \"end\" to finish it.");
			try {
				a[i] = in.nextInt();
			} catch (Exception e) {
				repeat = false;
			}
		}
		in.close();
		int sum=0;
		for (int j=0; j<a.length; j++) {
			if (j%2==0) {
				sum += a[j];
			} else {
				sum -= a[j];
			}
		}
		System.out.println("Sum: "+sum);
	}
}