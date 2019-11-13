
import java.util.Scanner;
//https://github.com/maxalthoff/intro-to-java-exercises/blob/master/06/E6_22/E6_22.java
public class excercise6dot22 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long entry = input.nextLong();

		System.out.println(sqrt(entry) + " is the approximate square root");
	}

	public static double sqrt(long n) {
		final double EPSILON = 0.0001;
		double lastGuess = 1.0;
		double nextGuess;
		while (true) {
			nextGuess = (lastGuess + n / lastGuess) / 2;
			if (Math.abs(nextGuess - lastGuess) < EPSILON) {
				return nextGuess;
			} else {
				lastGuess = nextGuess;
			}
		}
	}
}

