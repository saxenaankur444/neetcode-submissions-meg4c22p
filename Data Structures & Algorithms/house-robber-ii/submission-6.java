public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        return Math.max(r(Arrays.copyOfRange(nums, 0, nums.length - 1)),
            r(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private static int r(int[] nums) {
        int a = 0;
        int b = 0;
        for (int n : nums) {
            int t = Math.max(n + a, b);
            a = b;
            b = t;
        }
        return b;
    }
}