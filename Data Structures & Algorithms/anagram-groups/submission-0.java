class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> res = new HashMap<>();
        for(String s: strs){
                 char[] chars = s.toCharArray();
                  Arrays.sort(chars);
  String sortedstr = new String(chars);

        res.putIfAbsent(sortedstr, new ArrayList());
            res.get(sortedstr).add(s);
        } 
        return new ArrayList(res.values());
    }
}
