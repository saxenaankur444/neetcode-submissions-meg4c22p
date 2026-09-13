class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
		int[][] pairs = new int[position.length][2];
		Stack<Double> st = new Stack<>();
		for (int i = 0; i < pairs.length; i++) {
			pairs[i][0] = position[i];
			pairs[i][1] = speed[i];
		}
		Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
		for (int[] p : pairs) {
			double t = (double) (target - p[0]) / p[1];
			st.push(t);
			while (st.size() >= 2 && st.peek() <= st.get(st.size() - 2)) {
				st.pop();
			}
		}
		return st.size();
	}
}
