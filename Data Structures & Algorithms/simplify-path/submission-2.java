class Solution {
    public String simplifyPath(String path) {
        char[] cs = (path + "/").toCharArray();
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : cs) {
            if (c == '/') {
                if (sb.toString().equals("..")) {
                    if (!st.isEmpty())
                        st.pop();
                } else if (!sb.toString().equals("") && !sb.toString().equals(".")) {
                    st.push(sb.toString());
                }
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }
        return "/" + String.join("/", st);
    }
}