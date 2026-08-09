class Solution {
    public int[] dailyTemperatures(int[] temp) {int[] res = new int[temp.length];
		Stack<int[]> st = new Stack<>();
		for (int i = 0; i < temp.length; i++) {
			int t = temp[i];
			while (!st.isEmpty() && st.peek()[0] < t) {
				int[] pair = st.pop();
				res[pair[1]] = i - pair[1];
			}
			st.push(new int[] { t, i });
		}
        return res;
    }
}
