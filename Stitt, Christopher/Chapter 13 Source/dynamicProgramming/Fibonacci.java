package dynamicProgramming;

import java.util.ArrayList;

public class Fibonacci {

	private ArrayList<Integer> res;
	
	public Fibonacci() {
		res = new ArrayList<Integer>();
		res.add(0);
		res.add(1);
	}
	
	public int fib(int n) {
		if (n<=1) {
			return res.get(n);
		}
		
		if (res.size() > n) {
			return res.get(n);
		}
		
		res.add(fib(n-1) + fib(n-2));
		return res.get(n);
	}
}