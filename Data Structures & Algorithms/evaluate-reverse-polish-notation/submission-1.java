class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String t : tokens) {
            if ("+-/*".contains(t)) {
                int b = st.pop();
                int a = st.pop();
                st.push(compute(a, b, t));
            } else {
                st.push(Integer.parseInt(t));
            }
        }
        return st.pop();
    }
    public Integer compute(int a, int b, String t) {
        switch (t) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/": {
                if (b == 0)
                    throw new IllegalArgumentException("Unexpected value: " + t);
                return a / b;
            }
            case "*":
                return a * b;
            default:
                throw new IllegalArgumentException("Unexpected value: " + t);
        }
    }
}
