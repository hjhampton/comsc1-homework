import java.util.Scanner;

public class HW10_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for milliseconds");
		int userMilliseconds = input.nextInt();

		Time clock = new Time(userMilliseconds);
		
		clock.displayTime();

	}

}
