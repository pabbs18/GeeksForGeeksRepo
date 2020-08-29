package dp;

public class NthCatalanNumber {
	public static int nthCatalan(int N) {
		if (N < 0) {
			return -1;
		}

		int[] g = new int[N + 1];

		g[0] = 1;

		g[1] = 1;

		for (int n = 2; n <= N; n++) {//each array index from 2
			for (int i = 1; i <= n; i++) {//for each number as root of the BST from 1 to n
				g[n] += g[i - 1] * g[n - i];// g(n) = f(1,n)     +     f(2,n)+      f(3,n)...+f(n,n)
											//			g(1-1)*g(n-1) +	g(2-1)*g(n-2)
			}
		}
		return g[N];
	}

	public static void main(String[] args) {
		System.out.println(nthCatalan(4));

	}

}
