package dp;

public class EggDropingProblem {
	public static int minimumNumberOfTriesToBreak(int n, int e) {
		if (n <= 0 || e <= 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		if (e == 1) {
			return n;
		}

		int[][] dp = new int[n + 1][e + 1];

		//There are two possibilities
		//1. if the egg breaks at a floor x at this try, you're left with 
		//e-1 eggs and x-1 floors below x to check for(all the floors below x, excluding x)

		//2. if the egg doesn't break at a floor x, then all the floors below x are safe. And
		//all the floors above x are under doubt. i.e if there are n floors in total and its
		//safe till a floor x, then (n-x) remaining floors above floor x are checked.

		//since we have to assume the worst case scenario out of the above 2 possibilities, i.e
		//we assume that the number of tries at any given floor x, will involve maximum number of
		//tries(whether the egg breaks or not), we take max of each scenario, indicating that
		//either scenario might eventually make us try maximum number of tries on the remaining floors.

		//since at any given floor x, we try a "try", before deciding on either of the two scenarios.
		//This in itself is 1 try. Therefore it needs to be added to our calculation of max(scen1, scen2)

		//But our goal is to minimize the total number of tries for the given n floors.
		//Hence after calculating the worst possible outcomes(realities) given by each floor,
		//we choose minimum of all of these

		//Therefore the final equation looks like:
		// for all floors from 1 to n min(max(scen1,scen2)+ 1 try for current floor)

		for (int col = 0; col <= e; col++) {
			dp[1][col] = 1;// if only one floor, you get at max one try irrespective of number of eggs
		}

		for (int row = 1; row <= n; row++) {
			dp[row][1] = row;// if there is only 1 egg and n floors, then you would have tried n
								// times when you finish n floors
		}

		for (int row = 2; row <= n; row++) {
			for (int col = 2; col <= e; col++) {
				dp[row][col] = Integer.MAX_VALUE;
				for (int x = 1; x < row; x++) {//x is the current floor you're standing on
					int eggBreaks = dp[x - 1][col - 1];
					int eggDoesntBreak = dp[row - x][col];

					int maximumTriesPossiblePerFloor = 1 + Math.max(eggBreaks, eggDoesntBreak); //1 for current floor try

					dp[row][col] = Math.min(maximumTriesPossiblePerFloor, dp[row][col]);
				}
			}

		}
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= e; col++) {
				System.out.print(dp[row][col] + " | ");
			}
			System.out.println();
		}
		return dp[n][e];
	}

	public static void main(String[] args) {
		System.out.println(minimumNumberOfTriesToBreak(8, 4));

	}

}
