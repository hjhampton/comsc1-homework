import java.util.Scanner;

public class TenThousandPrimes {
	public static void main(String[] args) {
	
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a maximum value:");
		
		int primeCounter, maximum;
		
			primeCounter = 0;
			
			maximum = keyboard.nextInt();
			
		for(int i = 2; i <= maximum; i++) {
			
			
			if(isPrime(i)) {
				primeCounter++;
			}
			
		}
		System.out.println("There are " + primeCounter + " prime numbers between 0 and " + maximum);
		keyboard.close();
		
	}
	
	public static boolean isPrime (int number) {
		
		  for(int divisor=2; divisor < number; divisor++){
	            if(number % divisor == 0){
	                return false;
	            }
	        }
	        return true; 
		
		//used https://stackoverflow.com/questions/22554373/javacounting-prime-numbers for help
	    //used https://github.com/maxalthoff/intro-to-java-exercises/blob/master/06/E6_10/E6_10.java for help
	}
	
}
