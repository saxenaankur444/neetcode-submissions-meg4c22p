class Solution {
    private static int rob(int[] nums) {
        return Math.max(helper(nums, 0, nums.length - 2), helper(nums, 1, nums.length - 1));
    }

    public static int helper(int[] nums, int s, int e) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int r1 = 0, r2 = 0;
        for (int i = s; i <= e; i++) {
            int t = Math.max(nums[i] + r1, r2);
            r1 = r2;
            r2 = t;
        }
        return r2;
    }
}
