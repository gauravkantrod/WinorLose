import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WinOrLose {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int numberOfTestCases = in.nextInt();

		for (int j = 0; j < numberOfTestCases; j++) {
			int numberOfPlayersAndVillian = in.nextInt();

			int[] villianArray = new int[numberOfPlayersAndVillian];
			for (int i = 0; i < numberOfPlayersAndVillian; i++) {
				villianArray[i] = in.nextInt();
			}

			int[] playerArray = new int[numberOfPlayersAndVillian];
			for (int i = 0; i < numberOfPlayersAndVillian; i++) {
				playerArray[i] = in.nextInt();
			}

			Arrays.sort(villianArray);
			Arrays.sort(playerArray);

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