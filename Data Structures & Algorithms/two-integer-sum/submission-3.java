class Solution {
    public int[] twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int diff = target - arr[i];
			if (m.containsKey(diff))
				return new int[] { m.get(diff), i };
			m.put(arr[i], i);
		}
		return new int[] { -1 };
	}
}
