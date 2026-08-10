class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int l = 1;
        int r = Arrays.stream(nums).max().getAsInt();
        int res = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            int hrs = 0;
            for (int i : nums) {
                hrs += Math.ceil((double) i / mid);
            }
            if (hrs <= h) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
