class Solution {
    public int lastStoneWeight(int[] nums) {
        
		PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
		for (int n : nums) {
			q.offer(n);
		}
		while (q.size() >= 2) {
			int a = q.poll();
			int b = q.poll();
			if (a != b)
				q.offer(Math.abs(a - b));
		}
		return !q.isEmpty() ? q.peek() : 0;
	
    }
}
