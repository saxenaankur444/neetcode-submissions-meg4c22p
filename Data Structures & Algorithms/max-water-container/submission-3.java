class Solution {
    public int maxArea(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			int l = 0, r = nums.length - 1;
			while (l < r) {
			    int vol = (r - l) * Math.min(nums[l], nums[r]);
				if (max < vol) {
					max = vol;
				}
                if (nums[l] <= nums[r]) {
					l++;
				} else {
					r--;
				}
			}
		}
		return max;
	
    }
}
