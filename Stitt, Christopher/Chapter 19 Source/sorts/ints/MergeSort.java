package sorts.ints;

public class MergeSort
{
	public static void sort(int[] a)
	{
		sort(a, 0, a.length-1);
	}
	
	private static void sort(int[] a, int low, int high)
	{
		if (low >= high) {
			return;
		}
		
		int mid = (low+high)/2;
		
		sort(a, low, mid);
		sort(a, mid+1, high);
		merge(a, low, mid, high);
	}

	static void merge(int[] a, int low, int mid, int high)
	{
		int[] aCopy = new int[mid+1-low];
		int dest = low;
		int source1 = 0;
		int source2 = mid+1;
		
		for (int i=0; i<aCopy.length; i++) {
			aCopy[i] = a[low+i];
		}
		
		while (source1 < aCopy.length) {
			if (source2 > high || aCopy[source1] <= a[source2]) {
				a[dest] = aCopy[source1];
				source1++;
			} else {
				a[dest] = a[source2];
				source2++;
			}
			dest++;
		}
	}
}