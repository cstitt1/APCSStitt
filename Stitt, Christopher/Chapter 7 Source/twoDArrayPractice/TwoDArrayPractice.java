package twoDArrayPractice;

import java.util.ArrayList;

public class TwoDArrayPractice
{
    /**
     * Returns a larger array containing the same elements as the
     * mat. The elements from mat are read in row-major order and
     * appear in the new array in row-major order.
     * 
     * For example, if mat was:
     * { {10, 9, 8, 7},
     *   {6, 5, 4, 3},
     *   {2, 1, -1, 0} }
     * 
     * newRows was 4 and newCols was 5
     * the returned array would be:
     * { {10, 9, 8, 7, 6},
     *   {5, 4, 3, 2, 1},
     *   {-1, 0, 0, 0, 0},
     *   {0, 0, 0, 0, 0} }
     * 
     * Precondition: newRows > mat.length && newCols > mat[0].length
     * 
     * @param mat the 2D array containing the original elements
     * @param newRows the number of rows in the new array
     * @param newCols the number of columns in the new array
     * @return a larger array containing the elements from mat in row-major order
     */
    public static int[][] grow(int[][] mat, int newRows, int newCols)
    {
    	/*Turn 2D array into arraylist for access to elements.
    	 * Create new 2D array with specifications
    	 * put elements from arraylist into new 2D array
    	 */
        ArrayList<Integer> nums = new ArrayList<Integer>(mat.length*mat[0].length);
        for (int row = 0; row < mat.length; row++) {
        	for (int col=0; col<mat[0].length; col++) {
        		nums.add(mat[row][col]);
        	}
        }
        
        int[][] newMat = new int[newRows][newCols];
        
        for (int newRow = 0; newRow < newMat.length; newRow++) {
        	for (int newCol=0; newCol<newMat[0].length; newCol++) {
        		if (nums.isEmpty()) {
        			newMat[newRow][newCol] = 0;
        		} else {
        			newMat[newRow][newCol] = nums.remove(0);
        		}
        	}
        }
        
        return newMat;
    }
    
    /**
     * Returns an array with the specified number of rows and columns
     * containing the characters from str in row-major order. If str.length()
     * is greater than rows * cols, extra characters are ignored. If
     * str.length() is less than rows * cols, the remaining elements in the
     * returned array contain null.
     * 
     * @param str the string to be placed in an array
     * @param rows the number of rows in the array to be returned
     * @param cols the number of columns in the array to be returned
     * @return an array containing the characters from str in row-major order
     */
    public static String[][] fillRowMajor(String str, int rows, int cols)
    {
        //put each char of String into 2D array based on size of array, not length of string
    	int index = 0;
    	String[][] mat = new String[rows][cols];
    	
    	for (int row = 0; row < mat.length; row++) {
        	for (int col=0; col<mat[0].length; col++) {
        		if (index <str.length()) {
        			mat[row][col] = str.substring(index, index+1);
        		} else {
        			mat[row][col] = null;
        		}
        		index++;
        	}
        }
    	
    	return mat;
    }
    
    /**
     * Returns an array containing the elements of vals in column-major order.
     * 
     * Precondition: vals.length == rows * cols
     * 
     * @param vals the elements
     * @param rows the number of rows in the array to be returned
     * @param cols the number of columns in the array to be returned
     * @return an array containing the elements of vals in column-major order
     */
    public static int[][] fillColumnMajor(int[] vals, int rows, int cols)
    {
        //Create new 2D array
    	//Add elements from vals to 2D array in COLUMN-major order.
    	
    	int[][] mat = new int[rows][cols];
    	int index = 0;
    	
    	for (int col = 0; col < mat[0].length; col++) {
        	for (int row = 0; row < mat.length; row++) {
        		mat[row][col] = vals[index];
        		index++;
        	}
    	}
    	
    	return mat;
    }
    
    /**
     * Returns an array with the specified number of rows and columns that
     * contains the elements of vals in the order specified below. Elements
     * from vals are placed in the array by moving down the first column,
     * up the second column and so on.
     * 
     * For example, if vals was:
     * {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
     * 
     * rows was 3 and cols was 4,
     * the returned array would be:
     * { {1, 6, 7, 12},
     *   {2, 5, 8, 11},
     *   {3, 4, 9, 10} }
     * 
     * Precondition: vals.length == rows * cols
     * 
     * @param vals the elements
     * @param rows the number of rows in the array to be returned
     * @param cols the number of columns in the array to be returned
     * @return an array containing the elements from vals in the specified order
     */
    public static int[][] fillDownUp(int[] vals, int rows, int cols)
    {
    	int[][] mat = new int[rows][cols];
    	int index = 0;
    	
    	for (int col = 0; col < mat[0].length; col++) {
        	if (col % 2 == 0) {
        		for (int row = 0; row < mat.length; row++) {
            		mat[row][col] = vals[index];
            		index++;
            	}
        	} else {
        		for (int row = mat.length-1; row >= 0; row--) {
            		mat[row][col] = vals[index];
            		index++;
            	}
        	}
    	}
    	
    	return mat;
    }
}