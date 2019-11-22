package sorts.ints;

public class InsertionSort
{
    public static void sort(int[] x)
    {
        /*for (int i=1; i < x.length; i++) {
        	int temp = x[i];
        	int j=i-1;
        	while (j!=-1 && temp<x[j]) {
        		x[j+1] = x[j];
        		j--;
        	}
        	x[j+1] = temp;
        } */
        
        sortWithBinarySearch(x);
    }
    
    public static void sortWithBinarySearch(int[] x)
    {
    	for (int i=1; i<x.length; i++) {
    		int key = binarySearch(x, x[i], 0, i-1);
    		if (key < 0) {
    			key=(key+1)*-1;
    		}
    		
    		int temp = x[i];
        	int j=i-1;
        	while (j!=-1 && j != key-1) {
        		x[j+1] = x[j];
        		j--;
        	}
        	x[j+1] = temp;
    	}
    }

    public static int binarySearch(int[] x, int key)
    {
        return binarySearch(x, key, 0, x.length-1);
        
    	/*int start = 0, end = x.length-1;
    	
    	while (start != x.length && end != -1) {
    		int mid = (start + end)/2;
    		
    		if (x[mid] > key) {
    			end = mid - 1;
    		} else if (x[mid] < key) {
    			start = mid + 1;
    		} else {
    			return mid;
    		}
    	}
    	
    	return -1; */
    }

    private static int binarySearch(int[] x, int key, int start, int end)
    {
        int mid = (start + end)/2;
        if (end == -1) {
        	return 0;
        } else if (start == x.length || start > end) {
        	return -start-1;
        }
        
        if (x[mid] > key) {
        	return binarySearch(x, key, start, mid-1);
        } else if (x[mid] < key) {
        	return binarySearch(x, key, mid+1, end);
        } else {
        	return mid;
        }
    }

    // recursive variant sorts x[start] ... x[x.length - 1]
    private static void sort(int[] x, int start)
    {
        if (start >= x.length) {
        	return;
        }
        
        insert(x, x[start], start);
        sort(x, start+1);
    }

    // inserts value into correct position in x[0]...x[start]
    private static void insert(int[] x, int value, int start)
    {
        if (start <= -1) {
        	return;
        }
        
    	if (value < x[start]) {
        	x[start+1] = x[start];
        	x[start] = value;
        }
    	
    	insert(x, value, start-1);
    }
}