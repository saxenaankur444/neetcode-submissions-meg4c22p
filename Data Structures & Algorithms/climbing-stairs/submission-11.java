class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] d = new int[n + 1];
        d[1] = 1;
        d[2] = 2;
        for (int j = 3; j <= n; j++) 
            d[j] = d[j - 1] + d[j - 2];
        return d[n];
    }
}
