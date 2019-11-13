import java.util.Scanner;
// allows for keyboard input
// help from https://www.youtube.com/watch?v=5DdacOkrTgo
// help from https://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed

public class feetToMeters {

	public static void main (String args[]) {
		
/* User inputs feet value
 * Store feet value in decimal form
 * Take feet value and multiply by 0.305
 * Output meters value
 */
		
	Scanner input = new Scanner(System.in);
	double feet, meters, factor;
	
	factor = 0.305;
   /* sets the conversion factor
	* storing the factor as a variable allows for this program to be quickly changed
	* for any type of conversion
	*/
	
		System.out.println("Enter feet value for conversion:");
		feet = input.nextDouble();
		// stores the user's input as the double variable "feet"
		
		meters = (feet * factor);
		
		System.out.println(feet + " feet is equal to " + meters + " meters.");
		
		input.close();
	
	}
}
