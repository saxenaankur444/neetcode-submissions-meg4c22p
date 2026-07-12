class Solution {
    public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if (m.containsKey(numbers[i]))
				return new int[] { m.get(numbers[i]) + 1, i + 1 };
			m.put(target - numbers[i], i);
		}
		return new int[] {};
	}
}
