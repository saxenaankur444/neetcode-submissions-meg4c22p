class Solution {
    public int minEatingSpeed(int[] piles, int h) {
		int l = 0, r = Arrays.stream(piles).max().getAsInt();
		int res = 0;
		while (l <= r) {
			int m = l + (r - l) / 2;
			int hrs = 0;
			for (int p : piles)
				hrs += Math.ceil((double) p / m);
			if (hrs > h)
				l = m + 1;
			else {
				res = m;
				r = m - 1;
			}
		}
		return res;
	}
}
