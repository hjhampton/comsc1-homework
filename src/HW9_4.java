import java.util.Random;
//used https://github.com/maxalthoff/intro-to-java-exercises/blob/master/09/E9_04/E9_04.java
//for reference

public class HW9_4 {
	public static void main (String []args) {
		
		Random rand = new Random(1000);
		//sets the seed to 1000
		
	for (int i = 0; i < 50; i++) {
		
	
		int randomNumber = rand.nextInt(100);
		System.out.print(randomNumber + " ");
		
	}
			
	}
}
