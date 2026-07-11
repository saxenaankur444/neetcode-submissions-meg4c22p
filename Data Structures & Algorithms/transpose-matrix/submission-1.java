class Solution {
    public int[][] transpose(int[][] matrix) {
		int rcount = matrix.length;
		int ccount = matrix[0].length;
		int[][] res = new int[ccount][rcount];
		for (int r = 0; r < rcount; r++)
			for (int c = 0; c < ccount; c++)
				res[c][r] = matrix[r][c];
		return res;
	}
}