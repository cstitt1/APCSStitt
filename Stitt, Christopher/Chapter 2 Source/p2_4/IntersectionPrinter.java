//Java Concepts & Big Java 2.4 - 2.7:
package p2_4;
import java.awt.Rectangle;
public class IntersectionPrinter {
	public static void main(String[] args) {
        //Intersection.
        Rectangle r1 = new Rectangle(0,0,10,10), r2 = new Rectangle(5,5,20,20);
        System.out.println(r1);
        System.out.println(r2);
        Rectangle r3 = r1.intersection(r2);
        System.out.println(r3);
        //No intersect.
        Rectangle r1p = new Rectangle(0,0,10,10), r2p = new Rectangle(20,20,5,5);
        System.out.println(r1p);
        System.out.println(r2p);
        Rectangle r3p = r1p.intersection(r2p);
        System.out.println(r3p);
    }
}
