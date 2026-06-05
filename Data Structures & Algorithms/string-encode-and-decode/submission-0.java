class Solution {

    public String encode(List<String> strs) {
		StringBuilder sb = new StringBuilder();
		for (String s : strs) {
			int len = s.length();
			sb.append(len).append("#").append(s);
		}
		return sb.toString();
	}

    public List<String> decode(String encStr) {
		List<String> l = new ArrayList<>();
		int length = encStr.length();
		int i = 0;
		while (i < length) {
			int j = i;
			while (j < length && encStr.charAt(j) != '#')
				j++;
			int len = Integer.parseInt(encStr.substring(i, j));
			String str = encStr.substring(j + 1, j + 1 + len);
			l.add(str);
			i = j + 1 + len;
		}
		return l;
	}
}
