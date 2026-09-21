class Solution {
    public int majorityElement(int[] nums) {
        
		int n = nums.length;
		for (int num : nums) {
			int cnt = 0;
			for (int i : nums) {
				if (i == num) {
					cnt++;
				}
				if (cnt > nums.length / 2) {
					return num;
				}
			}
		}
		return -1;
	
    }
}