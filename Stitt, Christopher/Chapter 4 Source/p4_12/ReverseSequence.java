package p4_12;

public class ReverseSequence {
	public static void main(String[] args) {
		ReverseSequence tst = new ReverseSequence();
		System.out.println(tst.getRS(12345));
	}
	
	public String getRS(int val) {
		String lst = Integer.toString(val);
		int lstlen = lst.length();
		String res = "";
		for (int i=lstlen-1; i>=0; i--) {
			res += lst.substring(i, i+1) + "\n";
		}
		return res;
	}
}
