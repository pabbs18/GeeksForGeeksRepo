package dp;

public class MinimumJumsps {

	public static int minJumps(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -1;
		}

		int jumps = 0;
		int curEnd = 0;
		int farthestEnd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i > farthestEnd) {
				return -1;
			}
			farthestEnd = Math.max(farthestEnd, i + arr[i]);
			if (i == curEnd) {
				jumps++;
				curEnd = farthestEnd;

				if (curEnd >= arr.length - 1) {
					break;
				}
			}
		}

		return jumps;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 3, 1, 1, 4 };
		System.out.println(minJumps(arr));

	}

}
