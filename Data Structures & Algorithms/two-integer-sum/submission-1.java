class Solution {
    public int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(target - arr[i])) {
				return new int[] { (Integer) map.get(target - arr[i]), i };
			} else {
				map.put(arr[i], i);
			}
		}
		return new int[] { 0 };
	
    }
}
