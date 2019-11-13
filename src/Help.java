import java.util.Random;

public class Help{

	public static void main(String []args){

		Random rand = new Random();

		int die1 = rand.nextInt(6) + 1;
		int die2 = rand.nextInt(6) + 1;

		int sum = 0; 
		sum = die1 + die2;
		System.out.println( sum );

		switch(sum){

		case 2: 
			System.out.println("you lost");
			break;
		case 3:
			System.out.println("you lost");
			break;
		case 12:
			System.out.println("you lost");
			break;
		case 7:
			System.out.println("you won");
			break;
		case 11:
			System.out.println("you won");
			break;
		default:
			System.out.println("keep trying");
			int point = sum;
			System.out.println("Try for a " + point);
			
			int die3 = rand.nextInt(6) + 1;
			int die4 = rand.nextInt(6) + 1;

			int sum2 = 0; 
			sum2 = die3 + die4;
			System.out.println( sum2 );

			if (sum2 == point){
				System.out.println("You win! ");
			}else{
				System.out.println("You lose...");
			}


		}
		

	}
} 
