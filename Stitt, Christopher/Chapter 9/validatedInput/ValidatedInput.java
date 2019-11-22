package validatedInput;

import java.util.Scanner;

public class ValidatedInput
{
	private Scanner scan = new Scanner(System.in);;
	
	// prompt is validator.prompt(), error on invalid input is validator.error()
	// validity check is validator.isValid(...)
	// continues prompting and displaying error until valid input is obtained
	// returns valid input
	public int getInt(Validator<Integer> validator)
	{
		System.out.println(validator.prompt());
		String nxt = scan.nextLine();
		
		while(!validator.isValid(nxt)) {
			System.out.println(validator.error());
			System.out.println(validator.prompt());
			nxt = scan.nextLine();
		}
		
		return Integer.parseInt(nxt);
	}
	
	// same as above
	// accepts any integer as valid input
	// hint: use AnyIntegerValidator with the above method
	public int getInt()
	{
		return this.getInt(new AnyIntegerValidator());
	}

	// same as above
	// accepts any integer x such that: min <= x <= max
	// precondition: min <= max
	// hint: define a class IntegerRangeValidator to use with the first method
	public int getInt(int min, int max)
	{
		return this.getInt(new IntegerRangeValidator(min, max));
	}
	
	public int getInt(boolean prime) {
		return this.getInt(new PrimeValidator(prime));
	}
}
