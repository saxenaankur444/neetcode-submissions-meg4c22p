class Solution {
    public boolean isAnagram(String str1, String str2) {
      

		if (str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();

		char arr1[] = str1.toCharArray();

		for (char c : arr1) {
			hmap1.put(c, hmap1.getOrDefault(c, 0) + 1);
		}
		for (char c : str2.toCharArray()) {
			if (!hmap1.containsKey(c)) {
				return false; // If a character is not found in the hashmap, it's not an anagram
			}
			int count = hmap1.get(c);
			if (count == 1) {
				hmap1.remove(c); // Remove character if count is 1
			} else {
				hmap1.put(c, count - 1); // Decrement count otherwise
			}
		}

		return hmap1.isEmpty();
	
    }
}
