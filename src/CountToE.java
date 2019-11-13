
public class CountToE {
	public static void main (String []args) {
		
	//printLetters();
	char storeLetter[] = new char [4];
	
	for(int i = 0; i < storeLetter.length; i++) {
		
		
		 char test = (char) i;
		 
		storeLetter[i] = test;
		
		System.out.println(storeLetter[i]);
		
		//https://www.javatpoint.com/java-int-to-char
		//used this website for help with char variables
	}
	
	
	
	}
	public static void printLetters(){
		
		String storeLetter[] = {"A", "B", "C", "D", "E"};
		
		for (int i = 0; i < storeLetter.length; i++) {
			
			System.out.println(storeLetter[i]);
		}
		
	}
}
