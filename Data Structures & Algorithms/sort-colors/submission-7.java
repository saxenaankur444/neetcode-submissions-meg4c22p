class Solution {
    public void sortColors(int[] nums) {
        int i = 0, l = 0, r = nums.length-1;
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, i, l);
                l++;
            } else if (nums[i] == 2) {
                swap(nums, i, r);
                r--;
                i--;
            }
            i++;
        }
    }
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}