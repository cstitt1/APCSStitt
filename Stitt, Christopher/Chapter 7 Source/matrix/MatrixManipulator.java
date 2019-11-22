package matrix;

/**
 * Offers the specified operations on integer matrices.
 */
public class MatrixManipulator
{
	/**
	 * Determines if (first + second) is defined where + indicates matrix addition.
	 * 
	 * @return true if matrix addition is defined, false otherwise.
	 */
	public static boolean addable(int[][] first, int[][] second)
	{
		if (atLeastOneByOne(first) && atLeastOneByOne(second)) {
			return (first.length == second.length && first[0].length == second[0].length);
		}
		return false;
	}

	/**
	 * Performs (first + second) where + indicates matrix addition. (Precondition: addable(first, second) returns true.)
	 * 
	 * @return the result of first + second.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] add(int[][] first, int[][] second)
	{
		int[][] sum = new int[first.length][first[0].length];
		
		if (!addable(first,second)) {
			throw new IllegalArgumentException();
		}
		
		for (int r=0; r<sum.length; r++) {
			for (int c=0; c<sum[0].length; c++) {
				sum[r][c] = first[r][c] + second[r][c];
			}
		}
		
		return sum;
	}

	/**
	 * Performs (scalar * matrix) where * indicates scalar multiplication of a matrix. (Precondition: matrix.length > 0 && matrix[0].length > 0)
	 * 
	 * @return the result of scalar * matrix.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] multiplyByScalar(int scalar, int[][] matrix)
	{
		if (!(matrix.length > 0 && matrix[0].length > 0)) {
			throw new IllegalArgumentException();
		}
		
		int[][] matNew = new int[matrix.length][matrix[0].length];
		
		for (int r = 0; r < matrix.length; r++) {
			for (int c=0; c<matrix[r].length; c++) {
				matNew[r][c] = matrix[r][c] * scalar;
			}
		}
		
		return matNew;
	}

	/**
	 * Multiplies the specified row of first and the specified column of second. (Precondition: first[row].length > 0 && first[row].length == second.length)
	 * 
	 * @return the result of multipliying the specified row and column.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int multiply(int[][] first, int row, int[][] second, int col)
	{
		if (!(first[row].length > 0 && first[row].length == second.length)) {
			throw new IllegalArgumentException();
		}
		
		int sum = 0;
		
		for (int cr = 0; cr < second.length; cr++) {
			sum += (first[row][cr] * second[cr][col]);
		}
		
		return sum;
	}

	/**
	 * Determines if (first * second) is defined where * indicates matrix multiplication.
	 * 
	 * @return true if matrix multiplication is defined, false otherwise.
	 */
	public static boolean multipliable(int[][] first, int[][] second)
	{
		if (second.length == first[0].length) {
			return true;
		}
		
		return false;
	}

	/**
	 * Performs (first * second) where * indicates matrix multiplication. (Precondition: multipliable(first, second) returns true.)
	 * 
	 * @return the result of first * second.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] multiply(int[][] first, int[][] second)
	{
		if (!(multipliable(first, second)))
			throw new IllegalArgumentException();
		
		int[][] res = new int[first.length][second[0].length];
		
		for (int r=0; r<res.length; r++) {
			for (int c=0; c<res[0].length; c++) {
				res[r][c] = multiply(first, r, second, c);
			}
		}
		
		return res;
	}

	private static boolean atLeastOneByOne(int[][] matrix)
	{
		return matrix != null && matrix.length > 0 && matrix[0].length > 0;
	}
}