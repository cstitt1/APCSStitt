package p9_02;

import shared.Measurable;

public class Quiz implements Measurable{
	private double score;
	private String letterGrade;
	
	public Quiz(double scr, String letter) {
		score = scr;
		letterGrade = letter;
	}
	
	public double getMeasure() {
		return score;
	}
	
	public String getLetter() {
		return letterGrade;
	}
}
