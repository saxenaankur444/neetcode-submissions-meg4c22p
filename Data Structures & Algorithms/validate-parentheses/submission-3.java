class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                st.push(c);
            } else {
                if (st.isEmpty())
                    return false;
                char curr = st.pop();
                if ((c == ')' && curr != '(') || (c == '}' && curr != '{')
                    || (c == ']' && curr != '['))
                    return false;
            }
        }
        return st.isEmpty();
    }
}
