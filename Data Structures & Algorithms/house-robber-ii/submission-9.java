public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        return Math.max(hr(Arrays.copyOfRange(nums, 0, nums.length - 1)),
				hr(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private int hr(int[] nums) {
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