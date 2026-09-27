class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = target - numbers[i];
            if (m.containsKey(diff))
                return new int[] {m.get(diff) + 1, i + 1};
            else {
                m.put(numbers[i], i);
            }
        }
        return new int[] {-1};
    }
}
