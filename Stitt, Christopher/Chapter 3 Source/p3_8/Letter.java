package p3_8;
public class Letter {
	private String fL, tL, bod;
	public Letter(String from, String to) {
		fL = ("Sincerely,"+"\n"+from);
		tL = "Dear "+to+":"+"\n";
		bod = "";
	}
	public void addLine(String line) {
		bod = bod.concat(line).concat("\n");
	}
	public String getText() {
		return tL+bod+fL;
	}
}