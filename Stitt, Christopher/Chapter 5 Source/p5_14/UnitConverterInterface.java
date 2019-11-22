package p5_14;

import java.util.Scanner;

public class UnitConverterInterface {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the two conversion units.");
		String unit1 = input.nextLine();
		String unit2 = input.nextLine();
		UnitConverter uc = new UnitConverter(unit1,unit2);
		System.out.println("Please input the conversion value.");
		double sV = input.nextDouble();
		String end = uc.Convert(sV);
		input.close();
		System.out.println(sV+" "+unit1+" to "+" "+unit2+" = "+end);
	}

}
