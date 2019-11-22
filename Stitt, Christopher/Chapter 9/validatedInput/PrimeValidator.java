package validatedInput;

public class PrimeValidator implements Validator<Integer> {
	private boolean prime;
	
	public String error()
	{
		return "Input is not a prime integer.";
	}

	public String prompt()
	{
		return "Enter a prime integer.";
	}
	
	public PrimeValidator(boolean prime) {
		this.prime = prime;
	}
	
	public boolean isValid(String value)
	{
		try
		{
			int tst = Integer.parseInt(value);
			for (int i=2; i<tst; i++) {
				if (tst % i == 0)
					if (prime == true)
						return false;
					else
						return true;
			}
			if (prime == true)
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
