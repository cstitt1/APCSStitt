package p10_06;

public class HourlyWorker extends Worker{
	public HourlyWorker(String name, double salaryRate) {
		super(name, salaryRate);
	}
	
	public double computePay(int hours) {
		if (hours > 40) {
			return super.getSal()*40 + super.getSal()*1.5*(hours-40);
		} else {
			return super.getSal()*hours;
		}
	}
}
