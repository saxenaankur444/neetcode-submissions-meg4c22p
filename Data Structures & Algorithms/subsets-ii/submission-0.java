class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subsetsII(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void subsetsII(int[] nums, int i, List<Integer> curr, List<List<Integer>> res) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        subsetsII(nums, i + 1, curr, res);
        curr.remove(curr.size() - 1);
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
        subsetsII(nums, i + 1, curr, res);
    }
}
