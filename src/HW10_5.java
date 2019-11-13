import java.util.Scanner;

public class HW10_5 {

	public static void main(String[] args) {

		//Write a program that reads an integer and displays
		//all its smallest factors in decreasing order.

		Scanner input = new Scanner(System.in);
		int userChoice;
		StackOfIntegers hunter = new StackOfIntegers();

		hunter.calculateFactors();
		do {
			System.out.println("How would you like to print the factors?");
			System.out.println("(1) Ascending Order");
			System.out.println("(2) Descending Order");
			System.out.println("(3) Exit");

			userChoice = input.nextInt();
	

			switch (userChoice) {
			case 1:
				hunter.printFactors();
				break;
			case 2:
				hunter.printFactorsDescending();
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("That's not a choice!");
				break;
			}
		}while(userChoice != 1 || userChoice != 2);




	}
}
