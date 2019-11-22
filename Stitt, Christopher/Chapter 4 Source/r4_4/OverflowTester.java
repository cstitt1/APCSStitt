package r4_4;

public class OverflowTester {
	public static void main(String[] args) {
		int x = 2000;
		x=(int) Math.pow(x, 4);
		System.out.println(x);
	}
}
