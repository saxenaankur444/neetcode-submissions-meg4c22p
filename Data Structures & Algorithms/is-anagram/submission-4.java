class Solution {
    public boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;
		int[] count = new int[128];
		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();
		for (int i = 0; i < sc.length; i++) {
			count[sc[i]]++;
			count[tc[i]]--;
		}
		for (int i : count) {
			if (i > 0)
				return false;
		}
		return true;
	
    }
}
