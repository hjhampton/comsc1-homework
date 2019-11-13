import java.util.Scanner;

public class Main {
	public static void main (String []args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a name for your die:");
		String name = input.nextLine();

		System.out.println("Enter the number of faces on your die:");
		int maxValue = input.nextInt();

		Dice gary = new Dice(name, maxValue);

		System.out.println("Dice created!");
		gary.printName();
		gary.printMaxValue();

		gary.printRoll();
	}
}
