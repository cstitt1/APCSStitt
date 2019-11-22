package p9_09;

/**
 * Computes the average of a set of data values.
 */
public class DataSet
{
	private double sum;
	private Comparable maximum, minimum;
	private int count;

	/**
	 * Constructs an empty data set.
	 */
	public DataSet()
	{
		count = 0;
		maximum = null;
		minimum = null;
	}

	/**
	 * Adds a data value to the data set.
	 * 
	 * @param x
	 *            a data value
	 */
	
	public void add(Comparable x)
	{
		if (count == 0 || maximum.compareTo(x)<0)
			maximum = x;
		if (count == 0 || minimum.compareTo(x)>0)
			minimum = x;
		count++;
	}

	/**
	 * Gets the largest of the added data.
	 * 
	 * @return the maximum or 0 if no data has been added
	 */
	public Comparable getMaximum()
	{
		return maximum;
	}
	
	public Comparable getMinimum() {
		return minimum;
	}
}