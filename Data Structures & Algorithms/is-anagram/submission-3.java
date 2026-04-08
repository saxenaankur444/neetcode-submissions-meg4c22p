class Solution {
    public boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;
		int[] count = new int[128];
		for (char c : s.toCharArray())
			count[c - 'A']++;
		for (char c : t.toCharArray())
			count[c - 'A']--;
		for (int i : count)
			if (i != 0)
				return false;
		return true;
	
    }
}
