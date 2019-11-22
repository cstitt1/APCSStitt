package pumpkinChucker;

public class CannonLimitTester {
	public void keyPressed() {
		char key = 0; // Random number for purpose of test
		int xA = 0; //Assuming xA is on left edge of left rectangle
		int xB = 0; //Assuming xB is on left edge of right rectangle
		final int LEFT = 0; // Random number for purpose of test
		final int RIGHT = 1; // Random number for purpose of test
		final int CONTROL = 2; // Random number for purpose of test
		int keyCode = 0; // Random number for purpose of test
		int rectWidth = 0; //Represents width of cannon; random number for purpose of test
		int limitRectA = 250; // Right-hand limit for left cannon
		int limitRectB = 750; // Left-hand limit for right cannon
		
		if (key == 'a' && xA != 0)
			xA--; // Move left
		else if (key == 'd' && xA+rectWidth != limitRectA)
			xA++; // Move right
		
		if (keyCode == LEFT && xB != limitRectB)
			xB--; // Move left
		else if (keyCode == RIGHT && xB+rectWidth != 1000)
			xB++; // Move right
		else if (keyCode == CONTROL) {
		}
	}
}