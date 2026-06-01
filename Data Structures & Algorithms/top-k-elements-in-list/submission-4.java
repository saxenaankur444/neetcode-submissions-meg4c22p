class Solution {
    public int[] topKFrequent(int[] nums, int k) {
		int[] arr = new int[k];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums)
			map.put(i, map.getOrDefault(i, 0) + 1);
		Map<Integer, Integer> xx = map.entrySet().stream()
				.sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
		List<Integer> values = new ArrayList<>(xx.keySet());
		for (int i = 0; i < k; i++)
			arr[i] = values.get(i);
		return arr;
	}
}
