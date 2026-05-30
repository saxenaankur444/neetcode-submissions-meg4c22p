class Solution {
    public int findDuplicate(int[] arr) {
		for (int n : arr) {
			int index = Math.abs(n) - 1;
			if (arr[index] < 0)
				return Math.abs(n);
			arr[index] *= -1;
		}
		return -1;
	}
}
