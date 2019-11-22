package myArrayList;

import java.util.ArrayList;
import java.util.Random;

public class MymALTest {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		Random rand = new Random();
		MyArrayList<Integer> a = new MyArrayList<Integer>(25);
		ArrayList<Integer> j = new ArrayList<Integer>(25);
		for (int i=0; i < 100000; i++) {
			try {
				int addValue = rand.nextInt(100);
				System.out.println(i + " add(" + addValue + ")");
				a.add(addValue);
				j.add(addValue);
				System.out.println();
			} catch (Exception e) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(a.size());
		System.out.println(j.size());
		System.out.println("End");
		
	}
	
}