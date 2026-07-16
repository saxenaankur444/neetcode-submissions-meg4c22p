class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
		int l = 0, r = matrix.length - 1;
		int rowlen = matrix[0].length;
		int focusRow = -1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (matrix[m][0] <= target && target <= matrix[m][rowlen - 1]) {
				focusRow = m;
				break;
			} else if (matrix[m][0] < target)
				l = m + 1;
			else
				r = m - 1;
		}
		if (focusRow == -1)
			return false;
		int[] innerMatrix = matrix[focusRow];
		int ll = 0;
		int rr = innerMatrix.length - 1;
		while (ll <= rr) {
			int mm = (ll + rr) / 2;
			if (innerMatrix[mm] == target)
				return true;
			else if (innerMatrix[mm] < target)
				ll = mm + 1;
			else
				rr = mm - 1;
		}
		return false;
	}
}
