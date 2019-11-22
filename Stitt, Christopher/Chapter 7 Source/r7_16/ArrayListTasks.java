package r7_16;

import java.util.ArrayList;

public class ArrayListTasks {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(new Integer(18));
		nums.add(new Integer(17));
		nums.add(new Integer(16));
		System.out.println(nums);
		
		while (!nums.isEmpty()) {
			nums.remove(0);
		}
		
		System.out.println(nums);
	}

}
