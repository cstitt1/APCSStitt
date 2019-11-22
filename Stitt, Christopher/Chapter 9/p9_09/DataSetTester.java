package p9_09;

public class DataSetTester {
	public static void main(String[] args) {
		DataSet test = new DataSet();
		test.add("Bob");
		test.add("Max");
		System.out.println(test.getMaximum());
		System.out.println(test.getMinimum());
	}
}
