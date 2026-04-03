class Solution {
    public boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length())
			return false;
		Map<Character, Integer> m1 = new HashMap<>();
		Map<Character, Integer> m2 = new HashMap<>();
		int l = 0;
		for (char c : s1.toCharArray())
			m1.put(c, m1.getOrDefault(c, 0) + 1);
		for (int r = 0; r < s2.length(); r++) {
			m2.put(s2.charAt(r), m2.getOrDefault(s2.charAt(r), 0) + 1);
			if ((r - l + 1) > s1.length()) {
				m2.put(s2.charAt(l), m2.get(s2.charAt(l)) - 1);
				l++;
			}
			if (checkEquality(m1, m2))
				return true;
		}
		return false;
	}

	private static boolean checkEquality(Map<Character, Integer> m1, Map<Character, Integer> m2) {
		Set<Character> ks = m1.keySet();
		for (Character k : ks) {
			if (!m1.get(k).equals(m2.get(k)))
				return false;
		}
		return true;
	}
}