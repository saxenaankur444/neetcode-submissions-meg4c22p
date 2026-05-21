public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
		int l = 1;
		int r = Arrays.stream(piles).max().getAsInt();
		while (l <= r) {
			int m = l + (r - l) / 2;
			int totalTime = 0;
			for (int p : piles) {
				totalTime += (int) Math.ceil((double) p / m);
			}
			if (totalTime <= h)
				r = m - 1;
			else
				l = m + 1;
		}
		return l;
	}
}