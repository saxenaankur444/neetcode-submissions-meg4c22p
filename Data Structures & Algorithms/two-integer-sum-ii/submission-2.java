class Solution {
    public int[] twoSum(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		while (l < r) {
			int curreSum = nums[l] + nums[r];
			if (curreSum < target)
				l++;
			else if (curreSum > target)
				r--;
			else
				return new int[] { l+1, r+1 };
		}
		return new int[] { 0 };
    }
}
