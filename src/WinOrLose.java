import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WinOrLose {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// System.out.println("numberOfTestCases");
		int numberOfTestCases = in.nextInt();
		// System.out.println("You entered numberOfTestCases " + numberOfTestCases);

		for (int j = 0; j < numberOfTestCases; j++) {
			int numberOfPlayersAndVillian = in.nextInt();
			// System.out.println("You entered numberOfPlayersAndVillian " +
			// numberOfPlayersAndVillian);

			// System.out.println("******************** Enter villian's powers
			// *****************************");
			int[] villianArray = new int[numberOfPlayersAndVillian];
			for (int i = 0; i < numberOfPlayersAndVillian; i++) {
				villianArray[i] = in.nextInt();
			}

			// use array length check if unable to compile all the test cases.

			// System.out.println("********************** Enter players's powers
			// ****************************");
			int[] playerArray = new int[numberOfPlayersAndVillian];
			for (int i = 0; i < numberOfPlayersAndVillian; i++) {
				playerArray[i] = in.nextInt();
			}

			Arrays.sort(villianArray);
			Arrays.sort(playerArray);

			/*
			 * System.out.
			 * println("\n\n************************ Standard output ******************************"
			 * ); System.out.
			 * println("***************************** Villian Array *******************************"
			 * ); for (int i = 0; i < numberOfPlayersAndVillian; i++) { System.out.print(" "
			 * + villianArray[i]); }
			 * 
			 * System.out.
			 * println("**************************** Player Array *********************************"
			 * ); for (int i = 0; i < numberOfPlayersAndVillian; i++) { System.out.print(" "
			 * + playerArray[i]); }
			 */

			List<Integer> winningStatus = new ArrayList<Integer>(numberOfPlayersAndVillian);

			for (int i = 0; i < numberOfPlayersAndVillian; i++) {
				if (villianArray[i] > playerArray[i]) {
					winningStatus.add(0);
				} else if (villianArray[i] == playerArray[i]) {
					winningStatus.add(1);
				} else {
					winningStatus.add(1);
				}

			}

			if (winningStatus.contains(0)) {
				System.out.println("LOSE");
			} else {
				System.out.println("WIN");
			}
		}

		in.close();

	}
}