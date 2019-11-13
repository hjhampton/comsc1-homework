import java.util.Scanner;

public class exercise {
  public static void main(String[] args) {

/*
Find numbers divisible by 5 or 6, but not both
Write a program that displays
all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not
both. Numbers are separated by exactly one space, display 10 numbers per line

start at 100
if 100 % 5 || 100 % 6, print it
after number++
 */
	  
	  int counter = 0;
	 for(int number=100; number <= 200; number++) {
		 //sys.out.print
		
		  if (number % 5 == 0 ^ number % 6 == 0) {
			  System.out.print(number + " ");
			  counter++;
			  //Kam helped me with the ^ operator. It will not run if both sides of the operator are true
		  }
			  if(counter == 10) {
				  System.out.println("\r\n");
				  counter = 0;
				//used Dr. Evert's counter idea to create a new line when the counter hits 10
			  
	  }
	}
  }
}

