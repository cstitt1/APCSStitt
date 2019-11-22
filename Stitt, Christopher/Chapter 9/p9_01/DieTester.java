package p9_01;

import textbook.DataSet;

public class DieTester {

	public static void main(String[] args) {
		Die sixSide = new Die(6);
		Die sS2 = new Die(6);
		Die sS3 = new Die(6);
		Die sS4 = new Die(6);
		DataSet test = new DataSet();
		
		System.out.println(sixSide.cast());
		System.out.println(sS2.cast());
		System.out.println(sS3.cast());
		System.out.println(sS4.cast());
		
		test.add(sixSide);
		test.add(sS2);
		test.add(sS3);
		test.add(sS4);
		
		System.out.println(test.getAverage());
	}

}
