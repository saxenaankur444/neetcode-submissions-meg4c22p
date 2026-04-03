class Solution {
    public int longestConsecutive(int[] nums) {
        
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		System.out.println(set);
		int res = 0;
		for (int num : nums) {
			int streak = 0;
			int curr = num;
			while (set.contains(curr)) {
				streak++;
				curr++;
			}
			if (res < streak)
				res = streak;
		}
		return res;
	
    }
}
