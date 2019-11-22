package r7_16;

public class ArrayTasks {

	public static void main(String[] args) {
		//Part a:
		int[] a = new int[] {0,1,2,3,4};
		int[] b = new int[] {0,1,2,3,4};
		int[] c = new int[] {0,1,2,3,5};
		System.out.println(ExactSame(a, b));
		System.out.println(ExactSame(a, c));
		
		//Part b:
		System.out.println("a: "+a);
		System.out.println("a copy: "+Copy(a));
		
		//Part c:
		System.out.println("a old: "+a);
		System.out.println("a new: "+ZeroErase(a));
	}
	
	public static boolean ExactSame(int[] a, int[] b) {
		if (a.length!=b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] Copy(int[] a) {
		int[] d = new int[a.length];
		for (int i = 0; i<a.length; i++) {
			d[i] = a[i];
		}
		return d;
	}
	
	public static int[] ZeroErase(int[] a) {
		for (int i=0; i<a.length; i++) {
			a[i] = 0;
		}
		return a;
	}
}