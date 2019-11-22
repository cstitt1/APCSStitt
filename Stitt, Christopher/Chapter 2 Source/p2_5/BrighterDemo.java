//Java Concepts & Big Java 2.8 - 2.10:
package p2_5;
import java.awt.Color;
public class BrighterDemo {
	public static void main(String[] args) {
		Color col = new Color(50,100,250);
		System.out.println(col);
		col = col.brighter();
		System.out.println(col);
	}
}