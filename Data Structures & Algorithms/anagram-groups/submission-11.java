class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
		Map<String, List<String>> map = new HashMap<>();
		for (String s : strs) {
			int[] arr = new int[26];
			for (char c : s.toCharArray())
				arr[c - 'a']++;
			String ns = new String(Arrays.toString(arr));
			map.putIfAbsent(ns, new ArrayList<>());
			map.get(ns).add(s);
		}
		return new ArrayList<>(map.values());
    }
}
