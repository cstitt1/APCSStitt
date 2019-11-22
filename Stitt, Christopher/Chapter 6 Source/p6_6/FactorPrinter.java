package p6_6;
import java.util.*;
public class FactorPrinter {
	public static void main(String[] args) {
		System.out.println("Please input number to be factored");
		Scanner in = new Scanner(System.in);
		FactorGenerator fg = new FactorGenerator(in.nextInt());
		boolean repeat = fg.hasMoreFactors();
		while (repeat) {
			System.out.println(fg.nextFactor());
			repeat = fg.hasMoreFactors();
		}
		in.close();
	}
}
