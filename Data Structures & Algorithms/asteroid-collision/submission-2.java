class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int curr : arr) {
            boolean isAlive = true;
            while (!st.isEmpty() && willCollide(curr, st.peek()) && isAlive) {
                Integer top = st.peek();
                if (Math.abs(curr) == Math.abs(top)) {
                    isAlive = false;
                    st.pop();
                } else if (Math.abs(curr) > Math.abs(top)) {
                    st.pop();
                } else {
                    isAlive = false;
                }
            }
            if (isAlive)
                st.push(curr);
        }
        return st.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean willCollide(int a, Integer top) {
        return (top > 0 && a < 0);
    }
}