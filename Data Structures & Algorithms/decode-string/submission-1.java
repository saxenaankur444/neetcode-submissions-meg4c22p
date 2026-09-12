class Solution {
	private static String decodeString(String s) {
		Stack<Integer> countSt = new Stack<>();
		Stack<StringBuilder> stringSt = new Stack<>();
		int num = 0;
		StringBuilder curr = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (isDigit(c)) {
				num = (num * 10) + (c - '0');
			} else if (c == '[') {
				countSt.push(num);
				stringSt.push(new StringBuilder(curr));
				num = 0;
				curr = new StringBuilder();
			} else if (c == ']') {
				Integer retry = countSt.pop();
				StringBuilder prev = stringSt.pop();
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