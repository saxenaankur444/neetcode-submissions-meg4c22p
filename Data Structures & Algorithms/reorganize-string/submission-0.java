class Solution {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0)
                heap.offer(new int[] {count[i], i});
        }

        int[] prev = null;
        StringBuilder res = new StringBuilder();
        while (!heap.isEmpty() || prev != null) {
            if (heap.isEmpty() && prev != null) {
                return "";
            }
            int[] curr = heap.poll();
            res.append((char) (curr[1] + 'a'));
            curr[0]--;

            if (prev != null) {
                heap.offer(prev);
                prev = null;
            }
            if (curr[0] > 0) {
                prev = curr;
            }
        }
        return res.toString();
    }
}