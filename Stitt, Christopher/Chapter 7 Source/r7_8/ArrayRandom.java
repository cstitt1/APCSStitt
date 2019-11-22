package r7_8;
public class ArrayRandom {
	public static void main(String[] args) {
		double[] a = new double[10];
		for (int i=0; i<10; i++) {
			double tstVal = Math.random()*99 + 1;
			boolean repeat = false;
			for (int j=i-1; j>= 0; j--) {
				if (tstVal == a[j])
					repeat = true;
			}
			if (!repeat) {
				a[i]= tstVal;
			}
			System.out.println(a[i]);
		}
	}
}
