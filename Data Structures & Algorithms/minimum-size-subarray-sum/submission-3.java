class Solution {
    public int minSubArrayLen(int target, int[] prices) {
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			int sum = 0;
			int j = i;
			while (j < prices.length) {
				sum += prices[j];
				if (sum >= target) {
					res = Math.min(res, j - i + 1);
					break;
				}
				j++;
			}
		}
		return res == Integer.MAX_VALUE ? 0 : res;
	}
}