class Solution {
    public int jump(int[] nums) {
        int mr = 0;
        int count = 0;
        int cur = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            mr = Math.max(mr, i + nums[i]);
            if (i == cur) {
                count++;
                cur = mr;
                if (cur >= nums.length - 1)
                    return count;
            }
        }
        return 0;
    }
}
