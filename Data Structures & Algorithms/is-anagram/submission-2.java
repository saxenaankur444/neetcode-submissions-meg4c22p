class Solution {
    public boolean isAnagram(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		if (c1.length != c2.length)
			return false;
		Map<Character, Integer> m1 = new HashMap<>();
		Map<Character, Integer> m2 = new HashMap<>();
		for (int i = 0; i < c1.length; i++) {
			m1.put(s1.charAt(i), m1.getOrDefault(s1.charAt(i), 0) + 1);
			m2.put(s2.charAt(i), m2.getOrDefault(s2.charAt(i), 0) + 1);
		}
		System.out.println(m1 + " : " + m2);
		if (m1.equals(m2))
			return true;
		return false;

    }
}
