package p10_06;

public class SalariedWorker extends Worker{
	public SalariedWorker(String name, double salaryRate) {
		super(name, salaryRate);
	}
	
	public double computePay(int hours) {
		return super.getSal()*40;
	}
	
}
