class Solution {
    public int rob(int[] nums) {
        int r1 = 0, r2 = 0;
        for (int n : nums) {
            int t = Math.max(n + r1, r2);
            r1 = r2;
            r2 = t;
        }
        return r2;
    }
}
