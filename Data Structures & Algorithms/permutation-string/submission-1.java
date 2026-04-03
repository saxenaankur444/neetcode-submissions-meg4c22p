class Solution {
    public boolean checkInclusion(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		System.out.println(c1);
		for (int i = 0; i <= s2.length(); i++) {
			for (int j = i; j <= s2.length(); j++) {
				char[] c2 = s2.substring(i, j).toCharArray();
				Arrays.sort(c2);
				System.out.println(c2);
				if (Arrays.equals(c1, c2))
					return true;
			}
		}
		return false;
	 }
}
