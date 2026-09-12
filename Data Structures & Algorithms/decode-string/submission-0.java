class Solution {
    private static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        for (char c : s.toCharArray()) {
            if (isDigit(c)) {
                num = (num * 10) + (c - '0');
            } else if (c == '[') {
                countStack.push(num);
                stringStack.push(curr);
                num = 0;
                curr = new StringBuilder();
            } else if (c == ']') {
                Integer retry = countStack.pop();
                StringBuilder prev = stringStack.pop();
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