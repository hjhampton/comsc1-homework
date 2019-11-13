import java.util.Scanner;

public class poundsToKilograms {
	
	/* User inputs pounds value
	 * Store value in decimal form
	 * Take pound value and multiply by 0.454
	 * Output kilograms value
	 */
	
	public static void main (String args[]) {
			
	Scanner input = new Scanner(System.in);
	double pounds, kilograms, factor;
	
	factor = 0.454;

		System.out.println("Enter pounds value for conversion:");
		pounds = input.nextDouble();
		
		kilograms = (pounds * factor);
		
		System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
		
		input.close();
	}
}
