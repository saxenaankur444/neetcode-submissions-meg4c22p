class Solution {
    public int[] asteroidCollision(int[] arr) {
		Stack<Integer> st = new Stack<>();
		for (int a : arr) {
			while (!st.empty() && a < 0 && st.peek() > 0) {
				int diff = a + st.peek();
				if (diff < 0)
					st.pop();
				else if (diff > 0)
					a = 0;
				else {
					a = 0;
					st.pop();
				}
			}
			if (a != 0)
				st.push(a);
		}
		return st.stream().mapToInt(a -> a).toArray();

	}
}