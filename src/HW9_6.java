import java.util.Scanner;

public class HW9_6 {
	public static void main (String []args) {
		
		Scanner input = new Scanner(System.in);
		Stopwatch timer = new Stopwatch();
		
		System.out.println("Press any key to start the timer");
		input.nextInt();
		timer.startTimer();
		
		System.out.println("Timer started, press any key to stop.");
		input.nextInt();
		timer.endTimer();
		
		timer.calculateElapsed();
		
		input.close();
		
		
	}
	
}
