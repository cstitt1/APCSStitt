package p5_3;
import java.util.Scanner;

public class SorterInterface {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three numbers.");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		Sorter sort = new Sorter(num1, num2, num3);
		input.close();
		sort.Sort();
		System.out.println("The numbers in sorted order are:");
		System.out.println(sort.getFirst());
		System.out.println(sort.getSecond());
		System.out.println(sort.getThird());
	}

}
