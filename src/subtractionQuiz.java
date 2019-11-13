import java.util.Scanner;
import java.util.Random;

public class subtractionQuiz {
	public static void main (String []args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		Random rand = new Random();
	
		
		int first = rand.nextInt(100);
		int second = rand.nextInt(100);
		
		//used https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java for help

		System.out.println("Solve this problem: " + first + " - " + second);
		
		int answer, input;
		answer = (first - second);
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
