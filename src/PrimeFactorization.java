import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		 
		 //Write a program that reads an integer and displays
		 //all its smallest factors in increasing order.
		 
		int counter = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an Integer:");
		int number = keyboard.nextInt();
	

	      for(int i = 2; i < number; i++) {
	         while(number % i == 0) {
	            System.out.print(i + " ");
	            number = number / i;
	         }
	      }
	      if(number > 2) {
	         System.out.println(number);
	         
	      }
	      
	      
	      
		//copied from https://www.tutorialspoint.com/Prime-factors-in-java
	      keyboard.close();
		
	}
}
