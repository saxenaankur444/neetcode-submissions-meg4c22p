class Solution {
	public int search(int[] arr, int target) {
		int l = 0, r = arr.length - 1;
		while (l < r) {
			int m = l + (r - l) / 2;
			if (arr[m] > arr[r])
				l = m + 1;
			else
				r = m;
		}
		int pivot = r;

		int res = binarySearch(arr, target, 0, pivot);
		if (res != -1)
			return res;
		return binarySearch(arr, target, pivot, arr.length - 1);
	}

	public int binarySearch(int[] arr, int target, int left, int right) {
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] >= target)
				right = mid;
			else
				left = mid + 1;
		}
		return (arr[left] == target) ? left : -1;
	}

}
