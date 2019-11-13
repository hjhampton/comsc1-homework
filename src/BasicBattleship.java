
import java.util.Random;
import java.util.Scanner;


public class BasicBattleship {
	public static void main (String []args) {

		boolean gameOver = false;

		int playerBoard [][] = new int [10][10];

		for (int i = 0; i < playerBoard.length; i++) {
			for (int j = 0; j < playerBoard.length; j++) {
				playerBoard [i][j] = 0;
			}

		}

		int cpuBoard [][] = new int [10][10];

		for (int i = 0; i < cpuBoard.length; i++) {
			for (int j = 0; j < cpuBoard.length; j++) {
				cpuBoard [i][j] = 0;
			}

		}

		int blankBoard [][] = new int [10][10];

		for (int i = 0; i < blankBoard.length; i++) {
			for (int j = 0; j < blankBoard.length; j++) {
				blankBoard [i][j] = 0;
			}

		}


		gameRules();
		printBoard(playerBoard);
		placeShips(playerBoard);
		cpuPlaceShips(cpuBoard);

		do {
			playerAttack(cpuBoard, blankBoard);
			cpuAttack(playerBoard);
		}while(gameOver == false);
		//this loops forever, don't have a way to set it to true yet
	}

	private static void printBoard(int[][] board) {
		//I got this code for printing out a multi-array from Kam's example in the Canvas Announcement

		for (int colmn = 0; colmn < board.length; colmn++) {
			for (int row = 0; row < board[colmn].length; row++) {
				System.out.print(board[colmn][row] + " ");
			}
			System.out.println();
		}
	}

	private static void gameRules() {

		Scanner input = new Scanner(System.in);

		System.out.println("WELCOME TO BASIC BATTLESHIP!");
		System.out.println("A zero means the space has not been tested, an 8 means the space was attacked but was empty, a 4 means the space was attacked and was successful");
		System.out.println("Please choose a board size by pressing the corresponding number.");
		System.out.println("(1) 10 x 10");
		//System.out.println("(2) 15 x 15");
		//System.out.println("(3) 20 x 20");

		int selection = input.nextInt();

		switch (selection) {

		case 1: 
			System.out.println("10 x 10 board chosen. Good luck commander!");
			System.out.println("The following ships are in your arsenal:\n"
					+ "4 long horizontal\n"
					+ "3 long vertical\n"
					+ "3 long horizontal\n"
					+ "2 long vertical\n"
					+ "2 long horizontal\n"
					+ "1 long\n"
					+ "1 long\n");
			break;

		default: 
			System.out.println("bro what u doing?");
			break;
		}



	}

	private static void placeShips(int[][] board) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the coordinates for the top left most portion of the ship");
		System.out.println("4 long horizontal");

		int x = input.nextInt() - 1;
		//y axis, subtracting 1 because arrays start at 0

		int y = input.nextInt() - 1;
		//x axis, subtracting 1 because arrays start at 0

		board [x] [y] = 1;
		board [x] [y+1] = 1;
		board [x] [y+2] = 1;
		board [x] [y+3] = 1;

		printBoard(board);

		System.out.println("3 long vertical");

		x = input.nextInt() - 1;
		//y axis, subtracting 1 because arrays start at 0

		y = input.nextInt() - 1;
		//x axis, subtracting 1 because arrays start at 0

		board [x] [y] = 1;
		board [x+1] [y] = 1;
		board [x+2] [y] = 1;

		printBoard(board);

		System.out.println("3 long horizontal");

		x = input.nextInt() - 1;

		y = input.nextInt() - 1;


		board [x] [y] = 1;
		board [x] [y+1] = 1;
		board [x] [y+2] = 1;

		printBoard(board);

		System.out.println("2 long vertical");

		x = input.nextInt() - 1;
		//y axis, subtracting 1 because arrays start at 0

		y = input.nextInt() - 1;
		//x axis, subtracting 1 because arrays start at 0

		board [x] [y] = 1;
		board [x+1] [y] = 1;

		printBoard(board);

		System.out.println("2 long horizontal");

		x = input.nextInt() - 1;

		y = input.nextInt() - 1;


		board [x] [y] = 1;
		board [x] [y+1] = 1;

