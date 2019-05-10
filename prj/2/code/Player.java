package blackjack;

import java.util.Scanner;

public class Player {
	
	// Players Name
	private String name;
	private Card[] hand = new Card[10];
	// Number of cards currently in hand
	private int numCards;
	private int totalWager;
	private int maxCardNum = 10;
	
	
	public Player(String aName) {
		name = aName;
		emptyHand();
	}
	
	public void emptyHand() {
		for (int c=0; c<10; c++) {
			hand[c]=null;
		}
		numCards = 0;
	}
	// Checks if the sum of new hand is below or equal to 21
	public boolean addCard(Card aCard) {
		
		// Prints error if we already have max number of cards
		if (numCards == maxCardNum) {
			System.err.printf("%s's, hand already has 10 cards; " + "cannot add another card\n" , this.name);
			System.exit(1);
		}
		hand[numCards] = aCard;
		numCards++;
		
		return (getHandSum() <=21);
		}
	
	public int wagerTotal() {
		return totalWager;
	}
	public int getWager() {
		Scanner wager = new Scanner(System.in);
		System.out.print("How much would you like to wager on this hand? ");
		//System.out.print(" ");
		int wagerAmount = wager.nextInt();
		System.out.println(wagerAmount);
		totalWager += wagerAmount;
		return totalWager;
		}
	
	// Gets sum of cards in player's hand
	public int getHandSum() {
		int handSum = 0;
		int cardNum;
		int numAces = 0;
		
		// Calculates each card's value to the total hand sum
		for (int c=0; c< numCards; c++) {
			// Gets number of each card
			cardNum = hand[c].getNumber();
			if (cardNum ==1) { // Ace
				numAces++;
				handSum+=11;
			} else if (cardNum > 10) { // Face card
				handSum += 10;
			} else {
				handSum += cardNum;		
			}
		}
		// If Aces and sum is > 21  set some or all of them to value 1
		while (handSum > 21 && numAces > 0) {
			handSum -= 10; 
			numAces --;
		}
		return handSum;
	}
	// Prints cards in players hand
	// showFirstHand shows if the first card is hidden or not
	public void printHand(boolean showFirstCard) {
		 System.out.printf("%s's cards:\n", name);
		 for (int c=0; c<numCards; c++) {
			 if (c==0 && !showFirstCard) {
				 System.out.printf("   [face down]");
			 } else {
				 System.out.printf("   %s\n", hand[c].toString());
				 
			 }
		 }
	}
}

