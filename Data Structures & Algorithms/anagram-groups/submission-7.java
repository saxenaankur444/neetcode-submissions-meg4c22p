class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
            
		HashMap<String, List<String>> m = new HashMap<>();
		for (String s : arr) {
			int[] count = new int[128];
			for (char c : s.toCharArray())
				count[c - 'A']++;
			m.putIfAbsent(Arrays.toString(count), new ArrayList<>());
			m.get(Arrays.toString(count)).add(s);
		}
		return m.values().stream().toList();
	
    }
}
