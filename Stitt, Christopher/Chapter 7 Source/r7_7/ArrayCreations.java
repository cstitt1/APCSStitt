package r7_7;

public class ArrayCreations {

	public static void main(String[] args) {
		//Part a
		int[] a = new int[10];
		for (int i=1; i<=10; i++) {
			a[i-1] = i;
		}
		
		//Part b
		a = new int[11];
		for (int i=0; i<11; i++) {
			a[i] = i*2;
		}
		
		//Part c
		a = new int[10];
		for (int i=1; i<=10; i++) {
			a[i-1] = i*i;
		}
		
		//Part d
		a = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		//Part e
		a = new int[] {1,4,9,16,9,7,4,9,11};
	}
}