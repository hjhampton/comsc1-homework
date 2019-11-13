
public class RandomUppercase {
  public static void main(String[] args) {

	  //65 to 90 is uppercase A to Z
	  /*
	   * used 5 resources for help
	   * https://www.javatpoint.com/java-math-random-method
	   * https://www.youtube.com/watch?v=rjkYAs6gAkk&list=PLFE2CE09D83EE3E28&index=22
	   * https://theasciicode.com.ar/ascii-printable-characters/capital-letter-u-uppercase-ascii-code-85.html
	   * https://www.javatpoint.com/char-keyword-in-java
	   * https://github.com/maxalthoff/intro-to-java-exercises/blob/master/04/E4_16/E4_16.java
	   */
	  for (int i = 0; i < 10; i++) {
		  char uppercaseLetter =  (char) ((Math.random() * 26 ) + 65);  
		  System.out.println(uppercaseLetter);
		}
	//prints out 10 uppercase letters randomly
  }
}

