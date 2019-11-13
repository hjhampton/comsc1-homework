import java.util.Random;
import java.util.Scanner;

public class pickaCardAnyCard {

	public static void main (String[]args) {

		Random rand = new Random();
		Scanner shuffle = new Scanner(System.in);

		int randomSuit, randomCard, cardPick, timesPlayed;
		String suit, card;

		timesPlayed = 0;
		
		System.out.println("shuffling... pick 3 cards. ");
		System.out.println("Press 1 to pick a card.");
		
		while (timesPlayed < 100) {
			cardPick = shuffle.nextInt();
		if (cardPick == 1) {
		

		randomSuit = rand.nextInt(4) + 1;
		randomCard = rand.nextInt(13) + 1;
		//used Kam's example for help

		switch (randomSuit) {
		case 1: suit = "Hearts";
		break;
		case 2: suit = "Spades";
		break;
		case 3: suit = "Diamonds";
		break;
		case 4: suit = "Clubs";
		break;
		default: suit = "Error";
		break;
		}

		switch (randomCard) {
		case 1: card = "Ace";
		timesPlayed++;
		break;
		case 11: card = "Jack";
		timesPlayed++;
		break;
		case 12: card = "Queen";
		timesPlayed++;
		break;
		case 13: card = "King";
		timesPlayed++;
		break;
		default: card = Integer.toString(randomCard);
		//used Kam's example for help
		timesPlayed++;
		break;
		}

		System.out.println("You drew a " + card + " of " + suit);

		}else {
			System.out.println("Error, try again...");
			cardPick = shuffle.nextInt();
		}
	
		
		}
	}
}
