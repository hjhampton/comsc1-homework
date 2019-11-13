import java.util.Scanner;

public class practice {

	public static void main (String []args) {
		
/*
 * write a program that reads the subtotal and the gratuity rate
 * then computes the gratuity and total	
 */
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Enter the subtotal and gratuity rate: ");
		
		double subtotal = input.nextDouble();
			System.out.println("You entered " + subtotal + " as a subtotal.");
		double gratuity = input.nextDouble();
		
		double gratuityPrint = (gratuity * 100);
			System.out.println("You entered " + gratuityPrint + "% as a gratuity rate.");
			
		double total = (subtotal * gratuity);
		double answer = (total + subtotal);
		
	System.out.println("The gratuity is " + total + " and the total is " + answer);
		
		
		
		
		
		input.close();
		
		
		
		
	}
}
