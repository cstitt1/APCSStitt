package p6_5;

import java.util.Scanner;

public class DataSetTester {
	public static void main(String[] args) {
		System.out.println("Input a number. To end, type \"end.\"");
		Scanner input = new Scanner(System.in);
		boolean endIn = false;
		DataSet ds = new DataSet();
		while (!endIn) {
			try {
				double num = input.nextDouble();
				ds.add(num);
				System.out.println("Input a number. To end, type \"end.\"");
			} catch (Exception e) {
				endIn = true;
			}
		}
		System.out.println("count: "+ds.getCount());
		System.out.println("mean:"+ds.getMean());
		System.out.println("standard deviation:"+ds.getSDev());
		input.close();
	}
}
