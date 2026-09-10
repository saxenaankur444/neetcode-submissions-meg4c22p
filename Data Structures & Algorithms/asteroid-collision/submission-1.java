class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int curr : arr) {
            boolean alive = true;
            while (alive && !st.isEmpty() && isOppo(curr, st.peek())) {
                Integer top = st.peek();
                if (Math.abs(curr) > Math.abs(top)) {
                    st.pop();
                } else if (Math.abs(curr) == Math.abs(top)) {
                    alive = false;
                    st.pop();
                } else
                    alive = false;
            }
            if (alive)
                st.push(curr);
        }
        return st.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean isOppo(int curr, Integer peek) {
        return peek > 0 && curr < 0;
    }
}