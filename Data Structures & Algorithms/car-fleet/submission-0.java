class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        for (int i = 0; i < pairs.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> st = new Stack<>();
        for (int[] p : pairs) {
            st.push((double) (target - p[0]) / p[1]);
            if (st.size() > 1 && st.peek() <= st.get(st.size() - 2)) {
                st.pop();
            }
        }
        return st.size();
    }
}
