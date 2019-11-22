//Java Concepts & Big Java 2.4 - 2.7:
package p2_2;
import java.awt.Rectangle;
public class PerimeterTester {
	public static void main(String[] args) {
        Rectangle r = new Rectangle(0,0,10,20);
        int per = (int) ((2*r.getHeight()) + (2*r.getWidth()));
        System.out.println("Expected Output: 60");
        System.out.println("Output:" + per);
    }
}
