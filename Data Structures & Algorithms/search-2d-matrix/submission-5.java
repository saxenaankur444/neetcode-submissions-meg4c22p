class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        int l = 0, r = (ROWS * COLS) - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int mid_row = m / COLS;
            int mid_col = m % COLS;
            if (matrix[mid_row][mid_col] < target)
                l = m + 1;
            else if (matrix[mid_row][mid_col] > target) {
                r = m - 1;
            } else
                return true;
        }
        return false;
    }
}
