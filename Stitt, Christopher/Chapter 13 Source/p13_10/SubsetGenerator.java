package p13_10;

import java.util.ArrayList;

public class SubsetGenerator
{
	public static void main(String[] args)
	{
		System.out.println(getSubsets("rum"));
	}

	public static ArrayList<String> getSubsets(String x)
	{
		/*
		 * First letter of string + anything that could come after it
		 * Recursion via chop off first letter and repeat
		 */
		ArrayList<String> res = new ArrayList<String>();
		
		if (x.length() == 0) {
			res.add("");
			return res;
		}
		
		String firstLetter = x.substring(0, 1);
		
		for (int len=x.length()-1; len>=0; len--)
			for (int ind = 1; ind<x.length()-(len-1); ind++)
				if (res.contains(firstLetter+x.substring(ind, ind+len)) == false)
					res.add(firstLetter+x.substring(ind, ind+len));
				
		res.addAll(getSubsets(x.substring(1, x.length())));
		
		return res;
	}
}