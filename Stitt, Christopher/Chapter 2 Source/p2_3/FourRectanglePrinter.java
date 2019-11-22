//Java Concepts & Big Java 2.4 - 2.7:
package p2_3;
import java.awt.Rectangle;
public class FourRectanglePrinter {
	public static void main(String[] args) {
        Rectangle r = new Rectangle(0,0,10,20);
        System.out.println(r);
        int rw = (int) r.getWidth();
        int rh = (int) r.getHeight();
        r.translate(rw, 0);
        System.out.println(r);
        r.translate(0,-rh);
        System.out.println(r);
        r.translate(-rw,0);
        System.out.println(r);
    }
}
