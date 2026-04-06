public class Solution {
    public int findMin(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		int res = arr[r];
		while (l <= r) {
			if (arr[l] < arr[r]) {
				res = Math.min(res, arr[l]);
				break;
			}
			int m = l + (r - l) / 2;
			if (arr[l] > arr[m])
				r = m - 1;
			else
				l = m + 1;
			res = Math.min(res, arr[m]);
		}
		return res;
	}
}