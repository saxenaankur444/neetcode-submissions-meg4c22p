class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        m(nums, 0, new ArrayList<>(), target, res);
        return res;
    }
    private static void m(
        int[] nums, int start, List<Integer> curr, int rem, List<List<Integer>> res) {
        if (rem == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;
            if (rem < nums[i])
                break;
            curr.add(nums[i]);
            m(nums, i + 1, curr, rem - nums[i], res);
            curr.remove(curr.size() - 1);
        }
    }
}
