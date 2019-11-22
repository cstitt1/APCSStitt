package p7_12;

import junit.framework.TestCase;

public class MagicSquaresTest extends TestCase {
	
	public void testIsMagic() {
		MagicSquares tst = new MagicSquares();
		tst.add(2);
		tst.add(7);
		tst.add(6);
		tst.add(9);
		tst.add(5);
		tst.add(1);
		tst.add(4);
		tst.add(3);
		tst.add(8);
		assertTrue(tst.isMagic());
		
		tst = new MagicSquares();
		tst.add(4);
		tst.add(9);
		tst.add(2);
		tst.add(3);
		tst.add(5);
		tst.add(7);
		tst.add(8);
		tst.add(1);
		tst.add(6);
		assertTrue(tst.isMagic());
	}
}
