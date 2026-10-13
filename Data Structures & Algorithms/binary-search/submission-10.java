class Solution {
    public int search(int[] nums, int target) {
        return bs(0, nums.length - 1, nums, target);
    }

    private int bs(int l, int r, int[] nums, int target) {
        if (l > r)
            return -1;
        int mid = l + (r - l) / 2;
        if (nums[mid] == target)
            return mid;
        return (nums[mid] < target) ? bs(mid + 1, r, nums, target) : bs(l, mid - 1, nums, target);
    }
}
