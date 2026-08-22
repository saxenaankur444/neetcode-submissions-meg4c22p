class Solution {
    public int maxSubArray(int[] nums) {
		int maxS = nums[0];
		int currS = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currS = Math.max(nums[i], nums[i]+currS);
			maxS = Math.max(maxS, currS);
		}
		return maxS;
	}
}
