package p10_05;

public class Manager extends Employee{
	String department;
	
	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String toString() {
		return super.toString() + " and is a manager of " + department;
	}
}
