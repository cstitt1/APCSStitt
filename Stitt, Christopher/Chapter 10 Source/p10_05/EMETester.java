package p10_05;

public class EMETester {

	public static void main(String[] args) {
		Employee test1 = new Employee("Robert", 100);
		Manager test2 = new Manager("Jack", 200, "Logistics");
		Executive test3 = new Executive("Dylan", 350, "Logistics", 50);
		
		System.out.println(test1);
		System.out.println(test1.toString());
		System.out.println(test1.getName());
		System.out.println(test1.getSalary());
		
		System.out.println();
		
		System.out.println(test2);
		System.out.println(test2.toString());
		System.out.println(test2.getName());
		System.out.println(test2.getSalary());
		System.out.println(test2.getDepartment());
		
		System.out.println();
		
		System.out.println(test3);
		System.out.println(test3.toString());
		System.out.println(test3.getName());
		System.out.println(test3.getSalary());
		System.out.println(test3.getDepartment());
		System.out.println(test3.getBonus());
	}
}