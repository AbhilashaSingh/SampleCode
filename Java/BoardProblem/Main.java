import java.util.Scanner;

/**
 * 
 */

/**
 * @author Abhilasha Singh
 * 
 */
public class Main {

	public static void main(String[] args) {
		// Create object board
		Board board = new Board(
				"A,B,A,B,B,B,A,B,A,A,B,A,B,B,A,B,B,A,B,A,B,A,B,A,B,A,B,A,B,A,B,B,A,B,A,A,B,A,B,A,B,A,B,A,B,B,A,B,A,A,B,B,B,A,B,B,A,B,B,A,B,B,A,B");
		Scanner scanX = new Scanner(System.in);
		int xPos = scanX.nextInt();
		Scanner scanY = new Scanner(System.in);
		int yPos = scanY.nextInt();
		int weightGot = board.detemineWeight(xPos, yPos);
		if (weightGot == -1) {
			System.out
					.println("Invalid position for finding proper weight.X and Y value should be between 1-6.Given input X="
							+ xPos + " and Y=" + yPos + ".");
		} else {
			System.out.println("Weight for position  X=" + xPos + " and Y="
					+ yPos + " is " + weightGot + ".");
		}
	}
}
