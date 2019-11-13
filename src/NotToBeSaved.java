import java.util.Scanner;

public class NotToBeSaved {
	public static void main (String []args) {
		
		int [] [] matrixA = new int [2][2];
		int [] [] matrixB = new int [2][2];
		int [] [] matrixC = new int [2][2];
		

		fillArray(matrixA);
		printArray(matrixA);
		fillArray(matrixB);
		printArray(matrixB);
		multiplyArray(matrixA, matrixB, matrixC);
		printArray(matrixC);

		
		
	}
	private static void fillArray(int [][] matrix) {
		
		Scanner input = new Scanner (System.in);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				matrix[i][j] = input.nextInt();
		
			}
		}
	}
	private static void printArray(int [][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}

			System.out.println();

		}
	}
	private static void multiplyArray(int [][] matrixA, int [][] matrixB, int [][] matrixC) {
		
		matrixC[0][0] = ((matrixA[0][0] * matrixB[0][0]) + (matrixA[0][1] * matrixB[1][0]));
		matrixC[0][1] = ((matrixA[0][0] * matrixB[0][1]) + (matrixA[0][1] * matrixB[1][1]));
		matrixC[1][0] = ((matrixA[1][0] * matrixB[0][0]) + (matrixA[1][1] * matrixB[1][0]));
		matrixC[1][1] = ((matrixA[1][0] * matrixB[0][1]) + (matrixA[1][1] * matrixB[1][1]));
	}
	







}
