package p10_06;

public class WorkerTester {
	public static void main(String[] args) {
		HourlyWorker test1 = new HourlyWorker("Jack", 200);
		SalariedWorker test2 = new SalariedWorker("Dylan", 350);
		
		System.out.println(test1.getName());
		System.out.println(test1.getSal());
		System.out.println(test1.computePay(30));
		System.out.println(test1.computePay(50));
		
		System.out.println();
		
		System.out.println(test2.getName());
		System.out.println(test2.getSal());
		System.out.println(test2.computePay(30));
		System.out.println(test2.computePay(50));
	}
}
