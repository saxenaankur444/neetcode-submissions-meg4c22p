class Solution {
    public int lengthOfLongestSubstring(String s) {
		int l = 0;
		int res = 0;
		HashMap<Character, Integer> m = new HashMap<>();
		for (int r = 0; r < s.length(); r++) {
			if (m.containsKey(s.charAt(r)))
				l = Math.max(l, m.get(s.charAt(r)) + 1);
			m.put(s.charAt(r), r);
			res = Math.max(res, r - l + 1);
		}
		return res;
	}
}