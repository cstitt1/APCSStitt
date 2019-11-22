package p7_2to7_6;

import java.util.*;

public class Purse {
	private ArrayList<String> coins;
	
	/**
	 * Constructs a purse object that contains the names of coins in an ArrayList.
	 */
	public Purse() {
		coins = new ArrayList<String>();
	}
	
	/**
	 * adds a coin to the purse
	 * @param coinName The name of the coin
	 * P7.2
	 */
	public void addCoin(String coinName) {
		coins.add(coinName);
	}
	
	/**
	 * returns the ArrayList in String form.
	 * P7.2
	 */
	public String toString() {
		return "Purse"+coins;
	}
	
	/**
	 * P7.3
	 */
	public void reverse() {
		for (int i=0; i<coins.size(); i++) {
			coins.set(0, coins.remove(coins.size()-1));
		}
	}
	
	/**
	 * Transfers the contents of one purse to another
	 * P7.4
	 * @param other The other purse
	 */
	public void transfer(Purse other) {
		int otherL = other.coins.size();
		
		for (int i=0; i<otherL; i++) {
			coins.add(other.coins.remove(0));
		}
	}
	
	/**
	 * Returns true if the two purses are exactly equal, false otherwise.
	 * @param other The other purse
	 * @return true if the two purses are exactly equal, false otherwise.
	 * P7.5
	 */
	public boolean sameContents(Purse other) {
		if (coins.size() != other.coins.size()) {
			return false;
		}
		
		for (int i=0; i<coins.size(); i++) {
			if (coins.get(i) != other.coins.get(i)) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Returns true if both purses contain the same coins, false otherwise.
	 * @param other The other purse
	 * @return true if both purses contain the same coins, false otherwise.
	 * P7.6
	 */
	public boolean sameCoins(Purse other) {
		if (coins.size() != other.coins.size()) {
			return false;
		}
		
		for (int i=0; i<coins.size(); i++) {
			if (!other.coins.contains(coins.get(0))) {
				return false;
			}
		}
		return true;
	}
}