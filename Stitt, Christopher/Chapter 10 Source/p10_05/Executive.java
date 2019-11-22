package p10_05;

public class Executive extends Manager{
	private int bonus;
	
	public Executive(String name, int salary, String department, int bonus) {
		super(name, salary, department);
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public String toString() {
		return super.toString() + " and has a bonus, since he is an executive, of $" + bonus;
	}
}
