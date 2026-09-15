class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0, t = 0;
        for (int b : bills) {
            if (b == 5) {
                f++;
            } else if (b == 10) {
                t++;
                if (f >= 1)
                    f--;
                else
                    return false;
            } else {
                if (f >= 1 && t >= 1) {
                    f--;
                    t--;
                } else if (f >= 3) {
                    f -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}