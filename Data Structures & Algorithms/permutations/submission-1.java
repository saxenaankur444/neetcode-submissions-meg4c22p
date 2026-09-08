class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        p(nums, new boolean[nums.length], new ArrayList<>(), res);
        return res;
    }

	private void p(int[] nums, boolean[] read, List<Integer> curr, List<List<Integer>> res) {
		if (curr.size() == nums.length) {
			res.add(new ArrayList<>(curr));
			return;
		}
		for (int j = 0; j < nums.length; j++) {
			if (read[j])
				continue;
			curr.add(nums[j]);
			read[j] = true;
			p(nums, read, curr, res);
			curr.remove(curr.size() - 1);
			read[j] = false;
		}
	}

}
