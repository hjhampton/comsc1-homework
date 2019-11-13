import java.util.Scanner;
import java.util.Random;

public class ifStatement {
	public static void main (String []args) {
		
		/*
		 * Make a simple addition quiz that asks the user to sum two single digit integers
		 *  and then tells them if they were correct or not.
		 *  
		 *  Need to store an answer for an addition problem
		 *  Print out an addition problem using 2 random numbers
		 *  Get user input
		 *  Store input in an int variable
		 *  Print out if the user is correct or incorrect
		 *  Rerun the program if the answer is incorrect
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		Random rand = new Random();
	
		
		int first = rand.nextInt(9);
		int second = rand.nextInt(9);
		
		//used https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java for help

		System.out.println("Solve this problem. " + first + " + " + second);
		
		int answer, input;
		answer = (first + second);
		input = keyboard.nextInt();
		
		
		while (input != answer) {
			System.out.println("Try again...");
			input =keyboard.nextInt();
		}
		//used https://www.dummies.com/programming/java/repeat-instructions-java-while-statements/ for help
				if (input == answer) {
						System.out.println("Correct!");
				
					}
		
				if (input != answer) {
						System.out.println("Incorrect.");
					
					}
				
				while (input != answer) {
					System.out.println("Try again...");
					input =keyboard.nextInt();
				}
				//used https://codingbat.com/doc/java-if-boolean-logic.html for help
		
		keyboard.close();	
		
	}
}
