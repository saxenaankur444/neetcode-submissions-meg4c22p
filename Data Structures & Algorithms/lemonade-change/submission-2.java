class Solution {
    public boolean lemonadeChange(int[] nums) {
		int f = 0, t = 0;
		for (int n : nums) {
			if (n == 5) {
				f++;
			} else if (n == 10) {
				t++;
				f--;
			} else if (t > 0) {
				t--;
				f--;
			} else {
				f -= 3;
			}
			if (f < 0) {
				return false;
			}
		}
		return true;
	}
}