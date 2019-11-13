import java.util.Scanner;

public class HW9_2 {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a closing price:");
		double closing = input.nextDouble();
		
		System.out.println("Enter the current price:");
		double current = input.nextDouble();
		
		Stock Oracle = new Stock(closing, current);
		
		Oracle.getStockInfo();
		System.out.printf("Price-Change Percentage: %.2f" , Oracle.calculatePercentChange());
		System.out.print("%");
		//used https://stackoverflow.com/questions/7197078/printf-f-with-only-2-numbers-after-the-decimal-point
		//for help with decimal formatting
		
		
		
	}
}
