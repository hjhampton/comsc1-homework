
public class approxPi {

	public static void main (String args[]) {
		
		double pi1, pi2;
		
		pi1 = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
		
		pi2 = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
		
		
		System.out.println("Pi is approximately " + pi1);
		System.out.println("Pi is approximately " + pi2);
		
	}
	
}
