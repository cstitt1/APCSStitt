package p10_06;

public abstract class Worker {
	private String name;
	private double sal;
	
	public Worker(String name, double salaryRate) {
		this.name = name;
		this.sal = salaryRate;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSal() {
		return sal;
	}
	
	public abstract double computePay(int hours);
}
