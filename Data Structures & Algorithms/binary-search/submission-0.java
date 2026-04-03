class Solution {
    public int search(int[] qrr, int target) {
       		int l = 0, r = qrr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2; // avoid overflow
			if (qrr[m] < target) {
				l = m + 1;
			} else if (qrr[m] > target) {
				r = m - 1;
			} else
				return m;
		}
		return -1;
	}
}
