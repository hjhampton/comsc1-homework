import java.util.Scanner;
import java.util.Random;

public class addThree {
	public static void main (String []args) {

		Scanner keyboard = new Scanner(System.in);
		
		Random rand = new Random();
	
		int first = rand.nextInt(10);
		int second = rand.nextInt(10);
		int third = rand.nextInt(10);
		//used https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java for help

		System.out.println("Solve this problem. " + first + " + " + second + " + " + third);
		
		int answer, input;
		answer = (first + second + third);
		input = keyboard.nextInt();
		
		
		while (input != answer) {
			System.out.println("Try again...");
			input =keyboard.nextInt();
		}
		//used https://www.dummies.com/programming/java/repeat-instructions-java-while-statements/ for help
		//loops the program until the correct answer is entered
				if (input == answer) {
						System.out.println("Correct!");
				
					}
		
				if (input != answer) {
						System.out.println("Incorrect.");
					
					}
				//used https://codingbat.com/doc/java-if-boolean-logic.html for help
		
		keyboard.close();	
		
	}
}
