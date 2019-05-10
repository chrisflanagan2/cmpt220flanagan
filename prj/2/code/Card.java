package blackjack;

public class Card {
	private Suit mySuit;
	private int myNumber;
	
	
	public Card(Suit aSuit, int aNumber) {
		mySuit = aSuit;
		myNumber = aNumber;
	}
	
	// Returns number of card
	public int getNumber() {
		return myNumber;
	}
	
	// Returns name of card
	public String toString() {
		
		String[] numString = {"Ace","Two","Three","Four","Five","Six",
				"Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
			
		return numString[getNumber()] + " of " + mySuit.toString();
	}
}