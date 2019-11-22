package p5_13;

public class Paycheck {
	private double wage, hours, extra;
	
	public Paycheck(double hourly, double time) {
		wage = hourly;
		if (time>40) {
			hours = 40;
			extra = time - 40;
		} else {
			extra = 0;
			hours = time;
		}
	}
	
	public double Pay() {
		return (hours*wage)+this.overtime();
	}
	
	private double overtime() {
		return (1.5*wage)*extra;
	}
}
