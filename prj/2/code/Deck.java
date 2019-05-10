package blackjack;
import java.util.Random;

public class Deck {
	
	// Array of cards, first index is first card in deck
	private Card[] myCards;
	// Number of cards in the deck currently
	private int numCards;
	
	// Defines one deck without shuffling
	public Deck() {
		this(1, false);
	}
	// Number of decks and whether the deck is shuffled or not
	public Deck(int numDecks, boolean shuffle) {
		int c = 0;
		numCards = numDecks * 52;
		myCards = new Card[numCards];
		
		
		
			// Each Suit
			for (int s=0; s<4; s++) {
				// Each number
				for ( int n=1; n <=13; n++) {
				//adds new card to the deck
				this.myCards[c] = new Card(Suit.values()[s], n);
				c++;
				}
			}
		//}
		if (shuffle) {
			this.shuffle();
		}
	}
	
	// Uses random number generator, swaps random cards
	public void shuffle() {

		Random rng = new Random();
		
		//temporary card
		Card tempCard;
		int j;
		for (int i=0; i< this.numCards; i++) {
			
			// Gets a random j to swap values with i
			j = rng.nextInt(this.numCards);
			
			// Swaps cards
			tempCard = this.myCards[i];
			this.myCards[i] = this.myCards[j];
			this.myCards[j] = tempCard;
		}
	}

	public Card dealNextCard() {
		
		// Gets top card in deck
		Card top = this.myCards[0];
		
		// Shifts all next cards in deck to the left one index
		for (int c = 1; c < this.numCards; c++) {
			this.myCards [c-1] = this.myCards[c];
		}
		this.myCards[this.numCards-1] = null;
		
		// Decrements number of cards in deck
		this.numCards--;
		return top;		
	}
	
	public void printDeck(int numToPrint) {
		for(int c=0; c<numToPrint; c++) {
			System.out.printf("%3d/%d %s\n", c+1, this.numCards, this.myCards[c].toString());
		}
		System.out.printf("\t\t[%d other]\n", this.numCards-numToPrint);
	}
	
}
