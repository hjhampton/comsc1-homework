import java.util.Random;

public class CrapsGame {
	public static void main (String []args) {
		
		introductionAndRules();
		decideWinOrLose();
		rollAgain();
		
	}
	//end of main method
	
	public static void introductionAndRules() {
		System.out.println("Welcome to Craps");
		System.out.println("Roll a pair of dice and add them together.\n"
				+ "If you roll a 7 or 11 you win.\n"
				+ "If you roll a 2, 3, or 11, you lose.\n"
				+ "If you get none of those values, you can roll again to try and duplicate your previous roll.\n"
				+ "If you duplicate your previous roll you win, if you roll a 7, you lose.");
	}
	
	public static int rollTheDice() {
		Random dice = new Random();
		int roll = dice.nextInt(6) + 1;
		return roll;
		
	}
	
	public static int getTheSum() {
		
		int die1, die2, sum;
		
			die1 = rollTheDice();
			die2 = rollTheDice();
			sum = die1 + die2;
			
		System.out.println(die1 + " + " + die2 + " = " + sum);
			
		return sum;
		
	}
	
	public static int decideWinOrLose() {
		int sum = getTheSum();
		int point = -1;
		
		switch(sum) {
		case 2:
			System.out.println("YOU LOSE");
			point = 0;
			return point;
		case 3:
			System.out.println("YOU LOSE");
			point = 0;
			return point;
		case 12:
			System.out.println("YOU LOSE");
			point = 0;
			return point;
			
		case 7:
			System.out.println("YOU WIN!");
			System.exit(0);
		case 11:
			System.out.println("YOU WIN!");
			System.exit(0);
		
		default:
			point = sum;
			System.out.println("Roll again... you need a " + point);
			return point;
		
		
		
		
		}
	}
	public static void rollAgain() {
		int point = decideWinOrLose();
			if (point == 0) {
				System.out.println("YOU LOSE");
			}else if (point == 1) {
				System.out.println("YOU WIN");
				System.exit(0);
			}else {
				System.out.println("Rolling again...");
				secondDecideWinOrLose(point);
			}
	}
	
	public static void secondDecideWinOrLose(int point) {
		boolean gameOver = false;
		
		while(gameOver == false) {
			
		
		 int sum = getTheSum();
		
		
		if (sum == point) {
			System.out.println("WINNER!");
			gameOver = true;
		}else if (sum == 7) {
			System.out.println("LOSER");
			gameOver = true;
		}else {
			System.out.println("try again");
		}
	}
	}
}
//end of class