class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> st = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[i] > st.peek()[0]) {
                int[] curr = st.peek();
                res[curr[1]] = i - curr[1];
                st.pop();
            }
            st.push(new int[] {temperatures[i], i});
        }
        return res;
    }
}
