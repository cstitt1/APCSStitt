package p3_4;

/**
 * A class that creates an Employee object with a name and starting salary,
 * and can increase the salary and return the salary and name of the employee.
 * @author cstit
 */
public class Employee {
	
	private String nm;
	private double sal;
	
	/**
	 * Constructs an employee object with a starting salary and a name.
	 */
	public Employee(String name, double startSal) {
		nm = name;
		sal = startSal;
	}
	
	/**
	 * Returns the name of the employee.
	 * @return nm The employee's name.
	 */
	public String getName() {
		return nm;
	}
	
	/**
	 * Returns the value of the salary.
	 * @return sal The salary of the employee.
	 */
	public double getSalary() {
		return sal;
	}
	
	/**
	 * Raises the salary of the employee by a specified percentage.
	 * @param percent The percent by which the salary is raised.
	 */
	public void raiseSalary(double percent) {
		sal *= (1+percent);
	}
}