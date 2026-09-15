class Solution {
    public int leastInterval(char[] tasks, int n) {
		int[] count = new int[26];
		for (char t : tasks) {
			count[t - 'A']++;
		}

		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
		for (int c : count) {
			if (c > 0)
				heap.add(c);
		}

		int time = 0;
		Queue<int[]> queue = new LinkedList<>();
		while (!heap.isEmpty() || !queue.isEmpty()) {
			time++;
			if (heap.isEmpty()) {
				time = queue.peek()[1];
			} else {
				int cnt = heap.poll() - 1;
				if (cnt > 0) {
					queue.add(new int[] { cnt, time + n });
				}
			}

			if (!queue.isEmpty() && queue.peek()[1] == time) {
				heap.add(queue.poll()[0]);
			}
		}
		return time;
	}
}
