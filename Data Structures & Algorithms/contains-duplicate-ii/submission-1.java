class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < Math.min(nums.length, i + k + 1); j++) {
				if (nums[j] == nums[i])
					return true;
			}
		}
		return false;
	
    }
}