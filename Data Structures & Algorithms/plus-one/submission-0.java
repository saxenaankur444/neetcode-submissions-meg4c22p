class Solution {
    public int[] plusOne(int[] digits) {
        
		boolean carry = true;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i]++;
				carry = false;return digits;
			}
		}
		if (carry) {
			int[] res = new int[digits.length + 1];
			res[0] = 1;
			System.arraycopy(digits, 0, res, 1, digits.length);
			return res;
		}
		return digits;
	
    }
}
