package deckCreation;

import java.util.ArrayList;

public class Deck {
	private ArrayList<String> deck;
	
	public Deck() {
		deck = new ArrayList<String>();
		String[] suit = {"C", "D", "H", "S"};
		String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		for (int i=0; i<suit.length; i++) {
			for (int j=0; j<num.length; j++) {
				deck.add(num[j] + suit[i]);
			}
		}
	}
	
	public void shuffle() {
		ArrayList<String> shuffled = new ArrayList<String>();
		
		while (deck.size() > 0) {
			int r = (int) (Math.random() * deck.size());
			shuffled.add(deck.remove(r));
		}
		
		deck = shuffled;
	}
	
	public void perfectShuffle() {
		ArrayList<String> shuffled = new ArrayList<String>();
		
		for (int i=0; i< deck.size()/2; i++) {
			shuffled.add(deck.get(i));
			shuffled.add(deck.get(i+deck.size()/2));
		}
		
		deck = shuffled;
	}
	
	public void selectionShuffle() {
		for (int i=0; i<deck.size()-1; i++) {
			int r = (int) ((Math.random()*(deck.size()-i)) + i);
			deck.set(i, deck.set(r, deck.get(i)));
		}
	}
	
	public boolean containsJQK(String[] hand) {
		boolean j = false, q = false, k = false;
		for (int i=0; i<hand.length; i++)
			if (hand[i].contains("J"))
				j = true;
			else if (hand[i].contains("Q"))
				q = true;
			else if (hand[i].contains("K"))
				k = true;
		return j && q && k;
	}
	
	public boolean containsPairSum11(String[] hand) {
		int val1=0, val2=0;
		
		if (containsJQK(hand) || hand[0].contains("10"))
			val1 = 10;
		
		for (int i=0; i<hand.length; i++) {
			if (val1 == 0)
				if (hand[i].charAt(0) == 'A')
					val1 = 1;
				else
					val1 = Integer.getInteger(hand[i].substring(0, 1));
			
		}
		
		return false;
	}
}