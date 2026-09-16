class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, target, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(
        int[] nums, int index, int remaining, List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (remaining < 0 || index >= nums.length)
            return;
        current.add(nums[index]);
        backtrack(nums, index, remaining - nums[index], current, result);
        current.remove(current.size() - 1);
        backtrack(nums, index + 1, remaining, current, result);
    }
}
