class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
		for (int i = 0; i < temperatures.length; i++) {
			for (int j = i; j < temperatures.length; j++) {
				if (temperatures[j] > temperatures[i]) {
					temperatures[i] = j - i;
					break;
				} else if (j == temperatures.length - 1) {
					temperatures[i] = 0;
				}
			}
		}
		return temperatures;
	
    }
}
