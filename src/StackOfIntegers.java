import java.util.*;

public class StackOfIntegers {

	ArrayList<Integer> primeFactors = new ArrayList<Integer>(0);
	// got help from https://www.geeksforgeeks.org/arraylist-in-java/
	public void printFactors() {
		System.out.println(primeFactors);
	}

	public void printFactorsDescending() {

		for (int i = primeFactors.size(); i > 0; i-- ) {
			System.out.print(primeFactors.get(i - 1) + " ");
			
			//i-1 because arrays start counting at 0
			//this prints the factors in descending order
		}
		System.out.println();
	}

	public void calculateFactors() {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter an Integer:");
		int number = keyboard.nextInt();


		for(int i = 2; i < number; i++) {
			while(number % i == 0) {
				primeFactors.add(i);
				number = number / i;
			}
		}
		if(number > 2) {
			primeFactors.add(number); 
		}
		//copied from https://www.tutorialspoint.com/Prime-factors-in-java
		     
	}
}
