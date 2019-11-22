package r5_3to4;

public class IfTester {

	public static void main(String[] args) {
		//R5.3:
		double x = Math.random();
		
		//If-else if-else
		if (x>.5) {
		} else if (x==0) {
		} else {
		}
		
		//Nested if
		if (x>=0) {
			if (x>.5) {
			}
		}
		
		//R5.4:
		//Order unimportant:
		if (x>.5) {
		} else if (x==0) {
		} else {
		}
		
		//Order important:
		if (x>.5) {
		} else if (x>0) {
		} else {
		}
	}

}
