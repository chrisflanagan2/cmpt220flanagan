package blackjack;
import java.util.Scanner;
public class Game {

	public static void main (String[] args) {
		
	//Game1 Game1 = new Game1();
	
		
	Scanner sc = new Scanner (System.in);
	Deck theDeck = new Deck(1, true);
	
	// Initialize player objects
	Player player = new Player ("Player");
	Player dealer = new Player ("Dealer");
	
	
	while(true) {
	player.getWager();
	player.addCard(theDeck.dealNextCard());
	dealer.addCard(theDeck.dealNextCard());
	player.addCard(theDeck.dealNextCard());
	dealer.addCard(theDeck.dealNextCard());
	
	// Print initial hands
	System.out.println("Cards are dealt\n");
	player.printHand(true);
	dealer.printHand(false);
	System.out.println("\n");
	
	// Shows when player is finished hitting
	boolean playerDone = false;
	boolean dealerDone = false;
	String ans;
	
		
	
	while (!playerDone || !dealerDone) {
		if (!playerDone) {
			System.out.print("Hit or stay (Enter H for hit, S for stay): ");
			ans = sc.next();
			System.out.println();
			
			// If player hits
			if (ans.compareToIgnoreCase("H") == 0) {
				// Add next card in deck and stores if player busted or not
				playerDone = !player.addCard(theDeck.dealNextCard());
				player.printHand(true);
			} else {
				playerDone = true;
			}
			
		}
	// Dealers turn
		if (!dealerDone) {
			// Dealer must hit if < 17
			if (dealer.getHandSum() < 17) {
				System.out.println("The dealer hits\n");
				dealerDone = !dealer.addCard(theDeck.dealNextCard());
				dealer.printHand(false);
			} else {
				System.out.print("The dealer stays\n");
				dealerDone = true;
			}
		}
		System.out.println();
	}
	
	// Print final hand
	player.printHand(true);
	dealer.printHand(true);
	
	int mySum = player.getHandSum();
	int dealerSum = dealer.getHandSum();
	
	if (mySum > dealerSum && mySum <= 21 || dealerSum > 21) {
		System.out.print("you win, you win $ " + player.wagerTotal() * 2);
	} else {
		System.out.println ("dealer wins, you lose $ "+ player.wagerTotal());
	}
	
	System.out.println(" would you like play again? \n type yes or no: ");
	String choice = sc.next();
	
	if (choice.equals("no")) {
		System.out.println("thankyou for playing!");
		break;
	}
	else {
		System.out.println("Good Luck\n");
	}
	
	}
	}
}
