
import java.util.Scanner;

public class LockerPuzzle {
	public static void main(String []args) {


		Scanner input = new Scanner(System.in);

		System.out.println("enter a locker number");

		int numberToFactor = input.nextInt();

		int numberOfFactors = 0;
	
		for (int i = 1; i <= numberToFactor; i++) {


			if (numberToFactor % i == 0) {
				System.out.print(i + " ");
				numberOfFactors++;

			}


		}

		if (!isEven(numberOfFactors)) {
			System.out.println("\nL" + numberToFactor + " is open");
		}
		else {
			System.out.println("\nL" + numberToFactor + " is closed");
		}
	}
//if the number of factors is odd, the locker is open
//if the number of factors is even, the locker is closed


	public static boolean isEven(int number) {

		if (number % 2 == 0) {
			return true;

		}

		return false;

//this tests if a number is even or not

	}


}
