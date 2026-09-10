class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] str = path.split("/");
        for (String s : str) {
            if (s.isEmpty() || s.equals("."))
                continue;
            else if (s.equals("..")) {
                if (!st.isEmpty())
                    st.pop();
            } else
                st.push(s);
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> itr = st.iterator();
        while (itr.hasNext()) sb.append("/").append(itr.next());
        return sb.length() == 0 ? "/" : sb.toString();
    }
}