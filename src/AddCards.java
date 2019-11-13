import java.util.Random;

public class AddCards {
	public static void main(String[] args) {

	
		Random rand = new Random();
		
		String suitType[] = {"Hearts", "Diamonds", "Spades", "Clubs"};
		int sumOfCards[] = new int [4];
		int sum = 0;
		
		
		
		for (int i = 0; i < sumOfCards.length; i++) {
			
			int suitPicker = rand.nextInt(suitType.length);
			sumOfCards[i] = rand.nextInt(13) + 1;
			
			System.out.println(sumOfCards[i] + " of " + suitType[suitPicker]);
			
			sum += sumOfCards[i];
			//used https://www.youtube.com/watch?v=etyrkipdKvc&list=PLFE2CE09D83EE3E28&index=29&pbjreload=10
			//for help with adding array values.
			
		}
		
		System.out.println("The sum of your cards is "  + sum);
		
		
	}

}