		printBoard(board);

		System.out.println("1 long");

		x = input.nextInt() - 1;

		y = input.nextInt() - 1;

		board [x] [y] = 1;

		printBoard(board);

		System.out.println("1 long");

		x = input.nextInt() - 1;

		y = input.nextInt() - 1;


		board [x] [y] = 1;

		printBoard(board);
		System.out.println();
	}

	private static void cpuPlaceShips(int[][] board) {

		//initial must be ship size less than random number
		Random rand = new Random();

		int x, y;
		x = rand.nextInt(board.length);
		y = rand.nextInt(board.length);
		//THIS IS THE ANSWER	
		if ( y > 5) {
			y -= 4;
		}else if (y < 4) {
			y += 4;
		}
		//THIS IS IMPORTANT
		//System.out.println("4 long horizontal");

		board [x] [y] = 1;
		board [x] [y+1] = 1;
		board [x] [y+2] = 1;
		board [x] [y+3] = 1;

		//printBoard(board);
		//System.out.println();

		//System.out.println("3 long vertical");

		x = rand.nextInt(board.length);
		y = rand.nextInt(board.length);

		if ( x > 6) {
			x -= 3;
		}else if (x < 3) {
			x += 3;
		}

		board [x] [y] = 1;
		board [x+1] [y] = 1;
		board [x+2] [y] = 1;

		//printBoard(board);
		//System.out.println();
		//System.out.println("3 long horizontal");

		x = rand.nextInt(board.length);
		y = rand.nextInt(board.length);


		if ( y > 6) {
			y -= 3;
		}else if (y < 3) {
			y += 3;
		}

		board [x] [y] = 1;
		board [x] [y+1] = 1;
		board [x] [y+2] = 1;

		//printBoard(board);
		//System.out.println();
		//System.out.println("2 long vertical");

		x = rand.nextInt(board.length);
		y = rand.nextInt(board.length);

		if ( x > 7) {
			x -= 2;
		}else if (x < 2) {
			x += 2;
		}


		board [x] [y] = 1;
		board [x+1] [y] = 1;

		//printBoard(board);
		//System.out.println();
		//System.out.println("2 long horizontal");

		x = rand.nextInt(board.length);
		y = rand.nextInt(board.length);

		if ( y > 7) {
			y -= 2;
		}else if (y < 2) {
			y += 2;
		}

		board [x] [y] = 1;
		board [x] [y+1] = 1;

		//printBoard(board);
		//System.out.println();
		//System.out.println("1 long");

		x = rand.nextInt(board.length);
		y = rand.nextInt(board.length);

		board [x] [y] = 1;

		//printBoard(board);
		//System.out.println();
		//System.out.println("1 long");

		x = rand.nextInt(board.length);
		y = rand.nextInt(board.length);


		board [x] [y] = 1;

		//printBoard(board);
		//System.out.println();
	}

	private static void playerAttack(int[][] board, int[][] blankBoard) {
		Scanner input = new Scanner (System.in);
		boolean attackSuccess = true;

		do {

			System.out.println("Enter coordinates for your attack");

			printBoard(blankBoard);

			int x = input.nextInt() - 1;
			//y axis, subtracting 1 because arrays start at 0

			int y = input.nextInt() - 1;
			//x axis, subtracting 1 because arrays start at 0


			if (board [x] [y] == 1) {
				board [x] [y] = 4;
				blankBoard [x] [y] = 4;
				attackSuccess = true;
			}else {
				board [x] [y] = 8;
				blankBoard [x] [y] = 8;
				attackSuccess = false;
			}

			printBoard(blankBoard);
			System.out.println();

		}while (attackSuccess == true);


	}

	private static void cpuAttack(int[][] board) {
		Random rand = new Random();
		System.out.println();
		System.out.println("The enemy is attacking!");
		int x, y;


		boolean attackSuccess = true;

		do {

			x = rand.nextInt(board.length);
			y = rand.nextInt(board.length);

			if (board [x] [y] == 1) {
				board [x] [y] = 4;
				attackSuccess = true;
			}else {
				board [x] [y] = 8;
				attackSuccess = false;
			}

			printBoard(board);
			System.out.println();

		}while (attackSuccess == true);


	}
}