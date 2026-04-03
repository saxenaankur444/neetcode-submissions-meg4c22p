class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> m = new HashMap<>();
		for (String str : strs) { // m
			int[] count = new int[26];
			char[] c = str.toCharArray();
			for (int i = 0; i < c.length; i++) { // n
				count[c[i] - 'a']++;
			}
			m.putIfAbsent(Arrays.toString(count), new ArrayList<>());
			m.get(Arrays.toString(count)).add(str);
		}
		return new ArrayList<>(m.values());

	
    }
}
