import java.util.Random;

public class LicensePlate {
	public static void main (String []args) {
		
		Random rand = new Random();
		
		int licenseNo1,licenseNo2 ,licenseNo3, licenseNo4;
		char uppercaseLetter1, uppercaseLetter2, uppercaseLetter3;
		
		licenseNo1 = rand.nextInt(10);
		licenseNo2 = rand.nextInt(10);
		licenseNo3 = rand.nextInt(10);
		licenseNo4 = rand.nextInt(10);
		
		uppercaseLetter1 =  (char) ((Math.random() * 26 ) + 65); 
		uppercaseLetter2 =  (char) ((Math.random() * 26 ) + 65); 
		uppercaseLetter3 =  (char) ((Math.random() * 26 ) + 65); 
		
		
		
			  
			  
			System.out.println("Your license plate number is: " + uppercaseLetter1 +""+ uppercaseLetter2 +""+ uppercaseLetter3 +""+ 
					licenseNo1 +""+ licenseNo2 +""+ licenseNo3 +""+ licenseNo4);
			  
			
		
		
	}
}
