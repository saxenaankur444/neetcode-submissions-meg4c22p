class Solution {
    public boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length())
			return false;
		int[] c1 = new int[26];
		int[] c2 = new int[26];
		int l = 0;
		for (char c : s1.toCharArray())
			c1[c - 'a']++;
		for (int r = 0; r < s2.length(); r++) {
			c2[s2.charAt(r) - 'a']++;
			if ((r - l + 1) > s1.length()) {
				c2[s2.charAt(l) - 'a']--;
				l++;
			}
			if (Arrays.equals(c1, c2))
				return true;
		}
		return false;
	 }
}
