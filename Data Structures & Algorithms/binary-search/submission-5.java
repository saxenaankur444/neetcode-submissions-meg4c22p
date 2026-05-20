class Solution {
	private static int search(int[] nums, int target) {
		return bs(nums, target, 0, nums.length - 1);
	}

	private static int bs(int[] nums, int target, int l, int r) {
		if (l > r)
			return -1;
		int m = l + ((r - l) / 2);
		if (nums[m] > target)
			return bs(nums, target, l, m - 1);
		else if (nums[m] < target)
			return bs(nums, target, m + 1, r);
		return m;
	
}
}