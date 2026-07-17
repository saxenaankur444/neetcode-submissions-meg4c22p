class Solution {
    public String longestCommonPrefix(String[] strs) {
        
		String f = strs[0];
		for (int i = 1; i < strs.length; i++) {
			int j = 0;
			while (j < Math.min(f.length(), strs[i].length())) {
				if (f.charAt(j) != strs[i].charAt(j))
					break;
				j++;
			}
			f = f.substring(0, j);
		}
		return f;
	
    }
}