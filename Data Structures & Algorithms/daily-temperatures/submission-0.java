class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
		int[] res = new int[temperatures.length];
		for (int i = 0; i < temperatures.length; i++) {
			int count = 0;
			for (int j = i; j < temperatures.length; j++) {
				if (temperatures[j] > temperatures[i]) {
					count = j - i;
					break;
				}

			}
			res[i] = count;
		}
		return res;
	
    }
}
