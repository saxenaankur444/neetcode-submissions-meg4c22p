class Solution {
    public int[] productExceptSelf(int[] arr) {
        
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int product = 1;
			for (int j = 0; j < arr.length; j++) {
				if (i != j)
					product *= arr[j];
			}
			res[i] = product;
		}
		return res;
	
    }
}  
