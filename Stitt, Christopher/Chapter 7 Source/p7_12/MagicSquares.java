package p7_12;
import java.util.ArrayList;

public class MagicSquares {
	ArrayList<Integer> nums;
	
	/**
	 * Creates a new "Magic Square" using an ArrayList
	 */
	public MagicSquares() {
		nums = new ArrayList<Integer>();
	}
	
	/**
	 * Adds the number i to the ArrayList of numbers
	 * @param i The number to be added to the ArrayList of numbers
	 */
	public void add(int i) {
		nums.add(i);
	}
	
	/**
	 * Returns true if the numbers return a magic square; false otherwise
	 * @return true if the numbers return a magic square; false otherwise
	 */
	public boolean isMagic() {
		//Test 1: n^2 for some n
		double n = Math.sqrt(nums.size());
		int nTest = (int) n;
		if (n/nTest != (double) 1) {
			return false;
		}
		
		//Test 2: 1 to n^2
		for (int i=1; i<nums.size(); i++) {
			if (!nums.contains(i)) {
				return false;
			}
		}
		
		//Test 3: Row, column and diagonal addition
		int[][] magicSquare = new int[nTest][nTest];
		int i=0;
		for (int row=0; row<nTest; row++) {
			for (int col=0; col<nTest; col++) {
				if (i<nums.size()) {
					magicSquare[row][col] = nums.get(i);
					i++;
				} else {
					magicSquare[row][col] = 0;
					i++;
				}
			}
		}
		
		for (int rc = 0; rc<nTest-1; rc++) {
			if (sumCol(magicSquare, rc) != sumCol(magicSquare, rc+1)) {
				return false;
			}
			
			if (sumRow(magicSquare, rc) != sumRow(magicSquare, rc+1)) {
				return false;
			}
		}
		
		return sumDiagonals(magicSquare);
	}
	
	private static int sumCol(int[][] sqr, int col) {
		int sum = 0;
		for (int i=0; i<sqr.length; i++) {
			sum += sqr[i][col];
		}
		return sum;
	}
	
	private static int sumRow(int[][] sqr, int row) {
		int sum = 0;
		for (int i=0; i<sqr.length; i++) {
			sum += sqr[row][i];
		}
		return sum;
	}
	
	private static boolean sumDiagonals(int[][] sqr) {
		//Based on direction from top to bottom
		int lr = 0;
		int rl = 0;
		
		for (int i=0; i<sqr.length; i++) {
			lr += sqr[i][i];
			rl += sqr[sqr.length-(1+i)][i];
		}
		
		return lr == rl;
	}
}