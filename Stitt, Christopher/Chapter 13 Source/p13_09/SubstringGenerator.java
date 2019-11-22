package p13_09;

import java.util.ArrayList;

public class SubstringGenerator
{
	public static void main(String[] args)
	{
		System.out.println(getSubstrings("rum"));
	}

	public static ArrayList<String> getSubstrings(String x)
	{
		ArrayList<String> res = new ArrayList<String>();
		
		if (x.length() == 0) {
			res.add("");
			return res;
		}
		
		for (int ind=x.length(); ind>0; ind--) {
			res.add(x.substring(0, ind));
		}
		
		res.addAll(getSubstrings(x.substring(1, x.length())));
		
		return res;
	}
}