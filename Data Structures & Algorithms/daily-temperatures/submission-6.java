class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
		int[] ans = new int[temperatures.length];
		for (int i = 0; i < temperatures.length; i++) {
			int j = i + 1;
			int count = 1;
			int n = temperatures.length;
			while (j < n) {
				if (temperatures[j] > temperatures[i])
					break;
				j++;
				count++;
			}
			count = j == n ? 0 : count;
			ans[i] = count;
		}
		return ans;
	}
}
