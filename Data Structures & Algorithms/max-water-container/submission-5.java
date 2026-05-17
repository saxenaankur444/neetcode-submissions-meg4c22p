class Solution {
    public int maxArea(int[] height) {
        int res = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = 0; j < height.length; j++) {
				res = Math.max(res, Math.min(height[i], height[j]) * (Math.abs(i - j)));
			}
		}
		return res;
    }
}
