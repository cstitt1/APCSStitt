package p5_3;

public class Sorter {
	private double first, second, third, temp;
	
	public Sorter(double num1, double num2, double num3) {
		first = num1;
		second = num2;
		third = num3;
	}
	
	public void Sort() {
		if (first < second) {
			if (second < third) {
			} else {
				temp = third;
				third = second;
				second = temp;
			}
		} else {
			if (first < third) {
				temp = first;
				first = second;
				second = temp;
			} else {
				if (second < third) {
					temp = first;
					first = second;
					second = temp;
					
					temp = third;
					third = second;
					second = temp;
				} else {
					temp = third;
					third = first;
					first = temp;
				}
			}
		}
	}
	
	public double getFirst() {
		return first;
	}
	
	public double getSecond() {
		return second;
	}
	
	public double getThird() {
		return third;
	}
	
}
