class Solution {
    public int findDuplicate(int[] arr) {
        
		Set s = new HashSet<>();
		for (int i : arr) {
			if (!s.add(i))
				return i;
		}
		return -1;
	
    }
}
