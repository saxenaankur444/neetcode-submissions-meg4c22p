class Solution {

	public static int evalRPN(String[] tokens) {
		Stack<Integer> st = new Stack<>();
		for (String token : tokens) {
			if ("+-*/".contains(token)) {
				int b = st.pop();
				int a = st.pop();
				st.push(calc(a, b, token));
			} else
				st.push(Integer.parseInt(token));
		}
		return st.pop();
	}

	private static int calc(int a, int b, String token) {
		switch (token) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		default:
			throw new IllegalArgumentException("Unexpected value: " + token);
		}
	}
}
