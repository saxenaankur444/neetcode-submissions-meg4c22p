class Solution {
    public int maxArea(int[] nums) {
        
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int vol = (j - i) * Math.min(nums[i], nums[j]);
				if (vol > max)
					max = vol;
			}
		}
		return max;
	
    }
}
