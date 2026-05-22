class Solution {
	private static int search(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		while (l < r) {
			int m = l + (r - l) / 2;
			if (nums[m] > nums[r])
				l = m + 1;
			else
				r = m;
		}

		int pivot = l;
		int res = bs(target, nums, 0, pivot - 1);
		if (res != -1)
			return res;
		return bs(target, nums, pivot, nums.length - 1);
	}

	private static int bs(int target, int[] nums, int l, int r) {
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (nums[m] == target)
				return m;
			else if (nums[m] > target)
				r = m - 1;
			else
				l = m + 1;
		}
		return -1;
	}

}
