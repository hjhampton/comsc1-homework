import java.text.DecimalFormat;
//imports a built in java tool for formating decimals
// I used https://www.youtube.com/watch?v=_arERf6wXxk for help with the decimal formatting. 

public class population {
	public static void main(String args[]) {
		
	
		double seconds, currentpop, birth, death, immigrant, yone, ytwo, ythree,
				yfour, yfive;
//creates variables for seconds in a year, population, birth/death/immigration rate
//and for years one through five
		
			seconds = 365.0 * 24.0 * 60.0 * 60.0;
//converts years to seconds
			
			birth = seconds / 7.0;
			death = seconds / 13.0;
			immigrant = seconds/ 45.0;
//calculates birth/death/immigration rate
			
		currentpop = 312032486.0;
		yone = currentpop + birth - death + immigrant;
		ytwo = yone + birth - death + immigrant;
		ythree = ytwo + birth - death + immigrant;
		yfour = ythree + birth - death + immigrant;
		yfive = yfour + birth - death + immigrant;
//adds or subtracts the population change rates to the previous years
		
		
		System.out.println(new DecimalFormat("Year one population = 0.0000").format(yone));
		System.out.println(new DecimalFormat("Year two population = 0.0000").format(ytwo));
		System.out.println(new DecimalFormat("Year three population = 0.0000").format(ythree));
		System.out.println(new DecimalFormat("Year four population = 0.0000").format(yfour));
		System.out.println(new DecimalFormat("Year five population = 0.0000").format(yfive));
//prints out the result of all five years
//DecimalFormat ensures that the printed text is NOT in scientific notation 

		
	}
}
