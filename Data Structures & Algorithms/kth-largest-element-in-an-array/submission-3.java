class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int n : nums) {
            if (!q.isEmpty()) {
                q.offer(n);
                if (q.size() > k) {
                    q.poll();
                }
            } else
                q.offer(n);
        }
        return !q.isEmpty() ? q.peek() : 0;
    }
}
