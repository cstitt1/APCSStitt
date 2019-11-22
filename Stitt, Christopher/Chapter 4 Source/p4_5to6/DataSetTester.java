package p4_5to6;

public class DataSetTester {

	public static void main(String[] args) {
		DataSet tst = new DataSet();
		tst.addValue(1);
		tst.addValue(2);
		tst.addValue(3);
		tst.addValue(4);
		System.out.println("Expected sum: 10");
		System.out.println("Sum: "+tst.getSum());
		System.out.println("Expected average: 2.5");
		System.out.println("Average: "+tst.getAverage());
		System.out.println("Expected maximum: 4");
		System.out.println("Maximum: "+tst.getLargest());
		System.out.println("Expected minimum: 1");
		System.out.println("Minimum: "+tst.getSmallest());
	}

}
