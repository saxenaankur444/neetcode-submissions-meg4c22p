class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(n, 0, 0, new StringBuilder(), res);
        return res;
    }

    private static void generate(int n, int open, int close, StringBuilder curr, List<String> res) {
        if (curr.length() == 2 * n) {
            res.add(new String(curr));
            return;
        }

        if (open < n) {
            curr.append("(");
            generate(n, open + 1, close, curr, res);
            curr.deleteCharAt(curr.length() - 1);
        }
        if (close < open) {
            curr.append(")");
            generate(n, open, close + 1, curr, res);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
