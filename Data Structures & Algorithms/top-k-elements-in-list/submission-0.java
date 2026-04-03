class Solution {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> m = new HashMap<>();
		for (int num : nums) {
			m.put(num, m.getOrDefault(num, 0) + 1);
		}
		System.out.println(m);
		List<int[]> arr = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			arr.add(new int[] { entry.getValue(), entry.getKey() });
		}
		System.out.println();
		for (int[] i : arr) {
			System.out.println(i[0] + " " + i[1]);
		}
		arr.sort((a, b) -> -(a[0] - b[0]));
		System.out.println();
		for (int[] i : arr) {
			System.out.println(i[0] + " " + i[1]);
		}
		int[] arr2 = new int[k];
		for (int i = 0; i < k; i++) {
			arr2[i] = arr.get(i)[1];
		}
		System.out.println("f");
		return arr2;
	}
}
