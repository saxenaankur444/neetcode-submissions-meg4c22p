class Solution {
    public int[][] kClosest(int[][] points, int k) {
		PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
		for (int[] p : points) {
			int dist = p[0] * p[0] + p[1] * p[1];
			q.offer(new int[] { dist, p[0], p[1] });
		}
		int res[][] = new int[k][2];
		for (int i = 0; i < k; i++) {
			int[] last = q.poll();
			res[i][0] = last[1];
			res[i][1] = last[2];
		}
		return res;
	}
}
