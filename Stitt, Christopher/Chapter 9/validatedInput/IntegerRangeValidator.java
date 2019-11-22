package validatedInput;

public class IntegerRangeValidator implements Validator<Integer>{
	private int max, min;
	
	public String error()
	{
		return "Input is not an integer between " + min + " and "+ max + ".";
	}

	public String prompt()
	{
		return "Enter an integer between " + min + " and "+ max + ".";
	}

	public IntegerRangeValidator(int minimum, int maximum) {
		max = maximum;
		min = minimum;
	}
	
	public boolean isValid(String value)
	{
		try
		{
			int tst = Integer.parseInt(value);
			if (tst >= min && tst <= max)
				return true;
			else
				return false;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}
}
