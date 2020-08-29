package dp;

public class SUmOfAllSubStrings {
	public static int sumOfSubStrings(String numericString) {
		if (numericString == null || numericString.length() == 0) {
			return 0;
		}

		int[] sum = new int[numericString.length()];

		sum[0] = numericString.charAt(0) - '0';

		int res = sum[0];
		//
		for (int i = 1; i < numericString.length(); i++) {
			int numberAtI = numericString.charAt(i) - '0';
			sum[i] = (i + 1) * numberAtI + 10 * (sum[i - 1]);

			res += sum[i];
		}

		return res;
	}

	public static void main(String[] args) {
		String numericString = "1234";
		System.out.println(sumOfSubStrings(numericString));

	}

}
