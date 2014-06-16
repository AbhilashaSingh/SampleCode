/**
 * 
 */

/**
 * @author Abhilasha Singh
 * 
 */
public class Board {
	String[][] valuesArray;

	public Board(String values) {
		valuesArray = new String[8][8];
		String[] valGotArray = values.split(",");
		int k = 0;
		System.out.println("The board looks like below :");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				valuesArray[i][j] = valGotArray[k++];
				System.out.print(valuesArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int detemineWeight(int xPos, int yPos) {
		if (xPos < 1 | yPos < 1 | xPos > 6 | yPos > 6) {
			int notValidInput = -1;
			return notValidInput;
		}
		int weight = 0;
		System.out.println("The inner board looks like below :");
		for (int i = xPos - 1; i <= xPos + 1; i++) {
			for (int j = yPos - 1; j <= yPos + 1; j++) {
				System.out.print(valuesArray[i][j] + " ");
				String tempValue = valuesArray[i][j];
				String weightValue = valuesArray[xPos][yPos];
				if (tempValue.equals(weightValue)) {
					weight++;
				}
			}
			System.out.println();
		}
		System.out.println("Finding weight of " + valuesArray[xPos][yPos]);
		return weight;
	}
}
