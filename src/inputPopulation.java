import java.util.Scanner;

public class inputPopulation {
	public static void main(String args[]) {
		
/* 
 * Get user input for how many years forward they want to calculate the population
 * Store input in a variable
 * Print the result
 */
		int seconds, startingpop, birth, death, immigrant, growthRate, result;
		
			seconds = 365 * 24 * 60 * 60;
			birth = seconds / 7;
			death = seconds / 13;
			immigrant = seconds/ 45;
			startingpop = 312032486;
			
			growthRate = (birth - death + immigrant);
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Enter amount of years: ");
				int yearx = input.nextInt();
		
		for(int i = 1; i <= yearx; i++ ) {
			
			//used https://www.youtube.com/watch?v=rjkYAs6gAkk for help with for loops
			
		}
	
		result = (startingpop + (yearx * growthRate));
		
		System.out.println("the population after " + yearx + " years = " + result);
		input.close();
	}
}
