//Java Concepts & Big Java 2.4 - 2.7:
package p2_9;
public class ReplaceTester {
	public static void main(String[] args) {
        String tst = "Mississippi";
        tst = tst.replace("i", "!");
        tst = tst.replace("s", "$");
        System.out.println("Expected output: M!$$!$$!pp!");
        System.out.println("Output: " + tst);
    }
}
