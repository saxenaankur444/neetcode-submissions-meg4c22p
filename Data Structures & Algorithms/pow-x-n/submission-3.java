class Solution {
    public double myPow(double d, int i) {
        double ans = d;if (i == 0)
			return 1.0;
		for (int j = 1; j < Math.abs(i); j++) {
			ans *= d;
		}
		if (i > 0)
			return ans;
		else
			return 1 / ans;
    }
}
