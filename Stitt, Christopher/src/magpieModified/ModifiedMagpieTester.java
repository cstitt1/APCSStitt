package magpieModified;

public class ModifiedMagpieTester {

	public static void main(String[] args) {
		String str = "The cat ate the caterpillar climbing on the catwalk of the Cats musical";
		//            00000000001111111111222222222233333333334444444444555555555566666666667
		//            01234567890123456789012345678901234567890123456789012345678901234567890
		String keyword = "cat";
		
		ModifiedMagpie test = new ModifiedMagpie();
		System.out.println(test.findKeyword(str, keyword));
	}

}
