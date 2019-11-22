package p5_11;

public class RoundDiffer {
	private double first, second;
	
	public RoundDiffer(double num1, double num2) {
		first = num1*100;
		second = num2*100;
	}
	
	public String RoundTest() {
		double first = this.Round(this.first);
		double second = this.Round(this.second);
		if (first==second) {
			return "They are the same when rounded to 2 decimal places";
		} else {
			return "They are different when rounded to 2 decimal places";
		}
	}
	
	public String DifferTest() {
		if (Math.abs(first-second)<1) {
			return "They differ by less than .01";
		}
		return "They do not differ by less than .01";
	}
	
	private double Round(double a) {
		if (a>0) {
			a+=.5;
			a = (int) a;
		} else {
			a-=.5;
			a = (int) a;
		}
		return a;
	}
}
