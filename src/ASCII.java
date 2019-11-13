import java.util.Scanner;

public class ASCII {
	public static void main (String []args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an ASCII code: ");
			int ascii = keyboard.nextInt();
		
		
		System.out.println((char)ascii);
		//used https://stackoverflow.com/questions/7693994/how-to-convert-ascii-code-0-255-to-a-string-of-the-associated-character
		//for help
		
		//used https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
		//to check my work
		
		keyboard.close();
	}
}
