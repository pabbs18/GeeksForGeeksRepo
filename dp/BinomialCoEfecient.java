package dp;

public class BinomialCoEfecient {

	public static int binomialCoEff(int n, int k) {
		if (n < 0 || k < 0) {
			return -1;
		}

		if (n == 0) {
			return 0;
		}
		if (k == 0 || k == n) {
			return 1;
		}

		if (k > n - k) {
			k = n - k;
		}
		int res = 1;
		for (int i = 0; i < k; i++) {
			res *= (n - i);
			res /= (i + 1);
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println(binomialCoEff(5, 2));

	}

}
