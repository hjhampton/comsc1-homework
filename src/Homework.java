import java.util.Random;

public class Homework {

	public static void main(String[] args) {
		
		boolean allSuitsPicked = false;
		int diamondSuitPicked = 0;
		int heartSuitPicked = 0;
		int spadeSuitPicked = 0;
		int clubSuitPicked = 0;
		int timesPlayed = diamondSuitPicked + heartSuitPicked + spadeSuitPicked + clubSuitPicked;
		
		
	
		Random rand = new Random();
		
		
		
		String suitType[] = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String cardType[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
			
	do	{
		
	
		int suitPicker = rand.nextInt(suitType.length);
		int cardPicker = rand.nextInt(cardType.length);
		
		if (suitPicker == 0) {
			heartSuitPicked++;
		}if (suitPicker == 1) {
			diamondSuitPicked++;
		}if (suitPicker == 2) {
			spadeSuitPicked++;
		}if (suitPicker == 3) {
			clubSuitPicked++;
		}
		
		
		if (diamondSuitPicked >= 1 && heartSuitPicked >= 1 && spadeSuitPicked >= 1 && clubSuitPicked >= 1) {
			allSuitsPicked = true;
		}
		
		
		
		System.out.println("You drew a " + cardType[cardPicker] + " of " + suitType[suitPicker]);
		timesPlayed++;
	
		
		
		
		}while(!allSuitsPicked);
	System.out.println("You drew " + timesPlayed + " times.");
	}


	
}
