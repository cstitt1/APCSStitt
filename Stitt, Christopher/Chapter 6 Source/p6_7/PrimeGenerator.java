package p6_7;

public class PrimeGenerator {
	private int tst;
	
	public PrimeGenerator() {
		tst = 2;
	}
	
	public boolean nextPrime() {
		boolean prime = true;
		for (int i=2; i<tst; i++) {
			if (tst % i == 0) {
				prime = false;
			}
		}
		
		tst++;
		return prime;
	}
}
