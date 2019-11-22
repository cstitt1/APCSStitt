package p3_8;
public class LetterTester {
	public static void main(String[] args) {
		Letter tst = new Letter("Mary", "John");
		tst.addLine("I am sorry we must part.");
		tst.addLine("I wish you all the best.");
		System.out.println(tst.getText());
	}
}