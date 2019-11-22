package r7_10;

public class ArrayDebug {
	public static void main(String[] args) {
		int[] res = new int[20];
		res[0] = 1;
		res[1] = 4;
		res[2] = 9;
		for (int i=4; i<=20; i++) {
			res[i-1] = i*i;
		}
		System.out.println("Finished");
		//The other values are set to 0.
	}
}
