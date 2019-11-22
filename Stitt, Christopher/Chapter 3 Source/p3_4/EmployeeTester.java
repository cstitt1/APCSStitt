package p3_4;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee carl = new Employee("Carl", 15);
		System.out.println(carl.getName());
		System.out.println(carl.getSalary());
		carl.raiseSalary(.20);
		System.out.println(carl.getSalary());
	}
}