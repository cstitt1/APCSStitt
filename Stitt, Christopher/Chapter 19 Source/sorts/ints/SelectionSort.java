package sorts.ints;

public class SelectionSort
{
    public static void sort(int[] x)
    {
    	/*for (int i=0; i<x.length-1; i++) { //Skip last element visited --> Selection
        	int minInd = i;
    		
    		for (int j=i+1; j<x.length; j++) { //Start from unsorted --> Selection
        		if (x[minInd] > x[j]) {
        			minInd = j; //Find minimum --> Selection
        		}
        	}
        	
        	swap(x, i, minInd);
        } */
    	
    	sort(x, 0);
    }
    
    /*
     * Without -1 (part 1, loop 1): It will work, just makes the sort easier
     * int minInd = x[i]: Would not work since is value, not position
     * Without +1 (part 1, loop 2): It works, but it checks extra stuff, so it is not necessary
     * Added -1 (part 2, loop 2): It doesn't work if the greatest number is not the last
     * Run inside loop backwards: Still works
     * Run outside loop backwards: Does not work because sorts it the wrong way
     */
    
    private static void swap(int[] x, int i, int j)
    {
        int temp = x[j];
        x[j] = x[i];
        x[i] = temp;
    }
    
    // recursive variant sorts x[start] ... x[x.length - 1]
    private static void sort(int[] x, int start)
    {
        if (start >= x.length-1)
        	return;
        
        int indMin = indexOfMin(x, start);
        swap(x, start, indMin);
        sort(x, start+1);
    }
    
    private static int indexOfMin(int[] x, int start)
    {
    	if (start >= x.length-1) {
    		return start;
    	}
    	
    	int minInd = start;
    	int tst = indexOfMin(x, start+1);
    	
    	if (x[tst] < x[minInd]) {
    		minInd = tst;
    	}
    	
		return minInd;
    }
}