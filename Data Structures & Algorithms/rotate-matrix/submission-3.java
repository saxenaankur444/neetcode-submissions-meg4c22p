class Solution {
    public void rotate(int[][] matrix) {
        
		int n = matrix.length;
		for (int r = 0; r < n; r++) {
			for (int c = r + 1; c < n; c++) {
				int temp = matrix[r][c];
				matrix[r][c] = matrix[c][r];
				matrix[c][r] = temp;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			int l = 0, r = n - 1;
			while (l < r) {
				int temp = matrix[i][l];
				matrix[i][l] = matrix[i][r];
				matrix[i][r] = temp;
				l++;
				r--;
			}
		}
    }
}
