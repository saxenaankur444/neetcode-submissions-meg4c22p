class Solution {
    public int maxSubArray(int[] nums) {
		int res = Integer.MIN_VALUE;
		int cur = 0;
		for (int n : nums) {
			cur = Math.max(n, cur + n);
			res = Math.max(res, cur);
		}
		return res;
	}
}
