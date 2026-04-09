class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int a : arr)
			map.put(a, map.getOrDefault(a, 0) + 1);
		List<int[]> l = new ArrayList<>();

		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			l.add(new int[] { e.getValue(), e.getKey() });
		}
		l.sort((a, b) -> b[0] - a[0]);
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = l.get(i)[1];
		}
		return res;
	
    }
}
