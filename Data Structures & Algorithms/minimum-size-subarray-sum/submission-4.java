class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, sum = 0, res = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            // shrink while valid to find the smallest window ending at r
            while (sum >= target) {
                res = Math.min(res, r - l + 1);
                sum -= nums[l++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}