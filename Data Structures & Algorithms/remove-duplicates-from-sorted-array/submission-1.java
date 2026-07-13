class Solution {
    public int removeDuplicates(int[] nums) {
		int r = 1, l = 1;
		while (r < nums.length) {
			if (nums[r] != nums[r - 1])
				nums[l++] = nums[r];
			r++;
		}
		 return l;
	}
}