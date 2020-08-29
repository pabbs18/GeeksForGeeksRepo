package dp;

public class EditDistanceBetween2StringsTheLevenshteinDistance {
	public static int numberOfEditsNeeded(String s1, String s2) {
		if (s1 == null || s1.length() == 0) {
			return s2.length();
		}
		if (s2 == null || s2.length() == 0) {
			return s1.length();
		}
		int n = s1.length();
		int m = s2.length();
		int[][] dp = new int[m + 1][n + 1];

		//if the last characters of the two strings(or part of them)under comparison are same,
		//no new edit is required. Therefore the number of edits here will be same as it was before these 
		//two characters were considered.

		//if the last characters of the two strings(or part of them)under comparison are not same,
		//Then we can check by "subproblem"-ing it.

		//First, check by removing only the last character from the source String -DELETE
		//Second, check by removing only the last character from the destination String-This 
		//will make us do an INSERT
		//Third, remove the last characters from both the strings. This will be like the last characters of two strings
		//never existed. But in reality the last character of string 1 exists.
		//Inorder to get the destination string with the new character we are essentially REPLACING
		//the last character of source string with the last character of the destination string.
		// For all the three add 1 for the new edit operation for the current character.

		for (int col = 0; col <= n; col++) {
			dp[0][col] = col;
		}

		for (int row = 0; row <= m; row++) {
			dp[row][0] = row;
		}

		for (int row = 1; row <= m; row++) {
			for (int col = 1; col <= n; col++) {
				int replaceOp = dp[row - 1][col - 1];
				int deleteOp = dp[row][col - 1];
				int insertOp = dp[row - 1][col];
				if (s1.charAt(col - 1) == s2.charAt(row - 1)) {
					dp[row][col] = replaceOp;
				} else {
					dp[row][col] = findMin(replaceOp, deleteOp, insertOp) + 1;
				}
			}
		}
		for (int row = 0; row <= m; row++) {
			for (int col = 0; col <= n; col++) {
				System.out.print(dp[row][col] + " | ");
			}
			System.out.println();
		}
		return dp[m][n];
	}

	public static int findMin(int a, int b, int c) {
		int temp = Math.min(a, b);
		return Math.min(temp, c);
	}

	public static void main(String[] args) {
		String s1 = "benyam";
		String s2 = "ephrem";

		numberOfEditsNeeded(s1, s2);

	}

}
