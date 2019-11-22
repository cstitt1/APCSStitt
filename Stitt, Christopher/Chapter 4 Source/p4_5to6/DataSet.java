package p4_5to6;
public class DataSet {
	private double sum;
	private int count;
	private double big, small;
	
	public DataSet() {
		sum=0;
		count=0;
		big = Integer.MIN_VALUE;
		small = Integer.MAX_VALUE;
	}
	public void addValue(int val) {
		sum += val;
		count++;
		big = Math.max(val, big);
		small = Math.min(val, small);
	}
	
	public double getSum() {
		return sum;
	}
	
	public double getAverage() {
		return (sum/count);
	}
	
	public double getSmallest() {
		return small;
	}
	
	public double getLargest() {
		return big;
	}
}