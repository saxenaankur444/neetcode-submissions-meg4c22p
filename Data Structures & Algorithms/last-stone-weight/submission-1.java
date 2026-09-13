class Solution {
    Queue<Integer> q = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

    public int lastStoneWeight(int[] arr) {
        for (int a : arr) {
            q.add(a);
        }
        while (q.size() > 1) {
            Integer h1 = q.poll();
            Integer h2 = q.poll();
            if (h1 - h2 != 0) {
                q.offer(Math.abs(h1 - h2));
            }
        }
        Integer r = q.poll();
        return r == null ? 0 : r;
    }
}
