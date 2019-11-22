package p4_14;

import java.util.Scanner;

public class TimeIntervalTester {
	public static void main(String[] args) {
		System.out.println("Please enter the first time: ");
		Scanner answer = new Scanner(System.in);
		
		int time1 = answer.nextInt();
		System.out.println("Please enter the second time: ");
//		answer = new Scanner(System.in);
		
		int time2 = answer.nextInt();
		TimeInterval test = new TimeInterval(time1,time2);
		System.out.print(test.getHours()+" and ");
		System.out.println(test.getMinutes());
		
		answer.close();
	}
}
