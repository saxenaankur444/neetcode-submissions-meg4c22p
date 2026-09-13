class Solution {
    private static String decodeString(String str) {
        Stack<Integer> countSt = new Stack<>();
        Stack<StringBuilder> strSt = new Stack<>();
        int num = 0;
        StringBuilder curr = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (isDigit(c)) {
                num = (num * 10) + (c - '0');
            } else if (c == '[') {
                countSt.push(num);
                strSt.push(curr);
                curr = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                Integer retry = countSt.pop();
                StringBuilder prev = strSt.pop();
                for (int i = 0; i < retry; i++) {
                    prev.append(curr);
                }
                curr = prev;
            } else {
                curr.append(c);
            }
        }
        return curr.toString();
    }

    private static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }
}