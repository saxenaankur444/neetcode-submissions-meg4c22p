class Solution {
    public String mergeAlternately(String word1, String word2) {
		StringBuilder res = new StringBuilder();
		int n1 = word1.length();
		int n2 = word2.length();
		int minLen = Math.min(n1, n2);
		for (int i = 0; i < minLen; i++) {
			res.append(word1.charAt(i)).append(word2.charAt(i));
		}
		if (n1 > minLen)
			res.append(word1.substring(minLen));
		else
			res.append(word2.substring(minLen));
		return res.toString();
	}
}