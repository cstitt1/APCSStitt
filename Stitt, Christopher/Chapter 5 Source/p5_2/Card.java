package p5_2;

public class Card {
	private String notep1, notep2;
	
	public Card (String notation) {
		notep1 = notation.substring(0, 1);
		notep2 = notation.substring(1);
	}
	
	public String getDescrription() {
		String res = "";
		switch (notep1) {
		case "A": res += notep1+" of "; break;
		case "2": res += notep1+" of "; break;
		case "3": res += notep1+" of "; break;
		case "4": res += notep1+" of "; break;
		case "5": res += notep1+" of "; break;
		case "6": res += notep1+" of "; break;
		case "7": res += notep1+" of "; break;
		case "8": res += notep1+" of "; break;
		case "9": res += notep1+" of "; break;
		case "10": res += notep1+" of "; break;
		case "J": res += notep1+" of "; break;
		case "Q": res += notep1+" of "; break;
		case "K": res += notep1+" of "; break;
		default: res += "~";
		}
		
		switch (notep2) {
		case "D": res+= "Diamonds"; break;
		case "H": res+= "Hearts"; break;
		case "S": res+= "Spades"; break;
		case "C": res+= "Clubs"; break;
		default: res+= "~";
		}
		
		if (res.contains("~")) {
			return "Unknown";
		}
		
		return res;
	}
}