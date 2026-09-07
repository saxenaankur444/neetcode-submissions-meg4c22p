class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        b3(nums, new boolean[nums.length], new ArrayList<>(), res);
        return res;
    }

    private void b3(int[] nums, boolean[] read, List<Integer> curr, List<List<Integer>> res) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (read[i])
                continue;
            curr.add(nums[i]);
            read[i] = true;
            b3(nums, read, curr, res);
            curr.remove(curr.size() - 1);
            read[i] = false;
        }
    }
}
