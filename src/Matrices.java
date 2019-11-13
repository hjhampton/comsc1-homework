import java.util.Scanner;

public class Matrices {
	public static void main (String []args) {

		Scanner input = new Scanner(System.in);


		do {
			System.out.println("Press (1) for exercise 8.1\n"
					+ "Press (2) for exercise 8.2\n"
					+ "Press (3) for exercise 8.6\n"
					+ "Press (4) to exit");

			int userChoice = input.nextInt();

			switch (userChoice) {
			case 1:
				runEightDotOne();
				break;
			case 2:
				runEightDotTwo();
				break;
			case 3:
				runEightDotSix();
				break;
			case 4:
				System.out.println("Goodbye!");
				System.exit(0);
			default:
				System.out.println("That's not a choice! Try again...");
			}
			System.out.println("Would you like to choose another exercise?");
		}while(goAgain());

	}	//end of main

	private static void runEightDotOne() {
		double additionMatrix [][] = new double [3][4];	
		System.out.println("Fill out the 3 x 4 matrix from left to right, top to bottom");
		fillArray(additionMatrix);
		printArray(additionMatrix);
		addArray(additionMatrix);
	}

	private static void runEightDotTwo() {
		double diagonalMatrix [][] = new double [4][4];	
		System.out.println("Fill out the 4 x 4 matrix from left to right, top to bottom");
		fillArray(diagonalMatrix);
		printArray(diagonalMatrix);
		addArrayDiagonal(diagonalMatrix);

	}

	private static void runEightDotSix() {
		System.out.println("Fill out TWO 2 x 2 matrices from top to bottom.");
		double [] [] matrixA = new double [2][2];
		double [] [] matrixB = new double [2][2];
		double [] [] matrixC = new double [2][2];

		fillArray(matrixA);
		printArray(matrixA);
		fillArray(matrixB);
		printArray(matrixB);
		multiplyArray(matrixA, matrixB, matrixC);
		printArray(matrixC);

	}
	
	private static void fillArray(double [][] matrix) {


		Scanner input = new Scanner (System.in);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				matrix[i][j] = input.nextInt();

			}		
		}
	}

	private static void printArray(double [][] matrix){

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}

			System.out.println();

		}


	}

	private static void addArray(double [][] matrix) {
		Scanner input = new Scanner(System.in);



		do {
			System.out.println("Enter a column number to find it's sum. (Note that columns are horizontal!)");

			int userChoice = input.nextInt() - 1;
			//subtracting one since arrays start counting at 0.

			int sum = 0;

			for (int i = 0; i < matrix.length; i++) {
				sum += matrix[i][userChoice];
			}

			System.out.println(sum);
			System.out.println("Would you like to try another column?");

		}while(goAgain());
		System.out.println("Returning to main menu...");
		//This code was for visualization
		//int sumRow1 = matrix[0][0] + matrix[1][0] + matrix[2][0];
		//int sumRow2 = matrix[0][1] + matrix[1][1] + matrix[2][1];
		//int sumRow3 = matrix[0][2] + matrix[1][2] + matrix[2][2];
		//int sumRow4 = matrix[0][3] + matrix[1][3] + matrix[2][3];
		//System.out.println("The sum of row 1 = " + sumRow1);
		//System.out.println("The sum of row 2 = " + sumRow2);
		//System.out.println("The sum of row 3 = " + sumRow3);
		//System.out.println("The sum of row 4 = " + sumRow4);



	}// end of method

	private static void addArrayDiagonal(double [][] matrix) {
		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			//int sum = matrix[0][0] + matrix[1][1] + matrix [2][2] + matrix [3][3];

			sum += matrix[i][i];
		}
		System.out.println("The sum of the major diagonal is " + sum);
	}

	private static void multiplyArray(double [][] matrixA, double [][] matrixB, double [][] matrixC) {

		//https://www.khanacademy.org/math/precalculus/x9e81a4f98389efdf:matrices/x9e81a4f98389efdf:multiplying-matrices-by-matrices/v/matrix-multiplication-intro
		//used this for help multiplying matrices.
		
		matrixC[0][0] = ((matrixA[0][0] * matrixB[0][0]) + (matrixA[0][1] * matrixB[1][0]));
		matrixC[0][1] = ((matrixA[0][0] * matrixB[0][1]) + (matrixA[0][1] * matrixB[1][1]));
		matrixC[1][0] = ((matrixA[1][0] * matrixB[0][0]) + (matrixA[1][1] * matrixB[1][0]));
		matrixC[1][1] = ((matrixA[1][0] * matrixB[0][1]) + (matrixA[1][1] * matrixB[1][1]));
	}

	private static boolean goAgain() {

		Scanner input = new Scanner(System.in);

		System.out.println("(1) for YES");
		System.out.println("(2) for NO");

		int userChoice = input.nextInt();

		if (userChoice == 1) {
			return true;
		}
		return false;
	}

}	//end of class




