import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
	
	
	public static void main (String []args) {
		/* program can play rock paper scissors
		 * user inputs their choice
		 * computer randomly makes a choice
		 * rock beats scissors, scissors beat paper, paper beats rock
		 * best 2 out of 3 
		 */
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		int cpuChoice, userChoice, cpuWin, userWin;
		cpuWin = 0;
		userWin = 0;
		//cpuChoice = computer's randomly chosen number
		//userChoice = what the user inputs
		
		while (cpuWin < 2 && userWin < 2) {
		System.out.println("Let's play rock paper scissors!");
		System.out.println("Enter a number for your choice.");
		System.out.println("Rock(1) Paper(2) Scissors(3)");
		
		userChoice = keyboard.nextInt();
		
		cpuChoice =rand.nextInt(3) + 1;
		//Used Kam's notes from class for help with random
		
			
			System.out.println("Rock(1) Paper(2) Scissors(3)");
			System.out.println("You chose " + userChoice + "." + " I chose " + cpuChoice + ".");
			
	
			
		//regular mode 	
	
		
			
	if (userChoice == cpuChoice) {
			System.out.println("We tied.\r\n");
		}
		else if ( userChoice == 1 && cpuChoice == 2) {
			System.out.println("Paper beats rock, computer wins!\r\n");
			cpuWin++;
		}
		else if ( userChoice == 1 && cpuChoice == 3) {
			System.out.println("Rock beats scissors, you win...\r\n");
			userWin++;
		}
		else if ( userChoice == 2 && cpuChoice == 1) {
			System.out.println("Paper beats rock, you win...\r\n");
			userWin++;
		}
		else if ( userChoice == 2 && cpuChoice == 3) {
			System.out.println("Scissors beats paper, computer wins!\r\n");
			cpuWin++;
		}
		else if ( userChoice == 3 && cpuChoice == 1) {
			System.out.println("Rock beats Scissors, computer wins!\r\n");
			cpuWin++;
		}
		else if ( userChoice == 3 && cpuChoice == 2) {
			System.out.println("Scissors beats paper, you win...\r\n");
			userWin++;
		}
		else {
			System.out.println("Thats not a choice!\r\n");
			//for if the user enters something that isnt 1, 2, or 3
		}
		
	}
	if (cpuWin == 2) {
		System.out.println("computer wins");
	}
	if (userWin == 2) {
		System.out.println("you win!");
	}
	
		keyboard.close();		
	}

}