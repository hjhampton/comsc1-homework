import java.util.Scanner;

public class CountToFour {
	public static void main (String []args) {
		
		
		
		Scanner cathy = new Scanner (System.in);
		
		
		
		System.out.println("Enter a starting number:");
		
		
		
		int number = cathy.nextInt();
		
		
		
		 for (int i = 0; i < 4; i++) {
			 number++;
			 System.out.println(number);
			//used https://www.youtube.com/watch?v=rjkYAs6gAkk for help
		 }
		
		cathy.close();
		
	}
}
