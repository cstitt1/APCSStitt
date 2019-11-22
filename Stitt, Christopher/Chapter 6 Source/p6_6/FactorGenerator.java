package p6_6;

public class FactorGenerator {
	private int nTF, fT;
	
	public FactorGenerator(int numberToFactor) {
		nTF = numberToFactor;
		fT = nTF;
	}
	
	/**
	 * Returns the next factor
	 * @return the next factor
	 */
	public int nextFactor() {
		for (int i=2; i<nTF; i++) {
			if (nTF % i == 0) {
				nTF /= i;
				return i;
			}
		}
		fT = nTF;
		return nTF;
	}
	
	/**
	 * Returns whether or not there are more factors
	 * @return if there are more factors
	 */
	public boolean hasMoreFactors() {
		FactorGenerator tst = new FactorGenerator(fT);
		if (tst.nextFactor()==fT) {
			return false;
		}
		return true;
	}
}
