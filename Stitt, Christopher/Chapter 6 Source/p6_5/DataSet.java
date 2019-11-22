package p6_5;

public class DataSet {
	
	private int count;
	private double sum, sum2;
	
	/**
	 * Constructs a DataSet object
	 */
	public DataSet() {
		count = 0;
		sum = 0;
		sum2 = 0;
	}
	
	public void add(double num) {
		count++;
		sum += num;
		sum2 += Math.pow(num, 2);
	}
	
	public int getCount() {
		return count;
	}
	
	public double getMean() {
		return (sum/count);
	}
	
	public double getSDev() {
		return Math.sqrt((sum2 - (Math.pow(sum, 2)/count))/(count-1));
	}
}
