public class Solution {
    public int minEatingSpeed(int[] arr, int h) {
		int l = 1;
		int r = Arrays.stream(arr).max().getAsInt();
		int res = r;
		while (l <= r) {
			int m = (l + r) / 2;
			long total = 0;
			for (int a : arr) {
				total += Math.ceil((double) a / m);
			}
			if (total <= h) {
				res = m;
				r = m - 1;
			} else
				l = m + 1;

		}
		return res;
	}
}